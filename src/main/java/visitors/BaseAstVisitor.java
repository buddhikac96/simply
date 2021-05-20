package visitors;

import ast.*;

import static ast.ArithmeticExpressionNode.*;
import static ast.AssignmentStatementNode.ArrayVariableAssignmentStatementNode;
import static ast.AssignmentStatementNode.PrimitiveVariableAssignmentStatementNode;
import static ast.FunctionDeclarationNode.FunctionSignatureNode;
import static ast.IfStatementNode.ElseBlockNode;
import static ast.IfStatementNode.IfBlockNode;
import static ast.IterateStatementNode.IterateConditionExpressionNode.*;
import static ast.LiteralExpressionNode.*;
import static ast.LogicExpressionNode.*;
import static ast.UnaryExpressionNode.*;

public abstract class BaseAstVisitor<T> {
    public abstract T visit(ArgNode node);
    public abstract T visit(AdditionExpressionNode node);
    public abstract T visit(DivisionExpressionNode node);
    public abstract T visit(ModulusExpressionNode node);
    public abstract T visit(MultiplicationExpressionNode node);
    public abstract T visit(SubtractionExpressionNode node);
    public abstract T visit(ArrayAccessExpressionNode node);
    public abstract T visit(ArrayInitializationNode node);
    public abstract T visit(ArrayVariableDeclarationNode node);
    public abstract T visit(ArrayVariableAssignmentStatementNode node);
    public abstract T visit(PrimitiveVariableAssignmentStatementNode node);
    public abstract T visit(BlockNode node);
    public abstract T visit(CompilationUnitNode node);
    public abstract T visit(EmptyArrayInitializationNode node);
    public abstract T visit(FunctionCallExpressionNode node);
    public abstract T visit(FunctionCallStatementNode node);
    public abstract T visit(FunctionDeclarationNode node);
    public abstract T visit(FunctionSignatureNode node);
    public abstract T visit(FunctionDeclarationNodeList node);
    public abstract T visit(GlobalVariableDeclarationNodeList node);
    public abstract T visit(IdentifierNode node);
    public abstract T visit(IfStatementNode node);
    public abstract T visit(ElseBlockNode node);
    public abstract T visit(IfBlockNode node);
    public abstract T visit(IterateStatementNode node);
    public abstract T visit(ArrayIterateExpressionNode node);
    public abstract T visit(BooleanIterateExpressionNode node);
    public abstract T visit(RangeIterateExpressionNode node);
    public abstract T visit(LibImportNode node);
    public abstract T visit(LibImportNodeList node);
    public abstract T visit(BoolLiteralExpressionNode node);
    public abstract T visit(CharLiteralExpressionNode node);
    public abstract T visit(FloatLiteralExpressionNode node);
    public abstract T visit(IntegerLiteralExpressionNode node);
    public abstract T visit(StringLiteralExpressionNode node);
    public abstract T visit(AndExpressionNode node);
    public abstract T visit(EqualsExpressionNode node);
    public abstract T visit(GreaterOrEqualThanExpressionNode node);
    public abstract T visit(GreaterThanExpressionNode node);
    public abstract T visit(LessOrEqualThanExpressionNode node);
    public abstract T visit(LessThanExpressionNode node);
    public abstract T visit(NotEqualsExpressionNode node);
    public abstract T visit(OrExpressionNode node);
    public abstract T visit(LoopControlStatementNode node);
    public abstract T visit(NonEmptyArrayInitializationNode node);
    public abstract T visit(PrimitiveVariableDeclarationNode node);
    public abstract T visit(ReturnStatementNode node);
    public abstract T visit(ParenExpressionNode node);
    public abstract T visit(PrefixMinusExpressionNode node);
    public abstract T visit(PrefixNotExpressionNode node);
    public abstract T visit(PrefixPlusExpressionNode node);
    public abstract T visit(NewRangeExpressionNode node);
    public abstract T visit(LogicExpressionNode node);

    //////////////////////////////////////////////////
    //////////////// Symbol Table ////////////////////
    //////////////////////////////////////////////////

    public abstract T enterFunctionDeclaration(FunctionDeclarationNode node);
    public abstract T enterBlockNode(BlockNode node);


}
