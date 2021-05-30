package passes.semantic;

import java.util.Stack;

public class SymbolTableStack {
    private final Stack<SymbolTable> symbolTableStack;

    // Ugly - Just for skip triggering VariableDeclaration in GlobalVariableDeclaration
    public boolean isStackEmpty(){
        return !this.symbolTableStack.isEmpty();
    }

    public SymbolTableStack() {
        this.symbolTableStack = new Stack<>();
    }

    public void addSymbolTable(SymbolTable symbolTable){
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

        for(SymbolTable symbolTable : this.symbolTableStack){
            if(symbolTable.map.containsKey(variable.getName())){
                return true;
            }
        }

        this.symbolTableStack.peek().map.put(variable.getName(), variable);

        return false;
    }

    // Validate variable for existence
    public boolean validateVariableExistence(SimplyVariable variable){
        return !this.validateDuplicateDeclaration(variable);
    }

    public SimplyVariable getSymbol(String varName){

        SimplyVariable simplyVariable = new SimplyVariable("ThisIsTheDumbestThingThatAnyProgrammerCanDo");

        for(SymbolTable symbolTable : this.symbolTableStack){
            if(symbolTable.map.containsKey(varName)){
                simplyVariable = symbolTable.map.get(varName);
                break;
            }
        }

        return simplyVariable;
    }

}

