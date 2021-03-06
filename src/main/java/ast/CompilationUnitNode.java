package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CompilationUnitNode extends ASTNode {

    private final LibImportNodeList libImportNodeList;
    private final GlobalVariableDeclarationNodeList globalVariableDeclarationNodeList;
    private final FunctionDeclarationNodeList functionDeclarationNodeList;

    public CompilationUnitNode() {
        this.libImportNodeList = new LibImportNodeList();
        this.globalVariableDeclarationNodeList = new GlobalVariableDeclarationNodeList();
        this.functionDeclarationNodeList = new FunctionDeclarationNodeList();
    }

    public void addLibImportNode(LibImportNode libImportNode){
        this.libImportNodeList.addNode(libImportNode);
    }

    public void addGlobalVariableDeclarationNode(VariableDeclarationNode variableDeclarationNode){
        this.globalVariableDeclarationNodeList.addNode(variableDeclarationNode);
    }

    public void addFunctionDeclarationNode(FunctionDeclarationNode functionDeclarationNode){
        this.functionDeclarationNodeList.addNode(functionDeclarationNode);
    }


    public LibImportNodeList getLibImportNodeList() {
        return libImportNodeList;
    }

    public GlobalVariableDeclarationNodeList getGlobalVariableDeclarationNodeList() {
        return globalVariableDeclarationNodeList;
    }

    public FunctionDeclarationNodeList getFunctionDeclarationNodeList() {
        return functionDeclarationNodeList;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.add(libImportNodeList);
        children.add(globalVariableDeclarationNodeList);
        children.add(functionDeclarationNodeList);

        return children;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "CompilationUnitNode{" +
                "libImportNodeList=" + libImportNodeList +
                ", globalVariableDeclarationNodeList=" + globalVariableDeclarationNodeList +
                ", functionDeclarationNodeList=" + functionDeclarationNodeList +
                '}';
    }
}
