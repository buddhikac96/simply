package ast;

import ast.util.enums.DataType;

public class ArrayVariableDeclarationNode extends VariableDeclarationNode {
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

    @Override
    public void setConst() {
        this.isConst = true;
    }
}
