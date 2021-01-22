// Generated from /home/hackerbuddy/dev/fyp/simply/grammars/v3/SimplyV3Parser.g4 by ANTLR 4.8

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimplyV3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimplyV3ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(SimplyV3Parser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#libImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibImport(SimplyV3Parser.LibImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SimplyV3Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#primitiveVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveVariableDeclaration(SimplyV3Parser.PrimitiveVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#nonVoidDataTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonVoidDataTypeName(SimplyV3Parser.NonVoidDataTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SimplyV3Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arithmaticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmaticExpression(SimplyV3Parser.ArithmaticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpression(SimplyV3Parser.LogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(SimplyV3Parser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(SimplyV3Parser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#funcCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpression(SimplyV3Parser.FuncCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#libRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibRef(SimplyV3Parser.LibRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SimplyV3Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arrayVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariableDeclaration(SimplyV3Parser.ArrayVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(SimplyV3Parser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#emptyArrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArrayDeclaration(SimplyV3Parser.EmptyArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#nonEmptyArrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyArrayDeclaration(SimplyV3Parser.NonEmptyArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arrayValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValues(SimplyV3Parser.ArrayValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arrayValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(SimplyV3Parser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(SimplyV3Parser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(SimplyV3Parser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(SimplyV3Parser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(SimplyV3Parser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#dataTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeName(SimplyV3Parser.DataTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SimplyV3Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#blockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockBody(SimplyV3Parser.BlockBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(SimplyV3Parser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SimplyV3Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SimplyV3Parser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(SimplyV3Parser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpression(SimplyV3Parser.ConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#elseIfBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfBlock(SimplyV3Parser.ElseIfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(SimplyV3Parser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#iterateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterateStatement(SimplyV3Parser.IterateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#loopExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopExpression(SimplyV3Parser.LoopExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(SimplyV3Parser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arrayLoopExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLoopExpression(SimplyV3Parser.ArrayLoopExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#loopControlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopControlStatement(SimplyV3Parser.LoopControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SimplyV3Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(SimplyV3Parser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#funcCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallStatement(SimplyV3Parser.FuncCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#returnStatemtnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatemtnt(SimplyV3Parser.ReturnStatemtntContext ctx);
}