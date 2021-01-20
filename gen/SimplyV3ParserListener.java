// Generated from /home/hackerbuddy/dev/fyp/simply/src/main/grammar/v3/SimplyV3Parser.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link SimplyV3Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(SimplyV3Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(SimplyV3Parser.FuncCallContext ctx);
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
	 * Enter a parse tree produced by {@link SimplyV3Parser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(SimplyV3Parser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(SimplyV3Parser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#emptyArrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArrayDeclaration(SimplyV3Parser.EmptyArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#emptyArrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArrayDeclaration(SimplyV3Parser.EmptyArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimplyV3Parser#nonEmptyArrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNonEmptyArrayDeclaration(SimplyV3Parser.NonEmptyArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#nonEmptyArrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNonEmptyArrayDeclaration(SimplyV3Parser.NonEmptyArrayDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link SimplyV3Parser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpression(SimplyV3Parser.ConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpression(SimplyV3Parser.ConditionExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link SimplyV3Parser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void enterLoopExpression(SimplyV3Parser.LoopExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#loopExpression}.
	 * @param ctx the parse tree
	 */
	void exitLoopExpression(SimplyV3Parser.LoopExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link SimplyV3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SimplyV3Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplyV3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SimplyV3Parser.AssignmentContext ctx);
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