// Generated from /home/hackerbuddy/dev/fyp/simply/src/main/grammar/v1/Simply.g4 by ANTLR 4.8

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimplyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimplyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimplyParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SimplyParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(SimplyParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(SimplyParser.NumberContext ctx);
}