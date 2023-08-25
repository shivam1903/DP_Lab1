// Generated from com/example/GMR.g4 by ANTLR 4.1
package com.example;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GMRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GMRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GMRParser#iff_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIff_expression(@NotNull GMRParser.Iff_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link GMRParser#or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_expression(@NotNull GMRParser.Or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link GMRParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull GMRParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link GMRParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(@NotNull GMRParser.And_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link GMRParser#implies_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplies_expression(@NotNull GMRParser.Implies_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link GMRParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(@NotNull GMRParser.Unary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link GMRParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(@NotNull GMRParser.Primary_expressionContext ctx);
}