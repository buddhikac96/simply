package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        List<ASTNode> children = new ArrayList<>();
        children.add(this.functionCallExpressionNode);
        return children;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "FunctionCallStatementNode{" +
                "functionCallExpressionNode=" + functionCallExpressionNode +
                '}';
    }
}
