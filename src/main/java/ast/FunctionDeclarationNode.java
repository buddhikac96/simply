package ast;

import ast.util.enums.DataType;
import visitors.BaseAstVisitor;

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

    @Override
    public List<ASTNode> getChildren() {
        return null;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {

    }


    // Function Signature AST Node class
    public static class FunctionSignatureNode extends ASTNode{
        private String functionName;
        private final List<ArgNode> functionArgumentNodeList;

        public FunctionSignatureNode(String functionName) {
            this.functionName = functionName;
            this.functionArgumentNodeList = new ArrayList<ArgNode>();
        }

        public void addArguments(ArgNode functionArgumentNode){
            this.functionArgumentNodeList.add(functionArgumentNode);
        }

        public String getFunctionName() {
            return functionName;
        }

        public void setFunctionName(String functionName) {
            this.functionName = functionName;
        }

        public List<ArgNode> getFunctionArgumentNodeList() {
            return functionArgumentNodeList;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }
}



