package ast;

import java.util.ArrayList;
import java.util.List;

public class CompilationUnitNode extends ASTNode {
    public List<LibImportNode> libImportNodeList;
    public List<VariableDeclarationNode> globalVariableDeclarationNodeList;
    public List<FunctionDeclarationNode> functionDeclarationNodes;

    public CompilationUnitNode() {
        this.libImportNodeList = new ArrayList<>();
        this.globalVariableDeclarationNodeList = new ArrayList<>();
        this.functionDeclarationNodes = new ArrayList<>();
    }

    public void addLibImportNode(LibImportNode libImportNode){
        this.libImportNodeList.add(libImportNode);
    }

    public void addGlobalVariableDeclarationNode(VariableDeclarationNode variableDeclarationNode){
        this.globalVariableDeclarationNodeList.add(variableDeclarationNode);
    }

    public void addFunctionDeclarationNode(FunctionDeclarationNode functionDeclarationNode){
        this.functionDeclarationNodes.add(functionDeclarationNode);
    }
}
