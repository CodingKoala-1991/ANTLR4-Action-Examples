// Generated from /Users/chuanjun.chen/Documents/MyCode/ANTLR4-Action-Examples/expression/src/main/java/org/codingkoala/expression/LabeledExpr.g4 by ANTLR 4.8
package org.codingkoala.expression;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledExprParser}.
 */
public interface LabeledExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(LabeledExprParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(LabeledExprParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LabeledExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LabeledExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(LabeledExprParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(LabeledExprParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(LabeledExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(LabeledExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operations}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOperations(LabeledExprParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operations}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOperations(LabeledExprParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(LabeledExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(LabeledExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(LabeledExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(LabeledExprParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(LabeledExprParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(LabeledExprParser.OpContext ctx);
}