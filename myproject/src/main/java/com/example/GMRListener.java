// Generated from GMR.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GMRParser}.
 */
public interface GMRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GMRParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GMRParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMRParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GMRParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMRParser#iff_expression}.
	 * @param ctx the parse tree
	 */
	void enterIff_expression(GMRParser.Iff_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMRParser#iff_expression}.
	 * @param ctx the parse tree
	 */
	void exitIff_expression(GMRParser.Iff_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMRParser#implies_expression}.
	 * @param ctx the parse tree
	 */
	void enterImplies_expression(GMRParser.Implies_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMRParser#implies_expression}.
	 * @param ctx the parse tree
	 */
	void exitImplies_expression(GMRParser.Implies_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMRParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(GMRParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMRParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(GMRParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMRParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(GMRParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMRParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(GMRParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMRParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(GMRParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMRParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(GMRParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMRParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(GMRParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMRParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(GMRParser.Primary_expressionContext ctx);
}