package br.ufscar.dc.compiladores;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import br.ufscar.dc.compiladores.parser.RecipeLexer;
import br.ufscar.dc.compiladores.parser.RecipeParser;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<String> lexSynErrors = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // Lê todo o conteúdo do arquivo de entrada
        System.out.println("=== Conteúdo do arquivo de entrada ===");
        String fileContent = new String(Files.readAllBytes(Paths.get("entrada.reclang")));
        System.out.println(fileContent);
        System.out.println("======================================");

        // Cria fluxo de caracteres a partir do conteúdo do arquivo
        CharStream input = CharStreams.fromString(fileContent);
        RecipeLexer lexer = new RecipeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Depuração: lista os tokens reconhecidos pelo lexer
        tokens.fill();
        System.out.println("=== Tokens reconhecidos ===");
        for (Token token : tokens.getTokens()) {
            if (token.getType() == Token.EOF)
                break;

            String typeName = getTokenTypeName(token.getType());
            System.out.printf("Linha %02d:%02d %-15s '%s'\n",
                    token.getLine(),
                    token.getCharPositionInLine(),
                    typeName,
                    token.getText().replace("\n", "\\n"));
        }
        System.out.println("===========================");

        // Adiciona listener de erros customizado ao lexer
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                    int line, int charPositionInLine,
                    String msg, RecognitionException e) {
                String errorMsg = String.format("[LEXER] Erro na linha %d:%d - %s", line, charPositionInLine, msg);
                System.err.println(errorMsg);
                lexSynErrors.add(errorMsg);
            }
        });

        RecipeParser parser = new RecipeParser(tokens);

        // Adiciona listener de erros customizado ao parser
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                    int line, int charPositionInLine,
                    String msg, RecognitionException e) {
                String errorMsg = String.format("[PARSER] Erro na linha %d:%d - %s", line, charPositionInLine, msg);
                System.err.println(errorMsg);
                lexSynErrors.add(errorMsg);
            }
        });

        // Inicia parsing a partir da regra 'program'
        ParseTree tree = parser.program();

        // Análise semântica (sempre feita)
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);

        // Geração do HTML a partir da árvore sintática
        HTMLGenerator generator = new HTMLGenerator();
        String html = generator.visit(tree);
        try (FileWriter writer = new FileWriter("saida.html")) {
            writer.write(html);
            System.out.println("HTML gerado com sucesso: saida.html");
        } catch (IOException e) {
            System.err.println("Erro ao escrever arquivo de saída: " + e.getMessage());
        }

        // Debug no console sobre erros semânticos
        System.out.println(">>> Erros semânticos encontrados: " + analyzer.getErros().size());
        for (String e : analyzer.getErros()) {
            System.out.println("   - " + e);
        }

        // Debug no console sobre erros léxicos/sintáticos
        System.out.println(">>> Erros léxicos/sintáticos encontrados: " + lexSynErrors.size());
        for (String e : lexSynErrors) {
            System.out.println("   - " + e);
        }

        // Geração do log.txt com ambos os tipos de erro ou mensagem de sucesso
        List<String> finalLog = new ArrayList<>();

        if (!lexSynErrors.isEmpty()) {
            finalLog.add("Erros léxicos/sintáticos encontrados:");
            finalLog.addAll(lexSynErrors);
            finalLog.add(""); // linha em branco entre seções
        }

        if (!analyzer.getErros().isEmpty()) {
            finalLog.add("Erros semânticos encontrados:");
            finalLog.addAll(analyzer.getErros());
        }

        if (finalLog.isEmpty()) {
            finalLog.add("Análise semântica concluída: nenhum erro encontrado.");
        }

        LogGenerator.gerarLog(finalLog);
    }

    // Mapeia o tipo numérico do token para um nome legível
    private static String getTokenTypeName(int tokenType) {
        switch (tokenType) {
            case RecipeLexer.UNIT:
                return "UNIT";
            case RecipeLexer.ID:
                return "ID";
            case RecipeLexer.INT:
                return "INT";
            case RecipeLexer.NEWLINE:
                return "NEWLINE";
            case RecipeLexer.EOF:
                return "EOF";
            default:
                return "UNKNOWN_" + tokenType;
        }
    }
}
