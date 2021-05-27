package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class LogicExpressionNode extends ExpressionNode {

    public abstract ExpressionNode getLeft();
    public abstract ExpressionNode getRight();

    public static class OrExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public OrExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<>();
            children.add(this.left);
            children.add(this.right);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "OrExpressionNode{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }

        @Override
        public ExpressionNode getLeft() {
            return this.left;
        }

        @Override
        public ExpressionNode getRight() {
            return this.right;
        }
    }

    public static class AndExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public AndExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<>();
            children.add(this.left);
            children.add(this.right);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "AndExpressionNode{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }

        @Override
        public ExpressionNode getLeft() {
            return this.left;
        }

        @Override
        public ExpressionNode getRight() {
            return this.right;
        }
    }

    public static class GreaterThanExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public GreaterThanExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<>();
            children.add(this.left);
            children.add(this.right);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "GreaterThanExpressionNode{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }

        @Override
        public ExpressionNode getLeft() {
            return this.left;
        }

        @Override
        public ExpressionNode getRight() {
            return this.right;
        }
    }

    public static class LessThanExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public LessThanExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<>();
            children.add(this.left);
            children.add(this.right);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "LessThanExpressionNode{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }

        @Override
        public ExpressionNode getLeft() {
            return this.left;
        }

        @Override
        public ExpressionNode getRight() {
            return this.right;
        }
    }

    public static class GreaterOrEqualThanExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public GreaterOrEqualThanExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<>();
            children.add(this.left);
            children.add(this.right);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "GreaterOrEqualThanExpressionNode{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }

        @Override
        public ExpressionNode getLeft() {
            return this.left;
        }

        @Override
        public ExpressionNode getRight() {
            return this.right;
        }
    }

    public static class LessOrEqualThanExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public LessOrEqualThanExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<>();
            children.add(this.left);
            children.add(this.right);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "LessOrEqualThanExpressionNode{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }

        @Override
        public ExpressionNode getLeft() {
            return this.left;
        }

        @Override
        public ExpressionNode getRight() {
            return this.right;
        }
    }

    public static class EqualsExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public EqualsExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<>();
            children.add(this.left);
            children.add(this.right);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "EqualsExpressionNode{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }

        @Override
        public ExpressionNode getLeft() {
            return this.left;
        }

        @Override
        public ExpressionNode getRight() {
            return this.right;
        }
    }

    public static class NotEqualsExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public NotEqualsExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<>();
            children.add(this.left);
            children.add(this.right);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "NotEqualsExpressionNode{" +
                    "left=" + left +
                    ", right=" + right +
                    '}';
        }

        @Override
        public ExpressionNode getLeft() {
            return this.left;
        }

        @Override
        public ExpressionNode getRight() {
            return this.right;
        }
    }
}
