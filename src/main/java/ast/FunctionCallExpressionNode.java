package ast;

import java.util.ArrayList;
import java.util.List;

public class FunctionCallExpressionNode extends ExpressionNode {
    String libRef;
    String funcName;
    List<ExpressionNode> parameterList;

    public FunctionCallExpressionNode(String libRef, String funcName) {
        this.libRef = libRef;
        this.funcName = funcName;
        this.parameterList = new ArrayList<>();
    }

    public void addParameter(ExpressionNode expressionNode) {
        this.parameterList.add(expressionNode);
    }
}
