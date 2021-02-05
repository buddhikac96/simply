package ast;

import visitors.AstVisitor;

import java.util.List;

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

    @Override
    public List<ASTNode> getChildren() {
        return null;
    }

    @Override
    public void accept(AstVisitor visitor) {

    }
}
