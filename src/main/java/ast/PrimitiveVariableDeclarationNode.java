package ast;

import ast.util.enums.DataType;

public class PrimitiveVariableDeclarationNode extends VariableDeclarationNode {
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

    @Override
    public void setConst() {
        this.isConst = true;
    }
}