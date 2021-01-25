package ast;

import ast.util.AssignmentOperator;

public class AssignmentStatementNode extends StatementNode {
    String name;
    ArrayAccess arrayAccess;
    AssignmentOperator assignmentOperator;
    ExpressionNode value;

    public AssignmentStatementNode(
            String name,
            ArrayAccess arrayAccess,
            AssignmentOperator assignmentOperator,
            ExpressionNode value
    ) {
        this.name = name;
        this.arrayAccess = arrayAccess;
        this.assignmentOperator = assignmentOperator;
        this.value = value;
    }
}

class ArrayAccess extends ASTNode{
    ExpressionNode expressionNode;

    public ArrayAccess(ExpressionNode expressionNode) {
        this.expressionNode = expressionNode;
    }
}

