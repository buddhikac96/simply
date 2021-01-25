package ast;

import ast.util.DataType;

public class IterateStatementNode extends StatementNode{
    IterateConditionExpressionNode iterateConditionExpressionNode;
    BlockNode blockNode;

    public IterateStatementNode(IterateConditionExpressionNode iterateConditionExpressionNode, BlockNode blockNode) {
        this.iterateConditionExpressionNode = iterateConditionExpressionNode;
        this.blockNode = blockNode;
    }
}

abstract class IterateConditionExpressionNode extends ExpressionNode{

}

class RangeExpressionNode extends IterateConditionExpressionNode{
    ArgNode variableDeclaration;
    ExpressionNode fromValue;
    ExpressionNode toValue;

    public RangeExpressionNode(ArgNode variableDeclaration, ExpressionNode fromValue, ExpressionNode toValue) {
        this.variableDeclaration = variableDeclaration;
        this.fromValue = fromValue;
        this.toValue = toValue;
    }
}

class ArrayIterateExpressionNode extends IterateConditionExpressionNode{
    ArgNode variableDeclaration;
    ASTNode arrayReference;  // Identifier or function call expression

    public ArrayIterateExpressionNode(ArgNode variableDeclaration, ASTNode arrayReference) {
        this.variableDeclaration = variableDeclaration;
        this.arrayReference = arrayReference;
    }
}


