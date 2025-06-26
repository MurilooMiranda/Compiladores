// Generated from /home/daniel/DANIEL/BCC/Compilas/T6/t6/src/main/antlr4/br/ufscar/dc/compiladores/Recipe.g4 by ANTLR 4.13.1
package br.ufscar.dc.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RecipeParser}.
 */
public interface RecipeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RecipeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RecipeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RecipeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipeParser#ingredients}.
	 * @param ctx the parse tree
	 */
	void enterIngredients(RecipeParser.IngredientsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipeParser#ingredients}.
	 * @param ctx the parse tree
	 */
	void exitIngredients(RecipeParser.IngredientsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipeParser#ingredient}.
	 * @param ctx the parse tree
	 */
	void enterIngredient(RecipeParser.IngredientContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipeParser#ingredient}.
	 * @param ctx the parse tree
	 */
	void exitIngredient(RecipeParser.IngredientContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipeParser#steps}.
	 * @param ctx the parse tree
	 */
	void enterSteps(RecipeParser.StepsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipeParser#steps}.
	 * @param ctx the parse tree
	 */
	void exitSteps(RecipeParser.StepsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RecipeParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(RecipeParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link RecipeParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(RecipeParser.StepContext ctx);
}