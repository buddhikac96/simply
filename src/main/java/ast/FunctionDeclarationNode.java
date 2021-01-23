package ast;

import ast.util.DataType;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclarationNode extends ASTNode {
    FunctionSignatureNode functionSignatureNode;
    DataType returnType;
    Block functionBody;

    public FunctionDeclarationNode(
            FunctionSignatureNode functionSignatureNode,
            DataType returnType,
            Block functionBody
    ) {
        this.functionSignatureNode = functionSignatureNode;
        this.returnType = returnType;
        this.functionBody = functionBody;
    }
}

class FunctionSignatureNode extends ASTNode{
    String functionName;
    List<FunctionArgument> functionArgumentList;

    public FunctionSignatureNode(String functionName) {
        this.functionName = functionName;
        this.functionArgumentList = new ArrayList<>();
    }

    public void addArguments(FunctionArgument functionArgument){
        this.functionArgumentList.add(functionArgument);
    }
}

class FunctionArgument extends ASTNode{
    DataType dataType;
    String argumentName;

    public FunctionArgument(DataType dataType, String argumentName) {
        this.dataType = dataType;
        this.argumentName = argumentName;
    }
}

