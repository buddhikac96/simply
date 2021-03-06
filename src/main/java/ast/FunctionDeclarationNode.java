package ast;

import ast.util.enums.DataType;
import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionDeclarationNode extends ASTNode {
    private String libRef;
    private FunctionSignatureNode functionSignatureNode;
    private DataType returnType;
    private BlockNode functionBody;

    public FunctionDeclarationNode(
            String libRef,
            FunctionSignatureNode functionSignatureNode,
            DataType returnType,
            BlockNode functionBody
    ) {
        this.libRef = libRef;
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
        List<ASTNode> children = new ArrayList<>();
        children.add(this.functionSignatureNode);
        children.add(this.functionBody);

        return children;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        visitor.enterFunctionDeclaration(this);
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "FunctionDeclarationNode{" +
                "functionSignatureNode=" + functionSignatureNode +
                ", returnType=" + returnType +
                ", functionBody=" + functionBody +
                '}';
    }

    // Function Signature AST Node class
    public static class FunctionSignatureNode extends ASTNode{
        private IdentifierNode functionName;
        private final List<ArgNode> functionArgumentNodeList;

        public FunctionSignatureNode(IdentifierNode functionName) {
            this.functionName = functionName;
            this.functionArgumentNodeList = new ArrayList<ArgNode>();
        }

        public void addArguments(ArgNode functionArgumentNode){
            this.functionArgumentNodeList.add(functionArgumentNode);
        }

        public IdentifierNode getFunctionName() {
            return functionName;
        }

        public void setFunctionName(IdentifierNode functionName) {
            this.functionName = functionName;
        }

        public List<ArgNode> getFunctionArgumentNodeList() {
            return functionArgumentNodeList;
        }

        @Override
        public List<ASTNode> getChildren() {
            var arr = new ArrayList<ASTNode>();
            for(var i : this.functionArgumentNodeList){
                arr.add(i);
            }
            arr.add(this.functionName);
            return arr;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "FunctionSignatureNode{" +
                    "functionName='" + functionName.getIdentifierName() + '\'' +
                    ", functionArgumentNodeList=" + functionArgumentNodeList +
                    '}';
        }
    }
}



