package br.ufscar.dc.compiladores;

import br.ufscar.dc.compiladores.RecipeParser.*;
import br.ufscar.dc.compiladores.RecipeBaseVisitor;


public class HTMLGenerator extends RecipeBaseVisitor<String> {
    @Override
    public String visitProgram(ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("<h1>").append(ctx.ID().getText()).append("</h1>\n");
        sb.append("<h2>Ingredientes</h2>\n<ul>\n");
        for (IngredientContext ingredient : ctx.ingredients().ingredient()) {
            sb.append("  <li>")
              .append(ingredient.INT().getText()).append(" ")
              .append(ingredient.UNIT().getText()).append(" ")
              .append(ingredient.ID().getText()).append("</li>\n");
        }
        sb.append("</ul>\n<h2>Modo de preparo</h2>\n<ol>\n");
        for (StepContext step : ctx.steps().step()) {
            sb.append("  <li>")
              .append(step.getText().trim()).append("</li>\n");
        }
        sb.append("</ol>");
        return sb.toString();
    }
}