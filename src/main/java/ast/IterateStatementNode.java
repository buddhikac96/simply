package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IterateStatementNode extends StatementNode{
    IterateConditionExpressionNode iterateConditionExpressionNode;
    BlockNode blockNode;

    public IterateStatementNode(IterateConditionExpressionNode iterateConditionExpressionNode, BlockNode blockNode) {
        this.iterateConditionExpressionNode = iterateConditionExpressionNode;
        this.blockNode = blockNode;
    }

    public IterateConditionExpressionNode getIterateConditionExpressionNode() { return this.iterateConditionExpressionNode; }

    public BlockNode getBlockNode() { return this.blockNode; }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.add(iterateConditionExpressionNode);
        children.add(blockNode);
        return children;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "IterateStatementNode{" +
                "iterateConditionExpressionNode=" + iterateConditionExpressionNode +
                ", blockNode=" + blockNode +
                '}';
    }

    public abstract static class IterateConditionExpressionNode extends ExpressionNode{

        public static class BooleanIterateExpressionNode extends IterateConditionExpressionNode{
            ExpressionNode expressionNode;

            public BooleanIterateExpressionNode(ExpressionNode expressionNode) {
                this.expressionNode = expressionNode;
            }

            public ExpressionNode getExpressionNode() { return this.expressionNode; }

            @Override
            public List<ASTNode> getChildren() {
                List<ASTNode> children = new ArrayList<>();
                children.add(expressionNode);
                return children;
            }

            @Override
            public void accept(BaseAstVisitor visitor) {
                this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
                visitor.visit(this);
            }

            @Override
            public String toString() {
                return "BooleanIterateExpressionNode{" +
                        "expressionNode=" + expressionNode +
                        '}';
            }
        }

        public static class RangeIterateExpressionNode extends IterateConditionExpressionNode{
            ArgNode variableDeclaration;
            ExpressionNode fromValue;
            ExpressionNode toValue;

            public RangeIterateExpressionNode(ArgNode variableDeclaration, ExpressionNode fromValue, ExpressionNode toValue) {
                this.variableDeclaration = variableDeclaration;
                this.fromValue = fromValue;
                this.toValue = toValue;
            }

            @Override
            public List<ASTNode> getChildren() {
                List<ASTNode> children = new ArrayList<>();
                children.add(this.variableDeclaration);
                children.add(this.fromValue);
                children.add(this.toValue);
                return children;
            }

            @Override
            public void accept(BaseAstVisitor visitor) {
                this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
                visitor.visit(this);
            }

            @Override
            public String toString() {
                return "RangeIterateExpressionNode{" +
                        "variableDeclaration=" + variableDeclaration +
                        ", fromValue=" + fromValue +
                        ", toValue=" + toValue +
                        '}';
            }
        }

        public static class NewRangeExpressionNode extends IterateConditionExpressionNode{

            ArgNode variableDeclaration;
            ExpressionNode fromValue;
            ExpressionNode toValue;
            ExpressionNode nextValue;

            public NewRangeExpressionNode(
                    ArgNode variableDeclaration,
                    ExpressionNode fromValue,
                    ExpressionNode toValue,
                    ExpressionNode nextValue
            ) {
                this.variableDeclaration = variableDeclaration;
                this.fromValue = fromValue;
                this.toValue = toValue;
                this.nextValue = nextValue;
            }

            public ArgNode getArgNode() { return this.variableDeclaration; }

            public ExpressionNode getFromValue() { return this.fromValue; }

            public ExpressionNode getToValue() { return this.toValue; }

            public ExpressionNode getNextValue() { return this.nextValue; }

            @Override
            public List<ASTNode> getChildren() {
                List<ASTNode> children = new ArrayList<>();
                children.add(this.variableDeclaration);
                children.add(this.fromValue);
                children.add(this.toValue);
                children.add(this.nextValue);
                return children;
            }

            @Override
            public void accept(BaseAstVisitor visitor) {
                this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
                visitor.visit(this);
            }
        }

        public static class ArrayIterateExpressionNode extends IterateConditionExpressionNode{
            ArgNode variableDeclaration;
            ExpressionNode expressionNode;  // Identifier or function call expression

            public ArrayIterateExpressionNode(ArgNode variableDeclaration, ExpressionNode expressionNode) {
                this.variableDeclaration = variableDeclaration;
                this.expressionNode = expressionNode;
            }

            public ArgNode getArgNode() { return this.variableDeclaration; }

            public ExpressionNode getExpressionNode() { return this.expressionNode; }

            @Override
            public List<ASTNode> getChildren() {
                List<ASTNode> children = new ArrayList<>();
                children.add(this.variableDeclaration);
                children.add(this.expressionNode);
                return children;
            }

            @Override
            public void accept(BaseAstVisitor visitor) {
                this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
                visitor.visit(this);
            }

            @Override
            public String toString() {
                return "ArrayIterateExpressionNode{" +
                        "variableDeclaration=" + variableDeclaration +
                        ", expressionNode=" + expressionNode +
                        '}';
            }
        }
    }


}






