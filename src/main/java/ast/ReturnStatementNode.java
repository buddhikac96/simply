package ast;

import visitors.AstVisitor;

import java.util.List;

public class ReturnStatementNode extends StatementNode {
    ExpressionNode value;

    public ReturnStatementNode(ExpressionNode value) {
        this.value = value;
    }

    @Override
    public List<ASTNode> getChildren() {
        return null;
    }

    @Override
    public void accept(AstVisitor visitor) {

    }
}
