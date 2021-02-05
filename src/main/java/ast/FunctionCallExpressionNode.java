package ast;

import visitors.AstVisitor;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<ASTNode> getChildren() {
        return null;
    }

    @Override
    public void accept(AstVisitor visitor) {

    }
}

