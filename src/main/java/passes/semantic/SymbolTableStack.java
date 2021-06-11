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

    public int getTableCount(){
        return this.symbolTableStack.size();
    }

    public boolean popSymbolTable(){
        if(this.symbolTableStack.isEmpty()){
            return false;
        }else{
            this.symbolTableStack.pop();
            return true;
        }
    }

    public boolean isVariableExist(SimplyVariable variable){
        for(SymbolTable symbolTable : this.symbolTableStack){
            if(symbolTable.map.containsKey(variable.getName())){
                return true;
            }
        }
        return false;
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

    public boolean addSymbol(SimplyVariable variable){
        if(isVariableExist(variable)){
            return false;
        }
        this.symbolTableStack.peek().map.put(variable.getName(), variable);
        return true;
    }

}

