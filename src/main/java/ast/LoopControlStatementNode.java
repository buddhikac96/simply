package ast;

import ast.util.enums.LoopControlOperator;
import visitors.BaseAstVisitor;

import java.util.List;

public class LoopControlStatementNode extends StatementNode {
    LoopControlOperator operator;

    public LoopControlStatementNode(LoopControlOperator operator) {
        this.operator = operator;
    }

    @Override
    public List<ASTNode> getChildren() {
        return null;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {

    }
}

