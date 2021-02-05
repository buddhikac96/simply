package ast;

import visitors.AstVisitor;

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
        return null;
    }

    @Override
    public void accept(AstVisitor visitor) {

    }


    public abstract static class IterateConditionExpressionNode extends ExpressionNode{

        public static class BooleanIterateExpressionNode extends IterateConditionExpressionNode{
            ExpressionNode expressionNode;

            public BooleanIterateExpressionNode(ExpressionNode expressionNode) {
                this.expressionNode = expressionNode;
            }

            @Override
            public List<ASTNode> getChildren() {
                return null;
            }

            @Override
            public void accept(AstVisitor visitor) {

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
                return null;
            }

            @Override
            public void accept(AstVisitor visitor) {

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
                return null;
            }

            @Override
            public void accept(AstVisitor visitor) {

            }
        }
    }


}






