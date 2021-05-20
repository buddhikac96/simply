package passes.transpiler;

import ast.*;
import ast.util.DataTypeMapper;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class OriginalTranspiler extends BaseAstVisitor<String> {

    public StringBuilder code = new StringBuilder();
    STGroup group = new STGroupFile("src/main/resources/templates/javaTemplate.stg");

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
        StringBuilder arrayElements = new StringBuilder();
        if(node instanceof EmptyArrayInitializationNode) {
            return null;
        }else if(node instanceof NonEmptyArrayInitializationNode) {
            var newNode = (NonEmptyArrayInitializationNode) node;
            for(ExpressionNode elementNode : newNode.getArrayValues()) {
                var value = visit(elementNode);
                arrayElements.append(value).append(",");
            }
        }

        // Removing the additional ','
        return arrayElements.deleteCharAt(arrayElements.length() - 1).toString();

    }

    // Update the array template to support both empty and non-empty initialization nodes
    @Override
    public String visit(ArrayVariableDeclarationNode node) {
        var arrValues = visit(node.getValue());
        if(arrValues == null) {
            ST st = group.getInstanceOf("globalArraysDec");

            var dataType = node.getDataType();
            st.add("type", DataTypeMapper.getJavaType(dataType));
            var varName = node.getName();
            st.add("identifier", varName);

            return st.render();
        }else{
            ST st = group.getInstanceOf("globalArraysDecInit");

            var dataType = node.getDataType();
            st.add("type", DataTypeMapper.getJavaType(dataType));
            var varName = node.getName();
            st.add("identifier", varName);
            st.add("values", arrValues);

            return st.render();
        }
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
        st.add("libImportSection", libImportsSection);
        var globalVarsSection = visit(node.getGlobalVariableDeclarationNodeList());
        st.add("globalSection", globalVarsSection);

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

        for(VariableDeclarationNode variableDeclarationNode : node.getVariableDeclarationNodes()){
            if(variableDeclarationNode instanceof PrimitiveVariableDeclarationNode){
                var primNode = (PrimitiveVariableDeclarationNode) variableDeclarationNode;
                line.append(visit(primNode));
            }else if(variableDeclarationNode instanceof ArrayVariableDeclarationNode){
                var arrayNode = (ArrayVariableDeclarationNode) variableDeclarationNode;
                line.append(visit(arrayNode));
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
