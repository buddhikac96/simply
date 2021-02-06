package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

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
        this.getChildren().forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }
}
