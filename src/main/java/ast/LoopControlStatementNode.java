package ast;

import ast.util.enums.LoopControlOperator;
import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class LoopControlStatementNode extends StatementNode {
    final LoopControlOperator operator;

    public LoopControlStatementNode(LoopControlOperator operator) {
        this.operator = operator;
    }

    public LoopControlOperator getOperator() { return this.operator; }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "LoopControlStatementNode{" +
                "operator=" + operator +
                '}';
    }
}

