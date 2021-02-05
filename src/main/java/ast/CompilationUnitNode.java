package ast;

public class CompilationUnitNode extends ASTNode {

    private final LibImportNodeList libImportNodeList;
    private final GlobalVariableNodeList globalVariableNodeList;
    private final FunctionDeclarationNodeList functionDeclarationNodeList;

    public CompilationUnitNode() {
        this.libImportNodeList = new LibImportNodeList();
        this.globalVariableNodeList = new GlobalVariableNodeList();
        this.functionDeclarationNodeList = new FunctionDeclarationNodeList();
    }

    public void addLibImportNode(LibImportNode libImportNode){
        this.libImportNodeList.addNode(libImportNode);
    }

    public void addGlobalVariableDeclarationNode(VariableDeclarationNode variableDeclarationNode){
        this.globalVariableNodeList.addNode(variableDeclarationNode);
    }

    public void addFunctionDeclarationNode(FunctionDeclarationNode functionDeclarationNode){
        this.functionDeclarationNodeList.addNode(functionDeclarationNode);
    }
}
