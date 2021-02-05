package ast;

import ast.util.enums.AssignmentOperator;
import visitors.BaseAstVisitor;

import java.util.List;

public abstract class AssignmentStatementNode extends StatementNode {

    public static class PrimitiveVariableAssignmentStatementNode extends AssignmentStatementNode{
        private String name;
        private AssignmentOperator assignmentOperator;
        private ExpressionNode value;

        public PrimitiveVariableAssignmentStatementNode(
                String name,
                AssignmentOperator assignmentOperator,
                ExpressionNode value) {
            this.name = name;
            this.assignmentOperator = assignmentOperator;
            this.value = value;
        }

        public AssignmentOperator getAssignmentOperator() {
            return assignmentOperator;
        }

        public void setAssignmentOperator(AssignmentOperator assignmentOperator) {
            this.assignmentOperator = assignmentOperator;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }

    public static class ArrayVariableAssignmentStatementNode extends AssignmentStatementNode{
        private String name;
        private AssignmentOperator assignmentOperator;
        private ExpressionNode value;

        public ArrayVariableAssignmentStatementNode(
                String name,
                AssignmentOperator assignmentOperator,
                ExpressionNode value) {
            this.name = name;
            this.assignmentOperator = assignmentOperator;
            this.value = value;
        }

        public AssignmentOperator getAssignmentOperator() {
            return assignmentOperator;
        }

        public void setAssignmentOperator(AssignmentOperator assignmentOperator) {
            this.assignmentOperator = assignmentOperator;
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

