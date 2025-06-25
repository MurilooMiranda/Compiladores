// Generated from /home/daniel/DANIEL/BCC/Compilas/T6/t6/src/main/antlr4/br/ufscar/dc/compiladores/Recipe.g4 by ANTLR 4.13.1
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RecipeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RecipeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RecipeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RecipeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipeParser#ingredients}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngredients(RecipeParser.IngredientsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipeParser#ingredient}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngredient(RecipeParser.IngredientContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipeParser#steps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSteps(RecipeParser.StepsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RecipeParser#step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStep(RecipeParser.StepContext ctx);
}