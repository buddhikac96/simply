package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class IterateStatementNode extends StatementNode{
    IterateConditionExpressionNode iterateConditionExpressionNode;
    BlockNode blockNode;

    public IterateStatementNode(IterateConditionExpressionNode iterateConditionExpressionNode, BlockNode blockNode) {
        this.iterateConditionExpressionNode = iterateConditionExpressionNode;
        this.blockNode = blockNode;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.add(iterateConditionExpressionNode);
        children.add(blockNode);
        return children;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }


    public abstract static class IterateConditionExpressionNode extends ExpressionNode{

        public static class BooleanIterateExpressionNode extends IterateConditionExpressionNode{
            ExpressionNode expressionNode;

            public BooleanIterateExpressionNode(ExpressionNode expressionNode) {
                this.expressionNode = expressionNode;
            }

            @Override
            public List<ASTNode> getChildren() {
                List<ASTNode> children = new ArrayList<>();
                children.add(expressionNode);
                return children;
            }

            @Override
            public void accept(BaseAstVisitor visitor) {
                this.getChildren().forEach(node -> node.accept(visitor));
                visitor.visit(this);
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
                this.getChildren().forEach(node -> node.accept(visitor));
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

            @Override
            public List<ASTNode> getChildren() {
                List<ASTNode> children = new ArrayList<>();
                children.add(this.variableDeclaration);
                children.add(this.expressionNode);
                return children;
            }

            @Override
            public void accept(BaseAstVisitor visitor) {
                this.getChildren().forEach(node -> node.accept(visitor));
                visitor.visit(this);
            }
        }
    }


}






