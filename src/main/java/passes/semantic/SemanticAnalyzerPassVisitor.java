/*
    TODO: Not possible to get line number details in syntax errors. Get context details in to the visitor from ast
 */

package passes.semantic;

import app.bootstrap.LibResourceModalMapper;
import ast.*;
import app.bootstrap.LibResourceModal;
import ast.util.enums.DataType;
import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static ast.ArithmeticExpressionNode.*;
import static ast.AssignmentStatementNode.ArrayVariableAssignmentStatementNode;
import static ast.AssignmentStatementNode.PrimitiveVariableAssignmentStatementNode;
import static ast.FunctionDeclarationNode.FunctionSignatureNode;
import static ast.IfStatementNode.ElseBlockNode;
import static ast.IfStatementNode.IfBlockNode;
import static ast.IterateStatementNode.IterateConditionExpressionNode.*;
import static ast.LiteralExpressionNode.*;
import static ast.LogicExpressionNode.*;
import static ast.UnaryExpressionNode.*;
import static app.bootstrap.LibResourceModal.*;

public class SemanticAnalyzerPassVisitor extends BaseAstVisitor<String> {

    LibResourceModal libResourceModal;
    HashMap<String, HashSet<ArrayList<DataType>>> functions;

    //Symbol tables
    HashMap<String, Symbol> globalVariableSymbolTable;
    HashMap<String, Symbol> funcLocalSymbolTable;
    HashMap<String, Symbol> blockLocalSymbolTable;

    // new symbol table ds
    SymbolTable symbolTable = new SymbolTable();

    public SemanticAnalyzerPassVisitor(HashMap<String, HashSet<ArrayList<DataType>>> functions) {
        this.libResourceModal = LibResourceModalMapper.getMap();
        this.functions = functions;
        this.globalVariableSymbolTable = new HashMap<>();
    }

    @Override
    public String visit(ArgNode node) {
        return null;
    }

    @Override
    public String visit(AdditionExpressionNode node) {
        return null;
    }

    @Override
    public String visit(DivisionExpressionNode node) {
        return null;
    }

    @Override
    public String visit(ModulusExpressionNode node) {
        return null;
    }

    @Override
    public String visit(MultiplicationExpressionNode node) {
        return null;
    }

    @Override
    public String visit(SubtractionExpressionNode node) {
        return null;
    }

    @Override
    public String visit(ArrayAccessExpressionNode node) {
        return null;
    }

    @Override
    public String visit(ArrayInitializationNode node) {
        return null;
    }

    @Override
    public String visit(ArrayVariableDeclarationNode node) {
        return null;
    }

    @Override
    public String visit(ArrayVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public String visit(PrimitiveVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public String visit(BlockNode node) {
        return null;
    }

    @Override
    public String visit(CompilationUnitNode node) {
        return null;
    }

    @Override
    public String visit(EmptyArrayInitializationNode node) {
        return null;
    }

    @Override
    public String visit(FunctionCallExpressionNode node) {
        if(node.libRef != null){
            /*
                Check whether function contains in a standard library
             */
            String libName = node.libRef;

            //TODO: Syntax error should be added to proper data structure
            //Check whether library defined
            if(!libResourceModal.libraries.containsKey(libName)){
                System.out.println("Library " + libName +" not identified");
                return null;
            }

            Library library = libResourceModal.libraries.get(libName);
            String funcName = node.funcName;

            //TODO: Syntax error should be added to proper data structure
            //Check whether function defined in the library
            if(!library.functionList.containsKey(funcName)){
                System.out.println("Library " + libName + " does not contains a function " + funcName);
                return null;
            }

            Function function = library.functionList.get(funcName);

            int numOfParams = node.parameterList.size();
            boolean isOverloadExist = false;

            for(Overload overload : library.functionList.get(funcName).overloadList){
                if(overload.argList.size() == numOfParams){
                    isOverloadExist = true;
                    break;
                }
            }

            if(!isOverloadExist){
                System.out.println("Function " + funcName + "has not an Overload with " + numOfParams + " parameters");
            }

        }else{
            /*
                Check whether user has written the function
                In this case libReference is null
             */
            String funcName = node.funcName;

            if(!this.functions.containsKey(funcName)){
                System.out.println("Function " + funcName + " not found");
                return null;
            }else{
                /*
                    If the function name available then check number of arguments
                 */
                int numOfArgs = node.parameterList.size();
                boolean isExist = this.functions.get(node.funcName)
                        .stream()
                        .anyMatch(overload -> overload.size() == numOfArgs);

                if(!isExist){
                    System.out.println("Function " + funcName + " with " + numOfArgs + " arguments not found");
                }
            }

            /*
                Not have checked types of arguments. Find a way to check both function name and type of arguments
                Use Type system
             */
        }

        return null;
    }

    @Override
    public String visit(FunctionCallStatementNode node) {
        return null;
    }

    @Override
    public String visit(FunctionDeclarationNode node) {
        this.funcLocalSymbolTable = new HashMap<>();

        // Go through all the children nodes of function block
        node.getFunctionBody().getChildren().forEach(stmtNode -> {
            /*
                Check for duplicate variable declarations
             */
            if(stmtNode instanceof VariableDeclarationNode){

                var name = ((VariableDeclarationNode) stmtNode).getName();

                if(stmtNode instanceof PrimitiveVariableDeclarationNode){
                    var primNode = (PrimitiveVariableDeclarationNode) stmtNode;
                    Symbol symbol = new SymbolBuilder()
                            .setName(name)
                            .setConst(primNode.isConst())
                            .setDataType(primNode.getDataType())
                            .setInit(primNode.isInit())
                            .build();


                    //Check func local symbol in global symbol table
                    if(this.globalVariableSymbolTable.containsKey(name)){
                        System.out.println("Syntax Error: Local variable " + name + " already exist in global variables");
                    }

                    //Check whether symbol name exists in funcLocalSymbolTable
                    if(this.funcLocalSymbolTable.containsKey(name)){
                        System.out.println("Syntax Error: Variable " + name + " already exist");
                    }else{
                        this.funcLocalSymbolTable.put(name, symbol);
                    }
                }else if(stmtNode instanceof ArrayVariableDeclarationNode){
                    var arrNode = (ArrayVariableDeclarationNode) stmtNode;
                    Symbol symbol = new SymbolBuilder()
                            .setName(arrNode.getName())
                            .setArray(true)
                            .setDataType(arrNode.getDataType())
                            .setConst(arrNode.isConst())
                            .build();

                    //Check func local symbol in global symbol table
                    if(this.globalVariableSymbolTable.containsKey(name)){
                        System.out.println("Syntax Error: Local variable  " + name + " already used by global variable");
                    }

                    //Check whether symbol name exists in funcLocalSymbolTable
                    if(this.funcLocalSymbolTable.containsKey(arrNode.getName())){
                        System.out.println("Syntax Error: Variable " + arrNode.getName() + " already exist");
                    }else{
                        this.funcLocalSymbolTable.put(arrNode.getName(), symbol);
                    }
                }
            }
        });

        return null;
    }

    @Override
    public String visit(FunctionSignatureNode node) {
        return null;
    }

    @Override
    public String visit(FunctionDeclarationNodeList node) {
        return null;
    }

    @Override
    public String visit(GlobalVariableDeclarationNodeList node) {
        /*
            Add all global variables into global variable symbol table
            While adding checks for duplicates
         */
        for(VariableDeclarationNode varNode : node.getVariableDeclarationNodes()){

            String name = varNode.getName();

            if(varNode instanceof PrimitiveVariableDeclarationNode) {
                PrimitiveVariableDeclarationNode primNode = (PrimitiveVariableDeclarationNode) varNode;
                Symbol symbol = new SymbolBuilder()
                        .setName(name)
                        .setConst(primNode.isConst())
                        .setDataType(primNode.getDataType())
                        .setInit(primNode.isInit())
                        .build();

                //Check whether symbol name exists
                if(this.globalVariableSymbolTable.containsKey(name)){
                    System.out.println("Syntax Error: Global variable " + name + " already exist");
                }else{
                    this.globalVariableSymbolTable.put(name, symbol);
                }
            }else if(varNode instanceof ArrayVariableDeclarationNode){
                ArrayVariableDeclarationNode arrNode = (ArrayVariableDeclarationNode) varNode;
                Symbol symbol = new SymbolBuilder()
                        .setName(name)
                        .setArray(true)
                        .setDataType(arrNode.getDataType())
                        .setConst(arrNode.isConst())
                        .build();

                //Check whether symbol name exists
                if(this.globalVariableSymbolTable.containsKey(name)){
                    System.out.println("Syntax Error: Global variable " + name + " already exist");
                }else{
                    this.globalVariableSymbolTable.put(arrNode.getName(), symbol);
                }
            }
        }

        return null;
    }

    @Override
    public String visit(IdentifierNode node) {
        return null;
    }

    @Override
    public String visit(IfStatementNode node) {
        return null;
    }

    @Override
    public String visit(ElseBlockNode node) {
        return null;
    }

    @Override
    public String visit(IfBlockNode node) {
        return null;
    }

    @Override
    public String visit(IterateStatementNode node) {
        return null;
    }

    @Override
    public String visit(ArrayIterateExpressionNode node) {
        return null;
    }

    @Override
    public String visit(BooleanIterateExpressionNode node) {
        return null;
    }

    @Override
    public String visit(RangeIterateExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LibImportNode node) {
        //TODO: Syntax error should be added to proper data structure
        if(!libResourceModal.libraries.containsKey(node.getLibName())){
            System.out.println("Syntax Error: Undefined library import: " + node.getLibName());
        }

        return null;
    }

    @Override
    public String visit(LibImportNodeList node) {
        return null;
    }

    @Override
    public String visit(BoolLiteralExpressionNode node) {
        return null;
    }

    @Override
    public String visit(CharLiteralExpressionNode node) {
        return null;
    }

    @Override
    public String visit(FloatLiteralExpressionNode node) {
        return null;
    }

    @Override
    public String visit(IntegerLiteralExpressionNode node) {
        return null;
    }

    @Override
    public String visit(StringLiteralExpressionNode node) {
        return null;
    }

    @Override
    public String visit(AndExpressionNode node) {
        return null;
    }

    @Override
    public String visit(EqualsExpressionNode node) {
        return null;
    }

    @Override
    public String visit(GreaterOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public String visit(GreaterThanExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LessOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LessThanExpressionNode node) {
        return null;
    }

    @Override
    public String visit(NotEqualsExpressionNode node) {
        return null;
    }

    @Override
    public String visit(OrExpressionNode node) {
        return null;
    }

    @Override
    public String visit(LoopControlStatementNode node) {
        return null;
    }

    @Override
    public String visit(NonEmptyArrayInitializationNode node) {
        return null;
    }

    @Override
    public String visit(PrimitiveVariableDeclarationNode node) {
        return null;
    }

    @Override
    public String visit(ReturnStatementNode node) {
        return null;
    }

    @Override
    public String visit(ParenExpressionNode node) {
        return null;
    }

    @Override
    public String visit(PrefixMinusExpressionNode node) {
        return null;
    }

    @Override
    public String visit(PrefixNotExpressionNode node) {
        return null;
    }

    @Override
    public String visit(PrefixPlusExpressionNode node) {
        return null;
    }

    @Override
    public String visit(NewRangeExpressionNode node) {
        return null;
    }
}
