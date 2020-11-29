// Generated from /Users/chuanjun.chen/Documents/MyCode/ANTLR4-Action-Examples/expression/src/main/java/org/codingkoala/expression/LabeledExpr_test.g4 by ANTLR 4.8
package org.codingkoala.expression;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledExpr_testParser}.
 */
public interface LabeledExpr_testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabeledExpr_testParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LabeledExpr_testParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExpr_testParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LabeledExpr_testParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeledExpr_testParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(LabeledExpr_testParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeledExpr_testParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(LabeledExpr_testParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LabeledExpr_testParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LabeledExpr_testParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LabeledExpr_testParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LabeledExpr_testParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExpr_testParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(LabeledExpr_testParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExpr_testParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(LabeledExpr_testParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExpr_testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LabeledExpr_testParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExpr_testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LabeledExpr_testParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExpr_testParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(LabeledExpr_testParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExpr_testParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(LabeledExpr_testParser.OpContext ctx);
}