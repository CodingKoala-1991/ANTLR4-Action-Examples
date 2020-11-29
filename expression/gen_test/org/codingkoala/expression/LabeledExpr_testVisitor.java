// Generated from /Users/chuanjun.chen/Documents/MyCode/ANTLR4-Action-Examples/expression/src/main/java/org/codingkoala/expression/LabeledExpr_test.g4 by ANTLR 4.8
package org.codingkoala.expression;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExpr_testParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExpr_testVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExpr_testParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LabeledExpr_testParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeledExpr_testParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(LabeledExpr_testParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LabeledExpr_testParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LabeledExpr_testParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExpr_testParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(LabeledExpr_testParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExpr_testParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LabeledExpr_testParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LabeledExpr_testParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(LabeledExpr_testParser.OpContext ctx);
}