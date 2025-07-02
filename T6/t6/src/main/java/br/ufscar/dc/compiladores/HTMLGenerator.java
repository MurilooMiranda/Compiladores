package br.ufscar.dc.compiladores;

import br.ufscar.dc.compiladores.parser.RecipeBaseVisitor;
import br.ufscar.dc.compiladores.parser.RecipeParser;
import br.ufscar.dc.compiladores.parser.RecipeParser.*;

public class HTMLGenerator extends RecipeBaseVisitor<String> {
    @Override
    public String visitProgram(RecipeParser.ProgramContext ctx) {
        StringBuilder sb = new StringBuilder();

        // Obter nome da receita
        String rawName = ctx.ID().getText();
        String recipeName = rawName.replaceAll("([a-z])([A-Z])", "$1 $2");

        sb.append("<!DOCTYPE html>\n<html>\n<head>\n<title>")
                .append(recipeName).append("</title>\n</head>\n<body>\n");
        sb.append("<h1>").append(recipeName).append("</h1>\n");

        // Processar ingredientes
        sb.append("<h2>Ingredientes</h2>\n<ul>\n");
        for (RecipeParser.IngredientContext ingredient : ctx.ingredients().ingredient()) {
            String amount = ingredient.INT().getText();
            String unit = ingredient.UNIT().getText();
            String name = ingredient.ID().getText();

            sb.append("  <li>")
                    .append(amount).append(" ")
                    .append(unit).append(" de ")
                    .append(name).append("</li>\n");
        }
        sb.append("</ul>\n");

        // Processar passos
        sb.append("<h2>Modo de preparo</h2>\n<ol>\n");
        for (RecipeParser.StepContext step : ctx.steps().step()) {
            StringBuilder stepText = new StringBuilder();
            for (var child : step.step_line().children) {
                stepText.append(child.getText()).append(" ");
            }
            sb.append("  <li>").append(stepText.toString().trim()).append("</li>\n");
        }

        sb.append("</ol>\n</body>\n</html>");
        return sb.toString();
    }
}