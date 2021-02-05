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
	 * Visit a parse tree produced by the {@code variableDeclarationRule}
	 * labeled alternative in {@link SimplyV3Parser#elementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationRule(SimplyV3Parser.VariableDeclarationRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDeclarationRule}
	 * labeled alternative in {@link SimplyV3Parser#elementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarationRule(SimplyV3Parser.ConstantDeclarationRuleContext ctx);
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
	 * Visit a parse tree produced by the {@code variableAccessExpression}
	 * labeled alternative in {@link SimplyV3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccessExpression(SimplyV3Parser.VariableAccessExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code emptyArrayInitialization}
	 * labeled alternative in {@link SimplyV3Parser#arrayIntialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArrayInitialization(SimplyV3Parser.EmptyArrayInitializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonEmptyArrayInitialization}
	 * labeled alternative in {@link SimplyV3Parser#arrayIntialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyArrayInitialization(SimplyV3Parser.NonEmptyArrayInitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#emptyArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArr(SimplyV3Parser.EmptyArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#nonEmptyArr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyArr(SimplyV3Parser.NonEmptyArrContext ctx);
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
	 * Visit a parse tree produced by the {@code ifStatementRule}
	 * labeled alternative in {@link SimplyV3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementRule(SimplyV3Parser.IfStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterateStatementRule}
	 * labeled alternative in {@link SimplyV3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterateStatementRule(SimplyV3Parser.IterateStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatementRule}
	 * labeled alternative in {@link SimplyV3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatementRule(SimplyV3Parser.AssignmentStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallStatementRule}
	 * labeled alternative in {@link SimplyV3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallStatementRule(SimplyV3Parser.FuncCallStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatemtntRule}
	 * labeled alternative in {@link SimplyV3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatemtntRule(SimplyV3Parser.ReturnStatemtntRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclarationStatementRule}
	 * labeled alternative in {@link SimplyV3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatementRule(SimplyV3Parser.VariableDeclarationStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDeclarationStatementRule}
	 * labeled alternative in {@link SimplyV3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarationStatementRule(SimplyV3Parser.ConstantDeclarationStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopControlStatementRule}
	 * labeled alternative in {@link SimplyV3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopControlStatementRule(SimplyV3Parser.LoopControlStatementRuleContext ctx);
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
	 * Visit a parse tree produced by the {@code booleanIterateExpressionRule}
	 * labeled alternative in {@link SimplyV3Parser#iterateConditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanIterateExpressionRule(SimplyV3Parser.BooleanIterateExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeIterateExpressionRule}
	 * labeled alternative in {@link SimplyV3Parser#iterateConditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeIterateExpressionRule(SimplyV3Parser.RangeIterateExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayIterateExpressionRule}
	 * labeled alternative in {@link SimplyV3Parser#iterateConditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIterateExpressionRule(SimplyV3Parser.ArrayIterateExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(SimplyV3Parser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#fromExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromExpression(SimplyV3Parser.FromExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#toExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToExpression(SimplyV3Parser.ToExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code primitiveVariableAssignmentRule}
	 * labeled alternative in {@link SimplyV3Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveVariableAssignmentRule(SimplyV3Parser.PrimitiveVariableAssignmentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVariableAssignmentRule}
	 * labeled alternative in {@link SimplyV3Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariableAssignmentRule(SimplyV3Parser.ArrayVariableAssignmentRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#primitiveVariableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveVariableAssignment(SimplyV3Parser.PrimitiveVariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimplyV3Parser#arrayVariableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVariableAssignment(SimplyV3Parser.ArrayVariableAssignmentContext ctx);
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