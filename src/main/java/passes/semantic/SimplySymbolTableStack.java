package passes.semantic;

import java.util.Stack;

public class SimplySymbolTableStack {
    private Stack<NewSymbolTable> symbolTableStack;

    // Ugly - Just for skip triggering VariableDeclaration in GlobalVariableDeclaration
    public boolean isStackEmpty(){
        return this.symbolTableStack.isEmpty();
    }

    public SimplySymbolTableStack() {
        this.symbolTableStack = new Stack<>();
    }

    public void addSymbolTable(NewSymbolTable symbolTable){
        this.symbolTableStack.add(symbolTable);
    }

    public boolean popSymbolTable(){
        if(this.symbolTableStack.isEmpty()){
            return false;
        }else{
            this.symbolTableStack.pop();
            return true;
        }
    }

    // Validate variable for declaration
    public boolean validateDuplicateDeclaration(SimplyVariable variable){

        for(NewSymbolTable symbolTable : this.symbolTableStack){
            if(symbolTable.map.containsKey(variable.getName())){
                // duplicate variable declaration
                return false;
            }
        }

        this.symbolTableStack.peek().map.put(variable.getName(), variable);

        return true;
    }
}
