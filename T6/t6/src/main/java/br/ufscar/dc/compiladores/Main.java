package br.ufscar.dc.compiladores;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("entrada.reclang");
        RecipeLexer lexer = new RecipeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RecipeParser parser = new RecipeParser(tokens);
        ParseTree tree = parser.program();

        // Análise semântica
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        analyzer.visit(tree);

        // Geração de HTML
        HTMLGenerator generator = new HTMLGenerator();
        String html = generator.visit(tree);
        System.out.println(html);
    }
}