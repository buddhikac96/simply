package ast;

import ast.util.enums.AssignmentOperator;

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public AssignmentOperator getAssignmentOperator() {
            return assignmentOperator;
        }

        public void setAssignmentOperator(AssignmentOperator assignmentOperator) {
            this.assignmentOperator = assignmentOperator;
        }

        public ExpressionNode getValue() {
            return value;
        }

        public void setValue(ExpressionNode value) {
            this.value = value;
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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public AssignmentOperator getAssignmentOperator() {
            return assignmentOperator;
        }

        public void setAssignmentOperator(AssignmentOperator assignmentOperator) {
            this.assignmentOperator = assignmentOperator;
        }

        public ExpressionNode getValue() {
            return value;
        }

        public void setValue(ExpressionNode value) {
            this.value = value;
        }
    }


}

