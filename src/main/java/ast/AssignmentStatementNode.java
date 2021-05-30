package ast;

import ast.util.enums.AssignmentOperator;
import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class AssignmentStatementNode extends StatementNode {

    public static class PrimitiveVariableAssignmentStatementNode extends AssignmentStatementNode{
        private final String name;
        private AssignmentOperator assignmentOperator;
        private final ExpressionNode value;

        @Override
        public String toString() {
            return "PrimitiveVariableAssignmentStatementNode{" +
                    "name='" + name + '\'' +
                    ", assignmentOperator=" + assignmentOperator +
                    ", value=" + value +
                    '}';
        }

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

        public ExpressionNode getValue() {
            return value;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<ASTNode>();
            children.add(this.value);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        public String getName() {
            return name;
        }
    }

    public static class ArrayVariableAssignmentStatementNode extends AssignmentStatementNode{
        private final String name;
        private AssignmentOperator assignmentOperator;
        private final ExpressionNode value;

        @Override
        public String toString() {
            return "ArrayVariableAssignmentStatementNode{" +
                    "name='" + name + '\'' +
                    ", assignmentOperator=" + assignmentOperator +
                    ", value=" + value +
                    '}';
        }

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

        public ExpressionNode getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        public void setAssignmentOperator(AssignmentOperator assignmentOperator) {
            this.assignmentOperator = assignmentOperator;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<ASTNode>();
            children.add(this.value);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }
    }


}

