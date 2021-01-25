package ast;

public class ReturnStatementNode extends StatementNode {
    ExpressionNode value;

    public ReturnStatementNode(ExpressionNode value) {
        this.value = value;
    }
}
