// Generated from /home/hackerbuddy/dev/fyp/simply/src/main/grammar/v1/Simply.g4 by ANTLR 4.8

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplyParser}.
 */
public interface SimplyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplyParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimplyParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimplyParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SimplyParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SimplyParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SimplyParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SimplyParser.NumberContext ctx);
}