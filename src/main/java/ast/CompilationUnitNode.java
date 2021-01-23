package ast;

import java.util.ArrayList;
import java.util.List;

public class CompilationUnitNode extends ASTNode {
    List<LibImportNode> libImportNodeList;
    List<VariableDeclarationNode> variableDeclarationNodeList;
    List<FunctionDeclarationNode> functionDeclarationNodes;

    public CompilationUnitNode() {
        this.libImportNodeList = new ArrayList<>();
        this.variableDeclarationNodeList = new ArrayList<>();
        this.functionDeclarationNodes = new ArrayList<>();
    }

    public void addLibImportNode(LibImportNode libImportNode){
        this.libImportNodeList.add(libImportNode);
    }

    public void addVariableDeclarationNode(VariableDeclarationNode variableDeclarationNode){
        this.variableDeclarationNodeList.add(variableDeclarationNode);
    }

    public void addFunctionDeclarationNode(FunctionDeclarationNode functionDeclarationNode){
        this.functionDeclarationNodes.add(functionDeclarationNode);
    }
}
