/*
    TODO: Not possible to get line number details in syntax errors. Get context details in to the visitor from ast
 */

package analyzers.syntaxAnalyzer;

import app.bootstrap.LibResourceModalMapper;
import ast.*;
import ast.helper.syntaxErrorHelper.LibResourceModal;
import visitors.BaseAstVisitor;

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

public class SyntaxAnalyzerVisitor extends BaseAstVisitor<String> {

    LibResourceModal libResourceModal;

    public SyntaxAnalyzerVisitor() {
        this.libResourceModal = LibResourceModalMapper.getMap();
    }

    @Override
    public String visit(ArgNode node) {
        return null;
    }

    @Override
    public String visit(AdditionExpressionNode node) {
        return null;
    }

    @Override
    public String visit(DivisionExpressionNode node) {
        return null;
    }

    @Override
    public String visit(ModulusExpressionNode node) {
        return null;
    }

    @Override
    public String visit(MultiplicationExpressionNode node) {
        return null;
    }

    @Override
    public String visit(SubtractionExpressionNode node) {
        return null;
    }

    @Override
    public String visit(ArrayAccessNode node) {
        return null;
    }

    @Override
    public String visit(ArrayAccessExpressionNode node) {
        return null;
    }

    @Override
    public String visit(ArrayInitializationNode node) {
        return null;
    }

    @Override
    public String visit(ArrayVariableDeclarationNode node) {
        return null;
    }

    @Override
    public String visit(ArrayVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public String visit(PrimitiveVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public String visit(BlockNode node) {
        return null;
    }

    @Override
    public String visit(CompilationUnitNode node) {
        return null;
    }

    @Override
    public String visit(EmptyArrayInitializationNode node) {
        return null;
    }

    @Override
    public String visit(FunctionCallExpressionNode node) {
        return null;
    }

    @Override
    public String visit(FunctionCallStatementNode node) {
        return null;
    }

    @Override
    public String visit(FunctionDeclarationNode node) {
        return null;
    }

    @Override
    public String visit(FunctionSignatureNode node) {
        return null;
    }

    @Override
    public String visit(FunctionDeclarationNodeList node) {
        return null;
    }

    @Override
    public String visit(GlobalVariableDeclarationNodeList node) {
        return null;
    }

    @Override
    public String visit(IdentifierNode node) {
        return null;
    }

    @Override
    public String visit(IfStatementNode node) {
        return null;
    }

    @Override
    public String visit(ElseBlockNode node) {
        return null;
    }

    @Override
    public String visit(IfBlockNode node) {
        return null;
    }

    @Override
    public String visit(IterateStatementNode node) {
        return null;
    }

    @Override
    public String visit(ArrayIterateExpressionNode node) {
        return null;
    }

    @Override
    public String visit(BooleanIterateExpressionNode node) {
        return null;
    }

    @Override
    public String visit(RangeIterateExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LibImportNode node) {

        //TODO: Use syntax errors arraylist to append syntax errors
        if(!libResourceModal.getLibAliasNames().contains(node.getLibName())){
            System.out.println("Undefined library import: " + node.getLibName());
        }

        return null;
    }

    @Override
    public String visit(LibImportNodeList node) {
        return null;
    }

    @Override
    public String visit(BoolLiteralExpressionNode node) {
        return null;
    }

    @Override
    public String visit(CharLiteralExpressionNode node) {
        return null;
    }

    @Override
    public String visit(FloatLiteralExpressionNode node) {
        return null;
    }

    @Override
    public String visit(IntegerLiteralExpressionNode node) {
        return null;
    }

    @Override
    public String visit(StringLiteralExpressionNode node) {
        return null;
    }

    @Override
    public String visit(AndExpressionNode node) {
        return null;
    }

    @Override
    public String visit(EqualsExpressionNode node) {
        return null;
    }

    @Override
    public String visit(GreaterOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public String visit(GreaterThanExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LessOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LessThanExpressionNode node) {
        return null;
    }

    @Override
    public String visit(NotEqualsExpressionNode node) {
        return null;
    }

    @Override
    public String visit(OrExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LoopControlStatementNode node) {
        return null;
    }

    @Override
    public String visit(NonEmptyArrayInitializationNode node) {
        return null;
    }

    @Override
    public String visit(PrimitiveVariableDeclarationNode node) {
        return null;
    }

    @Override
    public String visit(ReturnStatementNode node) {
        return null;
    }

    @Override
    public String visit(ParenExpressionNode node) {
        return null;
    }

    @Override
    public String visit(PrefixMinusExpressionNode node) {
        return null;
    }

    @Override
    public String visit(PrefixNotExpressionNode node) {
        return null;
    }

    @Override
    public String visit(PrefixPlusExpressionNode node) {
        return null;
    }
}
