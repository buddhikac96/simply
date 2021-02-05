package ast;

import visitors.AstVisitor;

import java.util.ArrayList;
import java.util.List;

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


    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.add(libImportNodeList);
        children.add(globalVariableDeclarationNodeList);
        children.add(functionDeclarationNodeList);

        return children;
    }

    @Override
    public void accept(AstVisitor visitor) {
        for(ASTNode node : this.getChildren()){
            node.accept(visitor);
        }
        visitor.visit(this);
    }
}
