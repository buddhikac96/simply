package ast;

public class FunctionCallStatementNode extends StatementNode {
    FunctionCallExpressionNode functionCallExpressionNode;

    public FunctionCallStatementNode(FunctionCallExpressionNode functionCallExpressionNode) {
        this.functionCallExpressionNode = functionCallExpressionNode;
    }

    public FunctionCallExpressionNode getFunctionCallExpressionNode() {
        return functionCallExpressionNode;
    }

    public void setFunctionCallExpressionNode(FunctionCallExpressionNode functionCallExpressionNode) {
        this.functionCallExpressionNode = functionCallExpressionNode;
    }
}
