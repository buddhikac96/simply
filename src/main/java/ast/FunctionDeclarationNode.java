package ast;

import ast.util.enums.DataType;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclarationNode extends ASTNode {
    private FunctionSignatureNode functionSignatureNode;
    private DataType returnType;
    private BlockNode functionBody;

    public FunctionDeclarationNode(
            FunctionSignatureNode functionSignatureNode,
            DataType returnType,
            BlockNode functionBody
    ) {
        this.functionSignatureNode = functionSignatureNode;
        this.returnType = returnType;
        this.functionBody = functionBody;
    }

    public FunctionSignatureNode getFunctionSignatureNode() {
        return functionSignatureNode;
    }

    public void setFunctionSignatureNode(FunctionSignatureNode functionSignatureNode) {
        this.functionSignatureNode = functionSignatureNode;
    }

    public DataType getReturnType() {
        return returnType;
    }

    public void setReturnType(DataType returnType) {
        this.returnType = returnType;
    }

    public BlockNode getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(BlockNode functionBody) {
        this.functionBody = functionBody;
    }


    // Function Signature AST Node class
    public static class FunctionSignatureNode extends ASTNode{
        private String functionName;
        private final List<FunctionArgumentNode> functionArgumentNodeList;

        public FunctionSignatureNode(String functionName) {
            this.functionName = functionName;
            this.functionArgumentNodeList = new ArrayList<>();
        }

        public void addArguments(FunctionArgumentNode functionArgumentNode){
            this.functionArgumentNodeList.add(functionArgumentNode);
        }

        public String getFunctionName() {
            return functionName;
        }

        public void setFunctionName(String functionName) {
            this.functionName = functionName;
        }

        public List<FunctionArgumentNode> getFunctionArgumentNodeList() {
            return functionArgumentNodeList;
        }
    }


    // Function Argument AST Node class
    public static class FunctionArgumentNode extends ASTNode{
        private DataType dataType;
        private String argumentName;

        public FunctionArgumentNode(DataType dataType, String argumentName) {
            this.dataType = dataType;
            this.argumentName = argumentName;
        }

        public DataType getDataType() {
            return dataType;
        }

        public void setDataType(DataType dataType) {
            this.dataType = dataType;
        }

        public String getArgumentName() {
            return argumentName;
        }

        public void setArgumentName(String argumentName) {
            this.argumentName = argumentName;
        }
    }
}



