package br.ufscar.dc.compiladores;

import br.ufscar.dc.compiladores.parser.RecipeBaseVisitor;
import br.ufscar.dc.compiladores.parser.RecipeParser;
import br.ufscar.dc.compiladores.parser.RecipeParser.*;

public class SemanticAnalyzer extends RecipeBaseVisitor<Void> {
    @Override
    public Void visitProgram(RecipeParser.ProgramContext ctx) {
        // Verificar se tem ingredientes
        if (ctx.ingredients() == null || ctx.ingredients().ingredient().isEmpty()) {
            System.err.println("Erro semântico: receita sem ingredientes.");
        }
        
        // Verificar se tem passos
        if (ctx.steps() == null || ctx.steps().step().isEmpty()) {
            System.err.println("Erro semântico: receita sem modo de preparo.");
        }
        
        return null;
    }
}