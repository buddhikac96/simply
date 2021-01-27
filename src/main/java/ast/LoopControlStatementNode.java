package ast;

import ast.util.enums.LoopControlOperator;

public class LoopControlStatementNode extends StatementNode {
    LoopControlOperator operator;

    public LoopControlStatementNode(LoopControlOperator operator) {
        this.operator = operator;
    }
}

