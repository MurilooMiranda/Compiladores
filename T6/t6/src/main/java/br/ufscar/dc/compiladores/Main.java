package br.ufscar.dc.compiladores;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import br.ufscar.dc.compiladores.parser.RecipeLexer;
import br.ufscar.dc.compiladores.parser.RecipeParser;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    private static boolean hasErrors = false;

    public static void main(String[] args) throws Exception {
        // Depuração: exibir conteúdo exato do arquivo
        System.out.println("=== Conteúdo do arquivo de entrada ===");
        String fileContent = new String(Files.readAllBytes(Paths.get("entrada.reclang")));
        System.out.println(fileContent);
        System.out.println("======================================");

        CharStream input = CharStreams.fromString(fileContent);
        RecipeLexer lexer = new RecipeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Depuração: listar todos os tokens gerados
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

        // Adicionar listener de erros ao lexer
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                    int line, int charPositionInLine,
                    String msg, RecognitionException e) {
                System.err.println("[LEXER] Erro na linha " + line + ":" + charPositionInLine + " - " + msg);
                hasErrors = true;
            }
        });

        RecipeParser parser = new RecipeParser(tokens);

        // Adicionar listener de erros ao parser
        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                    int line, int charPositionInLine,
                    String msg, RecognitionException e) {
                System.err.println("[PARSER] Erro na linha " + line + ":" + charPositionInLine + " - " + msg);
                hasErrors = true;
            }
        });

        ParseTree tree = parser.program();

        // Se houve erros, não continue
        if (hasErrors) {
            System.err.println("Compilação interrompida devido a erros.");
            return;
        }

        // Análise semântica
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);

        // Geração de HTML
        HTMLGenerator generator = new HTMLGenerator();
        String html = generator.visit(tree);

        try (FileWriter writer = new FileWriter("saida.html")) {
            writer.write(html);
            System.out.println("HTML gerado com sucesso: saida.html");
        } catch (IOException e) {
            System.err.println("Erro ao escrever arquivo de saída: " + e.getMessage());
        }
    }

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
            // case RecipeLexer.LINE_TEXT:
            //     return "LINE_TEXT";
            case RecipeLexer.EOF:
                return "EOF";
            default:
                return "UNKNOWN_" + tokenType;
        }
    }
}

// Classe para tratamento personalizado de erros
class CustomErrorListener extends BaseErrorListener {
    private boolean hasErrors = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
            int line, int charPositionInLine,
            String msg, RecognitionException e) {
        System.err.println("Erro na linha " + line + ":" + charPositionInLine + " - " + msg);
        hasErrors = true;
    }

    public boolean hasErrors() {
        return hasErrors;
    }
}