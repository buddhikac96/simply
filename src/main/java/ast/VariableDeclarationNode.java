package ast;

import ast.util.DataType;

public abstract class VariableDeclarationNode extends ASTNode {

}

class PrimitiveVariableDeclarationNode extends VariableDeclarationNode{
    boolean isConst;
    DataType dataType;
    String varName;
    ExpressionNode value;

    public PrimitiveVariableDeclarationNode(
            boolean isConst,
            DataType dataType,
            String varName,
            ExpressionNode value
    ) {
        this.isConst = isConst;
        this.dataType = dataType;
        this.varName = varName;
        this.value = value;
    }
}

class ArrayVariableDeclarationNode extends VariableDeclarationNode{
    boolean isConst;
    DataType dataType;
    String varName;
    ArrayInitializationNode initializationNode;

    public ArrayVariableDeclarationNode(
            boolean isConst,
            DataType dataType,
            String varName,
            ArrayInitializationNode initializationNode
    ) {
        this.isConst = isConst;
        this.dataType = dataType;
        this.varName = varName;
        this.initializationNode = initializationNode;
    }
}