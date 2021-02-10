package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReturnStatementNode extends StatementNode {
    ExpressionNode value;

    public ReturnStatementNode(ExpressionNode value) {
        this.value = value;
    }

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
}
