package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class ArithmeticExpressionNode extends ExpressionNode {

    public abstract ExpressionNode getLeft();
    public abstract ExpressionNode getRight();

    public static class AdditionExpressionNode extends ArithmeticExpressionNode
    {
        private final ExpressionNode left;
        private final ExpressionNode right;

        public AdditionExpressionNode(ExpressionNode left, ExpressionNode right) {
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
            return "AdditionExpressionNode{ + }";
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

    public static class DivisionExpressionNode extends ArithmeticExpressionNode{
        private final ExpressionNode left;
        private final ExpressionNode right;

        public DivisionExpressionNode(ExpressionNode left, ExpressionNode right) {
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
        public String toString() {
            return "DivisionExpressionNode{ // }";
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
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

    public static class ModulusExpressionNode extends ArithmeticExpressionNode {
        private final ExpressionNode left;
        private final ExpressionNode right;

        public ModulusExpressionNode(ExpressionNode left, ExpressionNode right) {
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
        public String toString() {
            return "ModulusExpressionNode{ % }";
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
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

    public static class MultiplicationExpressionNode extends ArithmeticExpressionNode
    {
        private final ExpressionNode left;
        private final ExpressionNode right;

        public MultiplicationExpressionNode(ExpressionNode left, ExpressionNode right) {
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
        public String toString() {
            return "MultiplicationExpressionNode{ * }";
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
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

    public static class SubtractionExpressionNode extends ArithmeticExpressionNode
    {
        private final ExpressionNode left;
        private final ExpressionNode right;

        public SubtractionExpressionNode(ExpressionNode left, ExpressionNode right) {
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
        public String toString() {
            return "SubtractionExpressionNode{ - }";
        }


        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
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

