package ast;

import ast.util.enums.DataType;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclarationNode extends ASTNode {
    FunctionSignatureNode functionSignatureNode;
    DataType returnType;
    BlockNode functionBody;

    public FunctionDeclarationNode(
            FunctionSignatureNode functionSignatureNode,
            DataType returnType,
            BlockNode functionBody
    ) {
        this.functionSignatureNode = functionSignatureNode;
        this.returnType = returnType;
        this.functionBody = functionBody;
    }


    public class FunctionSignatureNode extends ASTNode{
        String functionName;
        List<FunctionArgumentNode> functionArgumentNodeList;

        public FunctionSignatureNode(String functionName) {
            this.functionName = functionName;
            this.functionArgumentNodeList = new ArrayList<>();
        }

        public void addArguments(FunctionArgumentNode functionArgumentNode){
            this.functionArgumentNodeList.add(functionArgumentNode);
        }
    }

    public class FunctionArgumentNode extends ASTNode{
        DataType dataType;
        String argumentName;

        public FunctionArgumentNode(DataType dataType, String argumentName) {
            this.dataType = dataType;
            this.argumentName = argumentName;
        }
    }
}



