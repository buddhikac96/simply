package passes.transpiler;

import ast.*;
import ast.util.DataTypeMapper;
import visitors.BaseAstVisitor;

import static ast.IterateStatementNode.IterateConditionExpressionNode.*;

public class Transpiler extends BaseAstVisitor {

    public StringBuilder libImports = new StringBuilder();
    public StringBuilder globalVars = new StringBuilder();

    @Override
    public Object visit(ArgNode node) {
        return null;
    }

    @Override
    public Object visit(ArithmeticExpressionNode.AdditionExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(ArithmeticExpressionNode.DivisionExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(ArithmeticExpressionNode.ModulusExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(ArithmeticExpressionNode.MultiplicationExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(ArithmeticExpressionNode.SubtractionExpressionNode node) {
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
    public Object visit(AssignmentStatementNode.ArrayVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public Object visit(AssignmentStatementNode.PrimitiveVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public Object visit(BlockNode node) {
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

    @Override
    public Object visit(FunctionDeclarationNode node) {
        return null;
    }

    @Override
    public Object visit(FunctionDeclarationNode.FunctionSignatureNode node) {
        return null;
    }

    @Override
    public Object visit(FunctionDeclarationNodeList node) {
        return null;
    }

    @Override
    public Object visit(GlobalVariableDeclarationNodeList node) {

        for(VariableDeclarationNode variableDeclarationNode : node.getVariableDeclarationNodes()){
            if(variableDeclarationNode instanceof PrimitiveVariableDeclarationNode){
                var primNode = (PrimitiveVariableDeclarationNode) variableDeclarationNode;

                var line = new StringBuilder().append("static ");

                var dataType = primNode.getDataType();
                line.append(DataTypeMapper.getJavaType(dataType)).append(" ");

                var varName = primNode.getName();
                line.append(varName).append(" ");

                if(primNode.getValue() != null){
                    line.append(" = ").append(primNode.getValue().toString());
                }

                line.append(";");
                globalVars.append(line).append("\n");

                System.out.println(line.toString());

            }else{

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
    public Object visit(IfStatementNode.ElseBlockNode node) {
        return null;
    }

    @Override
    public Object visit(IfStatementNode.IfBlockNode node) {
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
        String s = "import " + node.getLibName();
        libImports.append(s).append(";\n");
        return null;
    }

    @Override
    public Object visit(LibImportNodeList node) {
        return null;
    }

    @Override
    public Object visit(LiteralExpressionNode.BoolLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LiteralExpressionNode.CharLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LiteralExpressionNode.FloatLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LiteralExpressionNode.IntegerLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LiteralExpressionNode.StringLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LogicExpressionNode.AndExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LogicExpressionNode.EqualsExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LogicExpressionNode.GreaterOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LogicExpressionNode.GreaterThanExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LogicExpressionNode.LessOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LogicExpressionNode.LessThanExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LogicExpressionNode.NotEqualsExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LogicExpressionNode.OrExpressionNode node) {
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
        return null;
    }

    @Override
    public Object visit(ReturnStatementNode node) {
        return null;
    }

    @Override
    public Object visit(UnaryExpressionNode.ParenExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(UnaryExpressionNode.PrefixMinusExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(UnaryExpressionNode.PrefixNotExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(UnaryExpressionNode.PrefixPlusExpressionNode node) {
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
}
