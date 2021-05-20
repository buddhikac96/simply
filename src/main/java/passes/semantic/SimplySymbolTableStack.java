package passes.semantic;

import ast.util.enums.DataType;

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
                return false;
            }
        }

        this.symbolTableStack.peek().map.put(variable.getName(), variable);

        return true;
    }

    // Validate variable for existence
    public boolean validateVariableExistence(SimplyVariable variable){
        return !this.validateDuplicateDeclaration(variable);
    }

    public SimplyVariable getSymbol(String varName){

        SimplyVariable simplyVariable = new SimplyVariable("ThisIsTheDumbestThingThatAnyProgrammerCanDo");

        for(NewSymbolTable symbolTable : this.symbolTableStack){
            if(symbolTable.map.containsKey(varName)){
                simplyVariable = symbolTable.map.get(varName);
                break;
            }
        }

        return simplyVariable;
    }

}

class SymbolDataType {
    DataType dataType;
    boolean isList;

    public SymbolDataType(DataType dataType, boolean isList) {
        this.dataType = dataType;
        this.isList = isList;
    }
}