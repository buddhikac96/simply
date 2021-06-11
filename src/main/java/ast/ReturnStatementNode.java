package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReturnStatementNode extends StatementNode {
    final ExpressionNode value;
    final public ReturnExpressionNode returnExpressionNode;

    public ReturnStatementNode(ExpressionNode value) {
        this.value = value;
        this.returnExpressionNode = new ReturnExpressionNode(value);
    }

    public ExpressionNode getValue() { return this.value; }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.add(value);
        return children;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "ReturnStatementNode{" +
                "value=" + value +
                '}';
    }

    public static class ReturnExpressionNode extends ExpressionNode{

        final public ExpressionNode value;

        public ReturnExpressionNode(ExpressionNode value) {
            this.value = value;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }
}


