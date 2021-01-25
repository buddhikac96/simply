package ast;

import ast.util.DataType;

public class ArgNode extends ASTNode {
    DataType dataType;
    String name;

    public ArgNode(DataType dataType, String name) {
        this.dataType = dataType;
        this.name = name;
    }
}
