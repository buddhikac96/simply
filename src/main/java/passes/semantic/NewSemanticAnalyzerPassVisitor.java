package passes.semantic;

import app.SimplySystem;
import ast.*;
import errors.SimplyError;
import errors.variable.DuplicateVariableDeclaration;
import visitors.BaseAstVisitor;

import java.util.List;

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

public class NewSemanticAnalyzerPassVisitor extends BaseAstVisitor<Object> {

    SimplySymbolTableStack simplySymbolTableStack;
    List<SimplyError> simplyErrorList;

    public NewSemanticAnalyzerPassVisitor(List<SimplyError> simplyErrorList) {
        this.simplySymbolTableStack = new SimplySymbolTableStack();
        this.simplyErrorList = simplyErrorList;
    }

    @Override
    public Object visit(ArgNode node) {
        return null;
    }

    @Override
    public Object visit(AdditionExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(DivisionExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(ModulusExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(MultiplicationExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(SubtractionExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(ArrayAccessExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(ArrayInitializationNode node) {
        return null;
    }

    @Override
    public Object visit(ArrayVariableDeclarationNode node) {
        return null;
    }

    @Override
    public Object visit(ArrayVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public Object visit(PrimitiveVariableAssignmentStatementNode node) {
        return null;
    }

    // exitBlockNode
    @Override
    public Object visit(BlockNode node) {
        this.simplySymbolTableStack.popSymbolTable();
        return null;
    }

    @Override
    public Object visit(CompilationUnitNode node) {
        return null;
    }

    @Override
    public Object visit(EmptyArrayInitializationNode node) {
        return null;
    }

    @Override
    public Object visit(FunctionCallExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(FunctionCallStatementNode node) {
        return null;
    }

    // exitFunctionDeclarationNode
    @Override
    public Object visit(FunctionDeclarationNode node) {
        this.simplySymbolTableStack.popSymbolTable();
        return null;
    }

    @Override
    public Object visit(FunctionSignatureNode node) {
        return null;
    }

    @Override
    public Object visit(FunctionDeclarationNodeList node) {
        return null;
    }

    @Override
    public Object visit(GlobalVariableDeclarationNodeList node) {

        this.simplySymbolTableStack.addSymbolTable(new NewSymbolTable());

        for(ASTNode astNode : node.getVariableDeclarationNodes()){
            if(astNode instanceof PrimitiveVariableDeclarationNode newNode){

                var varName = newNode.getName();
                var dataType = newNode.getDataType();
                var variable = new SimplyVariable(varName, dataType);

                // Validate for duplicate variable declaration
                if(!this.simplySymbolTableStack.validateDuplicateDeclaration(variable)){
                    this.simplyErrorList.add(new DuplicateVariableDeclaration(varName));
                    SimplySystem.exit(this.simplyErrorList);
                }


            }else if(astNode instanceof ArrayVariableDeclarationNode newNode){

                var varName = newNode.getName();
                var dataType = newNode.getDataType();
                var variable = new SimplyVariable(varName, dataType, true);

                // Validate for duplicate variable declaration
                if(!this.simplySymbolTableStack.validateDuplicateDeclaration(variable)){
                    this.simplyErrorList.add(new DuplicateVariableDeclaration(varName));
                    SimplySystem.exit(this.simplyErrorList);
                }

            }
        }

        return null;
    }

    @Override
    public Object visit(IdentifierNode node) {
        return null;
    }

    @Override
    public Object visit(IfStatementNode node) {
        return null;
    }

    @Override
    public Object visit(ElseBlockNode node) {
        return null;
    }

    @Override
    public Object visit(IfBlockNode node) {
        return null;
    }

    @Override
    public Object visit(IterateStatementNode node) {
        return null;
    }

    @Override
    public Object visit(ArrayIterateExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(BooleanIterateExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(RangeIterateExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LibImportNode node) {
        return null;
    }

    @Override
    public Object visit(LibImportNodeList node) {
        return null;
    }

    @Override
    public Object visit(BoolLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(CharLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(FloatLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(IntegerLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(StringLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(AndExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(EqualsExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(GreaterOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(GreaterThanExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LessOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LessThanExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(NotEqualsExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(OrExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LoopControlStatementNode node) {
        return null;
    }

    @Override
    public Object visit(NonEmptyArrayInitializationNode node) {
        return null;
    }

    @Override
    public Object visit(PrimitiveVariableDeclarationNode node) {

        // If the stack is empty it means global variables
        // So we need to skip that case
        // Very ugly. AST architecture should be changed
        if(!this.simplySymbolTableStack.isStackEmpty()){
            var varName = node.getName();
            var dataType = node.getDataType();

            if(!this.simplySymbolTableStack.validateDuplicateDeclaration(new SimplyVariable(varName, dataType))){
                this.simplyErrorList.add(new DuplicateVariableDeclaration(varName));
                SimplySystem.exit(this.simplyErrorList);
            }
        }

        return null;
    }

    @Override
    public Object visit(ReturnStatementNode node) {
        return null;
    }

    @Override
    public Object visit(ParenExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(PrefixMinusExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(PrefixNotExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(PrefixPlusExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(NewRangeExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LogicExpressionNode node) {
        return null;
    }

    //////////////////////////////////////////////////
    //////////////// Symbol Table ////////////////////
    //////////////////////////////////////////////////

    @Override
    public Object enterFunctionDeclaration(FunctionDeclarationNode node) {
        this.simplySymbolTableStack.addSymbolTable(new NewSymbolTable());

        // Add parameters to symbol table
        var params = node.getFunctionSignatureNode().getFunctionArgumentNodeList();

        for(ArgNode argNode : params){
            var varName = argNode.getName();
            var dataType = argNode.getDataType();
            var isList = argNode.isList();

            // Validate for duplicate declarations
            if(!this.simplySymbolTableStack.validateDuplicateDeclaration(new SimplyVariable(varName, dataType, isList))){
                this.simplyErrorList.add(new DuplicateVariableDeclaration(varName));
                SimplySystem.exit(this.simplyErrorList);
            }
        }

        return null;
    }

    @Override
    public Object enterBlockNode(BlockNode node) {
        this.simplySymbolTableStack.addSymbolTable(new NewSymbolTable());
        return null;
    }
}
