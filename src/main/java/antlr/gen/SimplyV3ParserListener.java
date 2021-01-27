// Generated from /home/hackerbuddy/dev/fyp/simply/grammars/v3/SimplyV3Parser.g4 by ANTLR 4.9.1

package antlr.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplyV3Parser}.
 */
public interface SimplyV3ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(SimplyV3Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(SimplyV3Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#libImport}.
	 * @param ctx the parse tree
	 */
	void enterLibImport(SimplyV3Parser.LibImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#libImport}.
	 * @param ctx the parse tree
	 */
	void exitLibImport(SimplyV3Parser.LibImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SimplyV3Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SimplyV3Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVariableDeclaration(SimplyV3Parser.GlobalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#globalVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVariableDeclaration(SimplyV3Parser.GlobalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SimplyV3Parser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SimplyV3Parser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(SimplyV3Parser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(SimplyV3Parser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#primitiveVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveVariableDeclaration(SimplyV3Parser.PrimitiveVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#primitiveVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveVariableDeclaration(SimplyV3Parser.PrimitiveVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#nonVoidDataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterNonVoidDataTypeName(SimplyV3Parser.NonVoidDataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#nonVoidDataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitNonVoidDataTypeName(SimplyV3Parser.NonVoidDataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SimplyV3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SimplyV3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#arithmaticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmaticExpression(SimplyV3Parser.ArithmaticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#arithmaticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmaticExpression(SimplyV3Parser.ArithmaticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(SimplyV3Parser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(SimplyV3Parser.LogicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(SimplyV3Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(SimplyV3Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(SimplyV3Parser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(SimplyV3Parser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#funcCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpression(SimplyV3Parser.FuncCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#funcCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpression(SimplyV3Parser.FuncCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#funcCallParamList}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallParamList(SimplyV3Parser.FuncCallParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#funcCallParamList}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallParamList(SimplyV3Parser.FuncCallParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#libRef}.
	 * @param ctx the parse tree
	 */
	void enterLibRef(SimplyV3Parser.LibRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#libRef}.
	 * @param ctx the parse tree
	 */
	void exitLibRef(SimplyV3Parser.LibRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SimplyV3Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SimplyV3Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#arrayVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayVariableDeclaration(SimplyV3Parser.ArrayVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#arrayVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayVariableDeclaration(SimplyV3Parser.ArrayVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#arrayIntialization}.
	 * @param ctx the parse tree
	 */
	void enterArrayIntialization(SimplyV3Parser.ArrayIntializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#arrayIntialization}.
	 * @param ctx the parse tree
	 */
	void exitArrayIntialization(SimplyV3Parser.ArrayIntializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#emptyArrayIntialization}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArrayIntialization(SimplyV3Parser.EmptyArrayIntializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#emptyArrayIntialization}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArrayIntialization(SimplyV3Parser.EmptyArrayIntializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#nonEmptyArrayIntialization}.
	 * @param ctx the parse tree
	 */
	void enterNonEmptyArrayIntialization(SimplyV3Parser.NonEmptyArrayIntializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#nonEmptyArrayIntialization}.
	 * @param ctx the parse tree
	 */
	void exitNonEmptyArrayIntialization(SimplyV3Parser.NonEmptyArrayIntializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void enterArrayValues(SimplyV3Parser.ArrayValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#arrayValues}.
	 * @param ctx the parse tree
	 */
	void exitArrayValues(SimplyV3Parser.ArrayValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(SimplyV3Parser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(SimplyV3Parser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(SimplyV3Parser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(SimplyV3Parser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(SimplyV3Parser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(SimplyV3Parser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(SimplyV3Parser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(SimplyV3Parser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(SimplyV3Parser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(SimplyV3Parser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeName(SimplyV3Parser.DataTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#dataTypeName}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeName(SimplyV3Parser.DataTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimplyV3Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimplyV3Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#blockBody}.
	 * @param ctx the parse tree
	 */
	void enterBlockBody(SimplyV3Parser.BlockBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#blockBody}.
	 * @param ctx the parse tree
	 */
	void exitBlockBody(SimplyV3Parser.BlockBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SimplyV3Parser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SimplyV3Parser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SimplyV3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SimplyV3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SimplyV3Parser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SimplyV3Parser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(SimplyV3Parser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(SimplyV3Parser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#ifConditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionExpression(SimplyV3Parser.IfConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#ifConditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionExpression(SimplyV3Parser.IfConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseIfBlock(SimplyV3Parser.ElseIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseIfBlock(SimplyV3Parser.ElseIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(SimplyV3Parser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(SimplyV3Parser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterateStatement(SimplyV3Parser.IterateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterateStatement(SimplyV3Parser.IterateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#iterateConditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterIterateConditionExpression(SimplyV3Parser.IterateConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#iterateConditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitIterateConditionExpression(SimplyV3Parser.IterateConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(SimplyV3Parser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(SimplyV3Parser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#arrayIterateExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayIterateExpression(SimplyV3Parser.ArrayIterateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#arrayIterateExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayIterateExpression(SimplyV3Parser.ArrayIterateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#loopControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopControlStatement(SimplyV3Parser.LoopControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#loopControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopControlStatement(SimplyV3Parser.LoopControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(SimplyV3Parser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(SimplyV3Parser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(SimplyV3Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(SimplyV3Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#funcCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallStatement(SimplyV3Parser.FuncCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#funcCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallStatement(SimplyV3Parser.FuncCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#returnStatemtnt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatemtnt(SimplyV3Parser.ReturnStatemtntContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#returnStatemtnt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatemtnt(SimplyV3Parser.ReturnStatemtntContext ctx);
}