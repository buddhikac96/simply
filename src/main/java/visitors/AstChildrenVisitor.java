package visitors;

import ast.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static ast.ArithmeticExpressionNode.*;
import static ast.AssignmentStatementNode.*;
import static ast.FunctionDeclarationNode.*;
import static ast.IfStatementNode.ElseBlockNode;
import static ast.IfStatementNode.IfBlockNode;
import static ast.IterateStatementNode.IterateConditionExpressionNode.*;
import static ast.LiteralExpressionNode.*;
import static ast.LogicExpressionNode.*;
import static ast.UnaryExpressionNode.*;

public class AstChildrenVisitor extends BaseAstVisitor<List<ASTNode>>{
    @Override
    public List<ASTNode> visit(ArgNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(AdditionExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(DivisionExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(ModulusExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(MultiplicationExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(SubtractionExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(ArrayAccessExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(ArrayInitializationNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(ArrayVariableDeclarationNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(ArrayVariableAssignmentStatementNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(PrimitiveVariableAssignmentStatementNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(BlockNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(CompilationUnitNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(EmptyArrayInitializationNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(FunctionCallExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(FunctionCallStatementNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(FunctionDeclarationNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(FunctionSignatureNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(FunctionDeclarationNodeList node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(GlobalVariableDeclarationNodeList node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(IdentifierNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(IfStatementNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(ElseBlockNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(IfBlockNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(IterateStatementNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(ArrayIterateExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(BooleanIterateExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(RangeIterateExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(LibImportNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(LibImportNodeList node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(BoolLiteralExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(CharLiteralExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(FloatLiteralExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(IntegerLiteralExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(StringLiteralExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(AndExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(EqualsExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(GreaterOrEqualThanExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(GreaterThanExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(LessOrEqualThanExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(LessThanExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(NotEqualsExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(OrExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(LoopControlStatementNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(NonEmptyArrayInitializationNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(PrimitiveVariableDeclarationNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(ReturnStatementNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(ParenExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(PrefixMinusExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(PrefixNotExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(PrefixPlusExpressionNode node) {
        return node.getChildren().stream().filter(Objects::nonNull).collect(Collectors.toList());
    }

    @Override
    public List<ASTNode> visit(NewRangeExpressionNode node) {
        return null;
    }

    @Override
    public List<ASTNode> visit(LogicExpressionNode node) {
        return null;
    }

    //////////////////////////////////////////////////
    //////////////// Symbol Table ////////////////////
    //////////////////////////////////////////////////

    @Override
    public List<ASTNode> enterFunctionDeclaration(FunctionDeclarationNode node) {
        return null;
    }

    @Override
    public List<ASTNode> enterBlockNode(BlockNode node) {
        return null;
    }
}
