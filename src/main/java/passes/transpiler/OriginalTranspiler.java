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

    @Override
    public String visit(ArgNode node) {
        ST st = group.getInstanceOf("parameter");
        var isList = node.isList();
        var dataType = node.getDataType();
        var paraName = node.getName();
        st.add("isList", isList);
        st.add("type", DataTypeMapper.getJavaType(dataType));
        st.add("identifier", paraName);
        return st.render();
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
            ST st = group.getInstanceOf("arraysDec");
            var isConst = "";
            if(node.isConst()) { isConst = "final "; }
            st.add("constant", isConst);
            var dataType = node.getDataType();
            st.add("type", DataTypeMapper.getJavaType(dataType));
            var varName = node.getName();
            st.add("identifier", varName);
            return st.render();
        }else{
            ST st = group.getInstanceOf("arraysDecInit");
            var isConst = "";
            if(node.isConst()) { isConst = "final "; }
            st.add("constant", isConst);
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
        StringBuilder funcBody = new StringBuilder();
        for(StatementNode stmtNode : node.getStatementNodeList()) {
            if(stmtNode instanceof PrimitiveVariableDeclarationNode) {
                var primNode = (PrimitiveVariableDeclarationNode) stmtNode;
                funcBody.append(visit(primNode));
            }
            if(stmtNode instanceof FunctionCallStatementNode) {
                var funcCallNode = (FunctionCallStatementNode) stmtNode;
                funcBody.append(visit(funcCallNode));
            }
        }
        return funcBody.toString();
    }

    @Override
    public String visit(CompilationUnitNode node) {
        ST st = group.getInstanceOf("program");
        var libImportsSection = visit(node.getLibImportNodeList());
        st.add("libImportSection", libImportsSection);
        var globalVarsSection = visit(node.getGlobalVariableDeclarationNodeList());
        st.add("globalSection", globalVarsSection);
        var functionSection = visit(node.getFunctionDeclarationNodeList());
        st.add("functionSection", functionSection);

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
        StringBuilder parameters = new StringBuilder();
        ST st = group.getInstanceOf("print");

        for(ExpressionNode expNode : node.getParameterList()) {
            parameters.append(visit(expNode)).append("+");
        }
        parameters.deleteCharAt(parameters.length() - 1).toString();         // Removing the additional '+'
        if(node.getLibRef().equals("io")) {
            st.add("content", parameters);
        }
        return st.render();
    }

    @Override
    public String visit(FunctionCallStatementNode node) {
        return visit(node.getFunctionCallExpressionNode());
    }

    @Override
    public String visit(FunctionDeclarationNode node) {
        ST st = group.getInstanceOf("funcDec");

        var funcName = node.getFunctionSignatureNode().getFunctionName();
        if(funcName.equals("main")) {
            st.add("isMain", true);
        } else {
            st.add("isMain", false);
        }
        st.add("name", funcName);
        var parameters = visit(node.getFunctionSignatureNode());
        st.add("parameterList", parameters);
        var returnType = node.getReturnType();
        st.add("return", DataTypeMapper.getJavaType(returnType));
        var funcBody = visit(node.getFunctionBody());

        var body = visit(node.getFunctionBody());
        st.add("body", body);
        //st.add("body", null);
        return st.render();
    }

    @Override
    public String visit(FunctionDeclarationNode.FunctionSignatureNode node) {
        StringBuilder parameters = new StringBuilder();
        for(ArgNode argNode : node.getFunctionArgumentNodeList()) {
            parameters.append(visit(argNode)).append(',');
        }
        // Removing the additional ','
        if(parameters.length() != 0) { parameters.deleteCharAt(parameters.length() - 1); }
        return parameters.toString();
    }

    @Override
    public String visit(FunctionDeclarationNodeList node) {
        StringBuilder line = new StringBuilder();

        for(FunctionDeclarationNode functionDeclarationNode : node.getFunctionDeclarationNodes()) {
            line.append(visit(functionDeclarationNode));
        }
        return line.toString();
    }

    @Override
    public String visit(GlobalVariableDeclarationNodeList node) {
        StringBuilder line = new StringBuilder();

        for(VariableDeclarationNode variableDeclarationNode : node.getVariableDeclarationNodes()){
            if(variableDeclarationNode instanceof PrimitiveVariableDeclarationNode){
                var primNode = (PrimitiveVariableDeclarationNode) variableDeclarationNode;
                line.append("static ").append(visit(primNode));
            }else if(variableDeclarationNode instanceof ArrayVariableDeclarationNode){
                var arrayNode = (ArrayVariableDeclarationNode) variableDeclarationNode;
                line.append(visit(arrayNode));
            }
        }

        return line.toString();
    }

    @Override
    public String visit(IdentifierNode node) {
        return node.getName();
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
            return visit(newNode);
        }else if(node instanceof LiteralExpressionNode.CharLiteralExpressionNode) {
            var newNode = (LiteralExpressionNode.CharLiteralExpressionNode) node;
            return visit(newNode);
        }else if(node instanceof LiteralExpressionNode.FloatLiteralExpressionNode) {
            var newNode = (LiteralExpressionNode.FloatLiteralExpressionNode) node;
            return visit(newNode);
        }else if(node instanceof LiteralExpressionNode.IntegerLiteralExpressionNode) {
            var newNode = (LiteralExpressionNode.IntegerLiteralExpressionNode) node;
            return visit(newNode);
        }else if(node instanceof LiteralExpressionNode.StringLiteralExpressionNode) {
            var newNode = (LiteralExpressionNode.StringLiteralExpressionNode) node;
            return visit(newNode);
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
        ST st = group.getInstanceOf("varDec");

        var isConst = "";
        if(node.isConst()) { isConst = "final "; }
        st.add("constant", isConst);

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
            var newNode = (IdentifierNode) node;
            return visit(newNode);
        }else if(node instanceof IterateStatementNode.IterateConditionExpressionNode){
            return null;
        }else if(node instanceof LiteralExpressionNode) {
            var newNode = (LiteralExpressionNode) node;
            return visit(newNode);
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
