package br.ufscar.dc.compiladores;

import br.ufscar.dc.compiladores.parser.RecipeBaseVisitor;
import br.ufscar.dc.compiladores.parser.RecipeParser;

import java.util.ArrayList;
import java.util.List;

public class SemanticAnalyzer extends RecipeBaseVisitor<Void> {

    // Lista onde vamos acumular todas as mensagens de erro
    private final List<String> erros = new ArrayList<>();

    // Método público para recuperar essa lista no Main
    public List<String> getErros() {
        return erros;
    }

    @Override
    public Void visitProgram(RecipeParser.ProgramContext ctx) {
        // Se não houver ingredientes, adiciona erro
        if (ctx.ingredients() == null || ctx.ingredients().ingredient().isEmpty()) {
            erros.add("Erro semântico: receita sem ingredientes.");
        }
        // Se não houver passos, adiciona erro
        if (ctx.steps() == null || ctx.steps().step().isEmpty()) {
            erros.add("Erro semântico: receita sem modo de preparo.");
        }
        return null; // não precisamos visitar os filhos aqui
    }
}
