package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionCallExpressionNode extends ExpressionNode {
    public String libRef;
    public String funcName;
    public List<ExpressionNode> parameterList;

    public FunctionCallExpressionNode(String libRef, String funcName) {
        this.libRef = libRef;
        this.funcName = funcName;
        this.parameterList = new ArrayList<>();
    }

    public FunctionCallExpressionNode(String funcName) {
        this.funcName = funcName;
        this.parameterList = new ArrayList<>();
    }

    public void addParameter(ExpressionNode expressionNode) {
        this.parameterList.add(expressionNode);
    }

    public String getLibRef() { return this.libRef; }

    public String getFuncName() { return this.funcName; }

    public List<ExpressionNode> getParameterList() { return this.parameterList; }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(this.parameterList);
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "FunctionCallExpressionNode{" +
                "libRef='" + libRef + '\'' +
                ", funcName='" + funcName + '\'' +
                ", parameterList=" + parameterList +
                '}';
    }
}

