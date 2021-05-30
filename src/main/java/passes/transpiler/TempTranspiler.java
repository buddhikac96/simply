package passes.transpiler;

import ast.*;
import ast.util.DataTypeMapper;
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

public class TempTranspiler extends BaseAstVisitor<String> {

    public final StringBuilder code = new StringBuilder();

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
        var libImportsSection = visit(node.getLibImportNodeList());
        var globalVarsSection = visit(node.getGlobalVariableDeclarationNodeList());
        var functionsSection = visit(node.getFunctionDeclarationNodeList());

        // Append lib imports
        code.append(libImportsSection);

        // Create main class
        code.append("public class Main{\n");

        // Append global variables
        if(globalVarsSection != null){
            code.append(globalVarsSection);
        }

        // Append methods
        if(functionsSection != null){
            code.append(functionsSection);
        }

        // Close the class
        code.append("}");

        return code.toString();
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
        var code = new StringBuilder();

        for(VariableDeclarationNode variableDeclarationNode : node.getVariableDeclarationNodes()){
            if(variableDeclarationNode instanceof PrimitiveVariableDeclarationNode){
                var primNode = (PrimitiveVariableDeclarationNode) variableDeclarationNode;
                var line = visit(primNode);
                code.append(line).append("\n");
            }else{
                var arrNode = (ArrayVariableDeclarationNode) variableDeclarationNode;
                var line = visit(arrNode);
                code.append(line).append("\n");
            }
        }

        return code.toString();
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
        return "import " + node.getLibName() + ";" ;
    }

    @Override
    public String visit(LibImportNodeList node) {
        var libImports = new StringBuilder();
        for(LibImportNode libImportNode : node.getLibImportNodes()){
            var line = visit(libImportNode);
            libImports.append(line).append("\n");
        }

        return libImports.toString();
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
        var line = new StringBuilder().append("static ");

        var dataType = node.getDataType();
        line.append(DataTypeMapper.getJavaType(dataType)).append(" ");

        var varName = node.getName();
        line.append(varName).append(" ");

        if(node.getValue() != null){
            var value = node.getValue();

            // line.append(" = ").append(visit(node.getValue()));
        }

        line.append(";");

        return line.toString();
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

    @Override
    public String visit(NewRangeExpressionNode node) {
        return null;
    }

    public String visit(ExpressionNode node){
        if(node instanceof ArithmeticExpressionNode newNode){
            return visit(newNode);
        }else if(node instanceof ArrayAccessExpressionNode newNode){
            return visit(newNode);
        }else if(node instanceof FunctionCallExpressionNode newNode){
            return visit(newNode);
        }else if(node instanceof IdentifierNode newNode){
            return visit(newNode);
        }else if(node instanceof IterateStatementNode.IterateConditionExpressionNode newNode){
            return visit(newNode);
        }else if(node instanceof LiteralExpressionNode newNode){
            return visit(newNode);
        }else if(node instanceof LogicExpressionNode newNode){
            return visit(newNode);
        }else if(node instanceof UnaryExpressionNode newNode){
            return visit(newNode);
        }

        return null;

    }

    public String visit(IterateStatementNode.IterateConditionExpressionNode node){
        // visitors with implementations of IterateConditionExpressionNode
        return null;
    }

    public String visit(LiteralExpressionNode node){
        // visitors with implementations of LiteralExpressionNode
        return null;
    }

    public String visit(LogicExpressionNode node){
        // visitors with implementations of LiteralExpressionNode
        return null;
    }

    public String visit(UnaryExpressionNode node){
        // visitors with implementations of LiteralExpressionNode
        return null;
    }

    //////////////////////////////////////////////////
    //////////////// Symbol Table ////////////////////
    //////////////////////////////////////////////////

    @Override
    public String enterFunctionDeclaration(FunctionDeclarationNode node) {
        return null;
    }

    @Override
    public String enterBlockNode(BlockNode node) {
        return null;
    }
}
