package br.ufscar.dc.compiladores;

import br.ufscar.dc.compiladores.RecipeParser.*;
import br.ufscar.dc.compiladores.RecipeBaseVisitor;

public class SemanticAnalyzer extends RecipeBaseVisitor<Void> {
    @Override
    public Void visitProgram(ProgramContext ctx) {
        if (ctx.ingredients().ingredient().isEmpty()) {
            throw new RuntimeException("Erro semântico: receita sem ingredientes.");
        }
        if (ctx.steps().step().isEmpty()) {
            throw new RuntimeException("Erro semântico: receita sem modo de preparo.");
        }
        return null;
    }
}