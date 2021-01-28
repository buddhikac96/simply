// Generated from /home/hackerbuddy/dev/fyp/simply/grammars/v3/SimplyV3Parser.g4 by ANTLR 4.9.1

package antlr.gen;

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
	 * Visit a parse tree produced by {@link SimplyV3Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SimplyV3Parser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVariableDeclaration(SimplyV3Parser.GlobalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SimplyV3Parser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(SimplyV3Parser.ConstantDeclarationContext ctx);
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
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link SimplyV3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(SimplyV3Parser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixPlusExpression}
	 * labeled alternative in {@link SimplyV3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixPlusExpression(SimplyV3Parser.PrefixPlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixMinusExpression}
	 * labeled alternative in {@link SimplyV3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixMinusExpression(SimplyV3Parser.PrefixMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixNotExpression}
	 * labeled alternative in {@link SimplyV3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixNotExpression(SimplyV3Parser.PrefixNotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link SimplyV3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(SimplyV3Parser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpression}
	 * labeled alternative in {@link SimplyV3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(SimplyV3Parser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAccessExpression}
	 * labeled alternative in {@link SimplyV3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessExpression(SimplyV3Parser.ArrayAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(SimplyV3Parser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(SimplyV3Parser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#funcCallParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallParamList(SimplyV3Parser.FuncCallParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#libRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibRef(SimplyV3Parser.LibRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SimplyV3Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SimplyV3Parser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link SimplyV3Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(SimplyV3Parser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLiteral}
	 * labeled alternative in {@link SimplyV3Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(SimplyV3Parser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charLiteral}
	 * labeled alternative in {@link SimplyV3Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(SimplyV3Parser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SimplyV3Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SimplyV3Parser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arrayVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariableDeclaration(SimplyV3Parser.ArrayVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arrayIntialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIntialization(SimplyV3Parser.ArrayIntializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#emptyArrayIntialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArrayIntialization(SimplyV3Parser.EmptyArrayIntializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#nonEmptyArrayIntialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyArrayIntialization(SimplyV3Parser.NonEmptyArrayIntializationContext ctx);
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
	 * Visit a parse tree produced by {@link SimplyV3Parser#ifConditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditionExpression(SimplyV3Parser.IfConditionExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link SimplyV3Parser#iterateConditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterateConditionExpression(SimplyV3Parser.IterateConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(SimplyV3Parser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arrayIterateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIterateExpression(SimplyV3Parser.ArrayIterateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#loopControlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopControlStatement(SimplyV3Parser.LoopControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(SimplyV3Parser.AssignmentStatementContext ctx);
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