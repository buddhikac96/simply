package passes.transpiler;

import ast.*;
import ast.util.DataTypeMapper;
import visitors.BaseAstVisitor;
import org.stringtemplate.v4.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OriginalTranspiler extends BaseAstVisitor<String> {

    public StringBuilder code = new StringBuilder();
    STGroup group = new STGroupFile("G:\\Dev\\v4\\simply\\src\\main\\resources\\templates\\javaTemplate.stg");

    //STGroup group = new STGroupDir("G:\\Dev\\v4\\simply\\src\\main\\java\\passes\\transpiler");


    @Override
    public String visit(ArgNode node) {
        return null;
    }

    @Override
    public String visit(ArithmeticExpressionNode.AdditionExpressionNode node) {
        return null;
    }

    @Override
    public String visit(ArithmeticExpressionNode.DivisionExpressionNode node) {
        return null;
    }

    @Override
    public String visit(ArithmeticExpressionNode.ModulusExpressionNode node) {
        return null;
    }

    @Override
    public String visit(ArithmeticExpressionNode.MultiplicationExpressionNode node) {
        return null;
    }

    @Override
    public String visit(ArithmeticExpressionNode.SubtractionExpressionNode node) {
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
    public String visit(AssignmentStatementNode.ArrayVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public String visit(AssignmentStatementNode.PrimitiveVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public String visit(BlockNode node) {
        return null;
    }

    @Override
    public String visit(CompilationUnitNode node) {
        ST st = group.getInstanceOf("program");
        var libImportsSection = visit(node.getLibImportNodeList());
        st.add("libImports", libImportsSection);
        var globalVarsSection = visit(node.getGlobalVariableDeclarationNodeList());
        st.add("globals", globalVarsSection);

        // Append lib imports
//        code.append(libImportsSection);
//        code.append(globalVarsSection);

        var program = st.render();
        code.append(program);
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
    public String visit(FunctionDeclarationNode.FunctionSignatureNode node) {
        return null;
    }

    @Override
    public String visit(FunctionDeclarationNodeList node) {
        return null;
    }

    @Override
    public String visit(GlobalVariableDeclarationNodeList node) {
        StringBuilder line = new StringBuilder();
        ST st = group.getInstanceOf("globalVariables");

        for(VariableDeclarationNode variableDeclarationNode : node.getVariableDeclarationNodes()){
            if(variableDeclarationNode instanceof PrimitiveVariableDeclarationNode){
                var primNode = (PrimitiveVariableDeclarationNode) variableDeclarationNode;
                line.append(visit(primNode));
            }
        }

        return line.toString();
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
    public String visit(IfStatementNode.ElseBlockNode node) {
        return null;
    }

    @Override
    public String visit(IfStatementNode.IfBlockNode node) {
        return null;
    }

    @Override
    public String visit(IterateStatementNode node) {
        return null;
    }

    public String visit(IterateStatementNode.IterateConditionExpressionNode node){
        // visitors with implementations of IterateConditionExpressionNode
        return null;
    }

    @Override
    public String visit(IterateStatementNode.IterateConditionExpressionNode.ArrayIterateExpressionNode node) {
        return null;
    }

    @Override
    public String visit(IterateStatementNode.IterateConditionExpressionNode.BooleanIterateExpressionNode node) {
        return null;
    }

    @Override
    public String visit(IterateStatementNode.IterateConditionExpressionNode.RangeIterateExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LibImportNode node) {
        return node.getLibName();
    }

    @Override
    public String visit(LibImportNodeList node) {
        ST st = group.getInstanceOf("libImport");
        List<String> libList = new ArrayList<>();

        for(LibImportNode libImportNode : node.getLibImportNodes()){
            libList.add(visit(libImportNode));
        }
        st.add("libList", libList);
        return st.render();
    }

    public String visit(LiteralExpressionNode node){
        // visitors with implementations of LiteralExpressionNode
        if(node instanceof LiteralExpressionNode.BoolLiteralExpressionNode) {
            var newNode = (LiteralExpressionNode.BoolLiteralExpressionNode) node;
            var literal = visit(newNode);
            return literal;
        }else if(node instanceof LiteralExpressionNode.CharLiteralExpressionNode) {
            var newNode = (LiteralExpressionNode.CharLiteralExpressionNode) node;
            var literal = visit(newNode);
            return literal;
        }else if(node instanceof LiteralExpressionNode.FloatLiteralExpressionNode) {
            var newNode = (LiteralExpressionNode.FloatLiteralExpressionNode) node;
            var literal = visit(newNode);
            return literal;
        }else if(node instanceof LiteralExpressionNode.IntegerLiteralExpressionNode) {
            var newNode = (LiteralExpressionNode.IntegerLiteralExpressionNode) node;
            var literal = visit(newNode);
            return literal;
        }else if(node instanceof LiteralExpressionNode.StringLiteralExpressionNode) {
            var newNode = (LiteralExpressionNode.StringLiteralExpressionNode) node;
            var literal = visit(newNode);
            return literal;
        }
        return null;
    }

    @Override
    public String visit(LiteralExpressionNode.BoolLiteralExpressionNode node) {
        return Boolean.toString(node.isValue());
    }

    @Override
    public String visit(LiteralExpressionNode.CharLiteralExpressionNode node) {
        return Character.toString(node.getValue());
    }

    @Override
    public String visit(LiteralExpressionNode.FloatLiteralExpressionNode node) {
        return Float.toString(node.getValue());
    }

    @Override
    public String visit(LiteralExpressionNode.IntegerLiteralExpressionNode node) {
        return Integer.toString(node.getValue());
    }

    @Override
    public String visit(LiteralExpressionNode.StringLiteralExpressionNode node) {
        return node.getValue();
    }

    public String visit(LogicExpressionNode node){
        // visitors with implementations of LiteralExpressionNode
        return null;
    }

    @Override
    public String visit(LogicExpressionNode.AndExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LogicExpressionNode.EqualsExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LogicExpressionNode.GreaterOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LogicExpressionNode.GreaterThanExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LogicExpressionNode.LessOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LogicExpressionNode.LessThanExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LogicExpressionNode.NotEqualsExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LogicExpressionNode.OrExpressionNode node) {
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
        ST st = group.getInstanceOf("globalVariables");
        var dataType = node.getDataType();
        st.add("type", DataTypeMapper.getJavaType(dataType));

        var varName = node.getName();
        st.add("identifier", varName);


        var expNode = node.getValue();
        var initValue = visit(expNode);
        st.add("val", initValue);

        return st.render();
    }

    @Override
    public String visit(ReturnStatementNode node) {
        return null;
    }

    public String visit(UnaryExpressionNode node){
        // visitors with implementations of LiteralExpressionNode
        return null;
    }

    @Override
    public String visit(UnaryExpressionNode.ParenExpressionNode node) {
        return null;
    }

    @Override
    public String visit(UnaryExpressionNode.PrefixMinusExpressionNode node) {
        return null;
    }

    @Override
    public String visit(UnaryExpressionNode.PrefixNotExpressionNode node) {
        return null;
    }

    @Override
    public String visit(UnaryExpressionNode.PrefixPlusExpressionNode node) {
        return null;
    }

    @Override
    public String visit(IterateStatementNode.IterateConditionExpressionNode.NewRangeExpressionNode node) {
        return null;
    }

    public String visit(ExpressionNode node){
        if(node instanceof ArithmeticExpressionNode){
            var newNode = (ArithmeticExpressionNode) node;

        }else if(node instanceof ArrayAccessExpressionNode){
            return null;
        }else if(node instanceof FunctionCallExpressionNode){
            return null;
        }else if(node instanceof IdentifierNode){
            return null;
        }else if(node instanceof IterateStatementNode.IterateConditionExpressionNode){
            return null;
        }else if(node instanceof LiteralExpressionNode) {
            var newNode = (LiteralExpressionNode) node;
            var literalValue = visit(newNode);
            return literalValue;
        }else if(node instanceof LogicExpressionNode){
            return null;
        }else if(node instanceof UnaryExpressionNode){
            return null;
        }

        return null;

    }

}
