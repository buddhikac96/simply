package passes.semantic;

import app.SimplySystem;
import ast.*;
import ast.util.enums.DataType;
import errors.SimplyError;
import errors.arithmatic.*;
import errors.function.DuplicateFunctionDeclarationError;
import errors.function.MainMethodNotExistError;
import errors.function.NotImportedLibraryReference;
import errors.function.ReturnTypeMisMatchError;
import errors.library.DuplicateLibraryImportSimplyError;
import errors.library.UndefinedLibraryImportError;
import errors.variable.DuplicateVariableDeclarationError;
import errors.variable.TypeMisMatchError;
import errors.variable.VariableNotDefinedError;
import universalJavaMapper.newProvider.SimplyFunctionModel;
import universalJavaMapper.newProvider.SimplyFunctionServiceProvider;
import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static ast.ArithmeticExpressionNode.*;
import static ast.AssignmentStatementNode.ArrayVariableAssignmentStatementNode;
import static ast.AssignmentStatementNode.PrimitiveVariableAssignmentStatementNode;
import static ast.FunctionDeclarationNode.FunctionSignatureNode;
import static ast.IfStatementNode.ElseBlockNode;
import static ast.IfStatementNode.IfBlockNode;
import static ast.IterateStatementNode.IterateConditionExpressionNode;
import static ast.IterateStatementNode.IterateConditionExpressionNode.*;
import static ast.LiteralExpressionNode.*;
import static ast.LogicExpressionNode.*;
import static ast.UnaryExpressionNode.*;
import static ast.util.enums.DataType.*;
import static java.util.AbstractMap.SimpleEntry;

import static java.util.stream.Collectors.toList;

public class NewSemanticAnalyzerPassVisitor extends BaseAstVisitor<Object> {

    public static HashMap<SimpleEntry<DataType , DataType> , DataType> addDTypeMap;
    public static HashMap<SimpleEntry<DataType , DataType> , DataType> subDTypeMap;
    public static HashMap<SimpleEntry<DataType , DataType> , DataType> mulDTypeMap;
    public static HashMap<SimpleEntry<DataType , DataType> , DataType> divDTypeMap;

    static{

        addDTypeMap = new HashMap<>();

        addDTypeMap.put(new SimpleEntry<>(IntegerType , IntegerType), IntegerType);
        addDTypeMap.put(new SimpleEntry<>(FloatType , IntegerType), FloatType);
        addDTypeMap.put(new SimpleEntry<>(IntegerType , FloatType), FloatType);
        addDTypeMap.put(new SimpleEntry<>(CharType , CharType), StringType);
        addDTypeMap.put(new SimpleEntry<>(StringType , CharType), StringType);
        addDTypeMap.put(new SimpleEntry<>(CharType , StringType), StringType);
        addDTypeMap.put(new SimpleEntry<>(StringType , StringType), StringType);

    }

    static{

        subDTypeMap = new HashMap<>();

        subDTypeMap.put(new SimpleEntry<>(IntegerType , IntegerType), IntegerType);
        subDTypeMap.put(new SimpleEntry<>(FloatType , IntegerType), FloatType);
        subDTypeMap.put(new SimpleEntry<>(IntegerType , FloatType), FloatType);

    }

    static{

        mulDTypeMap = new HashMap<>();

        mulDTypeMap.put(new SimpleEntry<>(IntegerType , IntegerType), IntegerType);
        mulDTypeMap.put(new SimpleEntry<>(FloatType , IntegerType), FloatType);
        mulDTypeMap.put(new SimpleEntry<>(IntegerType , FloatType), FloatType);

    }

    static{

        divDTypeMap = new HashMap<>();

        divDTypeMap.put(new SimpleEntry<>(IntegerType , IntegerType), FloatType);
        divDTypeMap.put(new SimpleEntry<>(FloatType , IntegerType), FloatType);
        divDTypeMap.put(new SimpleEntry<>(IntegerType , FloatType), FloatType);

    }


    SimplySymbolTableStack simplySymbolTableStack;
    List<SimplyError> simplyErrorList;
    SimplyFunctionServiceProvider universalJavaLibraryServiceProvider;
    HashSet<String> importedLibraries;

    public NewSemanticAnalyzerPassVisitor(List<SimplyError> simplyErrorList, SimplyFunctionServiceProvider sfp) {
        this.simplySymbolTableStack = new SimplySymbolTableStack();
        this.simplyErrorList = simplyErrorList;
        this.universalJavaLibraryServiceProvider = sfp;
        importedLibraries = new HashSet<>();
    }



    @Override
    public Object visit(ArgNode node) {
        return null;
    }

    @Override
    public Object visit(AdditionExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(DivisionExpressionNode node) {

        // Divide by zero error
        if(node.getRight() instanceof NumberTypeLiteralExpression _node){
            if(_node.getStringValue().equals("0")){
                SimplySystem.exit(new DivideByZeroError());
            }
        }

        return null;
    }

    @Override
    public Object visit(ModulusExpressionNode node) {

        var logic = node.getLeft() instanceof IntegerLiteralExpressionNode && node.getRight() instanceof IntegerLiteralExpressionNode;
        if(!logic) {
            SimplySystem.exit(new InvalidModulusOperationError());
        }

        if(node.getRight() instanceof IntegerLiteralExpressionNode _node){
            if(_node.getStringValue().equals("0")){
                SimplySystem.exit(new InvalidModulusOperationError());
            }
        }

        return null;
    }

    @Override
    public Object visit(MultiplicationExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(SubtractionExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(ArrayAccessExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(ArrayInitializationNode node) {
        return null;
    }

    @Override
    public Object visit(ArrayVariableDeclarationNode node) {

        // If the stack is empty it means global variables
        // So we need to skip that case
        // Very ugly. AST architecture should be changed
        if(!this.simplySymbolTableStack.isStackEmpty()){
            var varName = node.getName();
            var dataType = node.getDataType();

            // Duplicate variable declaration check
            if(!this.simplySymbolTableStack.validateDuplicateDeclaration(new SimplyVariable(varName, dataType, true))){
                this.simplyErrorList.add(new DuplicateVariableDeclarationError(varName));
                SimplySystem.exit(this.simplyErrorList);
            }
        }

        return null;
    }

    @Override
    public Object visit(ArrayVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public Object visit(PrimitiveVariableAssignmentStatementNode node) {
        var varName = node.getName();

        // Check whether variable already declared
        if(!this.simplySymbolTableStack.validateVariableExistence(new SimplyVariable(varName))){
            this.simplyErrorList.add(new VariableNotDefinedError(varName));
            SimplySystem.exit(this.simplyErrorList);
        }

        // Check data type mismatch
        var symbol = this.simplySymbolTableStack.getSymbol(varName);
        var exprType = getExpressionDataType(node.getValue()).dataType;

        if(symbol.getType() != exprType){
            SimplySystem.exit(new TypeMisMatchError(symbol.getType(), exprType));
        }

        return null;
    }

    // exitBlockNode
    @Override
    public Object visit(BlockNode node) {
        this.simplySymbolTableStack.popSymbolTable();
        return null;
    }

    @Override
    public Object visit(CompilationUnitNode node) {
        return null;
    }

    @Override
    public Object visit(EmptyArrayInitializationNode node) {
        return null;
    }

    @Override
    public Object visit(FunctionCallExpressionNode node) {
        // validate function call (check function existence)

        // validate the library
        if(node.libRef != null && !importedLibraries.contains(node.libRef)){
            SimplySystem.exit(new NotImportedLibraryReference(node.libRef));
        }

        return null;
    }

    @Override
    public Object visit(FunctionCallStatementNode node) {
        return null;
    }

    // exitFunctionDeclarationNode
    @Override
    public Object visit(FunctionDeclarationNode node) {
        this.simplySymbolTableStack.popSymbolTable();

        /*
            Compare expected return type and actual return type
         */

        var expectReturnType = node.getReturnType();

        // If return exist get ReturnStatementNode() node else get new ReturnStatementNode(new VoidLiteralExpressionNode())
        var returnNode = (ReturnStatementNode) node.getFunctionBody().getStatementNodeList()
                .stream()
                .filter(i -> i instanceof ReturnStatementNode)
                .findFirst().orElse(new ReturnStatementNode(new VoidLiteralExpressionNode()));

        var actualReturnType = VoidType;

        if(!(returnNode.getValue() instanceof VoidLiteralExpressionNode)){
            actualReturnType = getExpressionDataType(returnNode.getValue()).dataType;
        }

        if(expectReturnType != actualReturnType){
            SimplySystem.exit(new ReturnTypeMisMatchError(expectReturnType, actualReturnType));
        }

        return null;
    }

    @Override
    public Object visit(FunctionSignatureNode node) {
        return null;
    }

    @Override
    public Object visit(FunctionDeclarationNodeList node) {

        // Check main method exist

        var isMainMethodExist = node.getFunctionDeclarationNodes().stream()
                .anyMatch(_node -> _node.getFunctionSignatureNode().getFunctionName() == "main");

        if(!isMainMethodExist){
            SimplySystem.exit(new MainMethodNotExistError());
        }

        return null;
    }

    @Override
    public Object visit(GlobalVariableDeclarationNodeList node) {

        this.simplySymbolTableStack.addSymbolTable(new NewSymbolTable());

        for(ASTNode astNode : node.getVariableDeclarationNodes()){
            if(astNode instanceof PrimitiveVariableDeclarationNode _node){

                var varName = _node.getName();
                var dataType = _node.getDataType();
                var variable = new SimplyVariable(varName, dataType);

                // Validate for duplicate variable declaration
                if(!this.simplySymbolTableStack.validateDuplicateDeclaration(variable)){
                    this.simplyErrorList.add(new DuplicateVariableDeclarationError(varName));
                    SimplySystem.exit(this.simplyErrorList);
                }


            }else if(astNode instanceof ArrayVariableDeclarationNode _node){

                var varName = _node.getName();
                var dataType = _node.getDataType();
                var variable = new SimplyVariable(varName, dataType, true);

                // Validate for duplicate variable declaration
                if(!this.simplySymbolTableStack.validateDuplicateDeclaration(variable)){
                    this.simplyErrorList.add(new DuplicateVariableDeclarationError(varName));
                    SimplySystem.exit(this.simplyErrorList);
                }

            }
        }

        return null;
    }

    @Override
    public Object visit(IdentifierNode node) {
        return null;
    }

    @Override
    public Object visit(IfStatementNode node) {
        return null;
    }

    @Override
    public Object visit(ElseBlockNode node) {
        return null;
    }

    @Override
    public Object visit(IfBlockNode node) {
        return null;
    }

    @Override
    public Object visit(IterateStatementNode node) {
        return null;
    }

    @Override
    public Object visit(ArrayIterateExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(BooleanIterateExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(RangeIterateExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LibImportNode node) {
        // Lib imports are validated in  visit(LibImportNodeList node)
        return null;
    }

    @Override
    public Object visit(LibImportNodeList node) {

        node.getLibImportNodes().forEach(_node -> {
            // Validate library
            if(!universalJavaLibraryServiceProvider.isValidLibrary(_node.getLibName())){
                SimplySystem.exit(new UndefinedLibraryImportError(_node.getLibName()));
            }

            // Check for duplicate library import
            if(!this.importedLibraries.add(_node.getLibName())){
                new DuplicateLibraryImportSimplyError(_node.getLibName());
            }
        });

        return null;
    }

    @Override
    public Object visit(BoolLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(CharLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(FloatLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(IntegerLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(StringLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(AndExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(EqualsExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(GreaterOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(GreaterThanExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LessOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LessThanExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(NotEqualsExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(OrExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LoopControlStatementNode node) {
        return null;
    }

    @Override
    public Object visit(NonEmptyArrayInitializationNode node) {
        return null;
    }

    @Override
    public Object visit(PrimitiveVariableDeclarationNode node) {

        // If the stack is empty it means global variables
        // So we need to skip that case
        // Very ugly. AST architecture should be changed
        if(!this.simplySymbolTableStack.isStackEmpty()){
            var varName = node.getName();
            var symbolDataType = node.getDataType();

            // Check variable already declared
            if(!this.simplySymbolTableStack.validateDuplicateDeclaration(new SimplyVariable(varName, symbolDataType))){
                this.simplyErrorList.add(new DuplicateVariableDeclarationError(varName));
                SimplySystem.exit(this.simplyErrorList);
            }

            // check type mis match error
            var symbol = this.simplySymbolTableStack.getSymbol(varName);
            var exprType = getExpressionDataType(node.getValue()).dataType;

            if(symbol.getType() != exprType){
                SimplySystem.exit(new TypeMisMatchError(symbol.getType(), exprType));
            }

        }

        return null;
    }

    @Override
    public Object visit(ReturnStatementNode node) {
        return null;
    }

    @Override
    public Object visit(ParenExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(PrefixMinusExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(PrefixNotExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(PrefixPlusExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(NewRangeExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(LogicExpressionNode node) {
        return null;
    }

    //////////////////////////////////////////////////
    //////////////// Symbol Table ////////////////////
    //////////////////////////////////////////////////

    @Override
    public Object enterFunctionDeclaration(FunctionDeclarationNode node) {

        // Check for duplicate function declaration
        // Create simply function model
        var funcName = node.getFunctionSignatureNode().getFunctionName();
        var returnType = node.getReturnType();
        var argNodeList = node.getFunctionSignatureNode().getFunctionArgumentNodeList();
        var argList = argNodeList.stream().map(ArgNode::getDataType).collect(toList());

        var builder = new SimplyFunctionModel()
                .setLibName("simply")
                .setFuncName(funcName)
                .setReturnType(returnType);

        for(var param : argNodeList) {
            builder.addParam(param.getDataType());
        }

        if(!this.universalJavaLibraryServiceProvider.addFunctionModel(builder.Build())){
            SimplySystem.exit(new DuplicateFunctionDeclarationError("simply", funcName, argList));
        }

        // Add new stack to symbol table stack
        this.simplySymbolTableStack.addSymbolTable(new NewSymbolTable());

        // Add parameters to symbol table
        for(ArgNode argNode : argNodeList){
            var varName = argNode.getName();
            var dataType = argNode.getDataType();
            var isList = argNode.isList();

            // Validate for duplicate declarations
            if(!this.simplySymbolTableStack.validateDuplicateDeclaration(new SimplyVariable(varName, dataType, isList))){
                this.simplyErrorList.add(new DuplicateVariableDeclarationError(varName));
                SimplySystem.exit(this.simplyErrorList);
            }
        }

        return null;
    }

    @Override
    public Object enterBlockNode(BlockNode node) {
        this.simplySymbolTableStack.addSymbolTable(new NewSymbolTable());
        return null;
    }


    //////////////////////////////////////////////////////////
    //////////// Get data type from expression ///////////////
    //////////////// Evaluate Expression /////////////////////
    //////////////////////////////////////////////////////////

    private SymbolDataType getExpressionDataType(ExpressionNode node){
        if(node instanceof ArithmeticExpressionNode _node){

            var left = _node.getLeft();
            var right = _node.getRight();

            var leftType = getExpressionDataType(left).dataType;
            var rightType = getExpressionDataType(right).dataType;

            if(_node instanceof AdditionExpressionNode adn){

                if(!NewSemanticAnalyzerPassVisitor.addDTypeMap.containsKey(new SimpleEntry<>(leftType, rightType))){
                    SimplySystem.exit(new InvalidAdditionOperationError(leftType, rightType));
                }

                var dataType =  NewSemanticAnalyzerPassVisitor.addDTypeMap.get(new SimpleEntry<>(leftType, rightType));
                return new SymbolDataType(dataType, false);

            }else if(_node instanceof SubtractionExpressionNode sbn){

                if(!NewSemanticAnalyzerPassVisitor.subDTypeMap.containsKey(new SimpleEntry<>(leftType, rightType))){
                    SimplySystem.exit(new InvalidSubtractionOperationError(leftType, rightType));
                }

                var dataType =  NewSemanticAnalyzerPassVisitor.subDTypeMap.get(new SimpleEntry<>(leftType, rightType));
                return new SymbolDataType(dataType, false);

            }else if(_node instanceof MultiplicationExpressionNode mln){

                if(!NewSemanticAnalyzerPassVisitor.mulDTypeMap.containsKey(new SimpleEntry<>(leftType, rightType))){
                    SimplySystem.exit(new InvalidMultiplicationOperationError(leftType, rightType));
                }

                var dataType =  NewSemanticAnalyzerPassVisitor.mulDTypeMap.get(new SimpleEntry<>(leftType, rightType));
                return new SymbolDataType(dataType, false);

            }else if(_node instanceof DivisionExpressionNode dvn){

                if(!NewSemanticAnalyzerPassVisitor.divDTypeMap.containsKey(new SimpleEntry<>(leftType, rightType))){
                    SimplySystem.exit(new InvalidDivisionOperationError(leftType, rightType));
                }

                var dataType =  NewSemanticAnalyzerPassVisitor.divDTypeMap.get(new SimpleEntry<>(leftType, rightType));
                return new SymbolDataType(dataType, false);

            }else{
                // Modular expression
                return new SymbolDataType(IntegerType, false);
            }

        }else if(node instanceof ArrayAccessExpressionNode _node){

        }else if(node instanceof FunctionCallExpressionNode _node){

            var libName = _node.libRef == null ? "simply" : _node.libRef;
            var funcName = _node.funcName;
            var args = new ArrayList<DataType>();

            for(var arg : _node.parameterList){
                args.add(getExpressionDataType(arg).dataType);
            }

            var sfm = new SimplyFunctionModel().setLibName(_node.libRef).setFuncName(_node.funcName);

            for(var arg : args){
                sfm.addParam(arg);
            }

            return null;

        }else if(node instanceof IdentifierNode _node){

            // validate the symbol from symbol table
            if(!this.simplySymbolTableStack.validateVariableExistence(new SimplyVariable(_node.getName()))){
                SimplySystem.exit(new VariableNotDefinedError(_node.getName()));
            }

            var symbol = this.simplySymbolTableStack.getSymbol(_node.getName());
            return new SymbolDataType(symbol.getType(), symbol.isList());

        }else if(node instanceof IterateConditionExpressionNode _node){

            // Create error - Wrong expression
            // SimplySystem.exit();

        }else if(node instanceof LiteralExpressionNode _node){

            if(_node instanceof IntegerLiteralExpressionNode){
                return new SymbolDataType(IntegerType, false);
            }else if(_node instanceof FloatLiteralExpressionNode){
                return new SymbolDataType(FloatType, false);
            }else if(_node instanceof CharLiteralExpressionNode){
                return new SymbolDataType(CharType, false);
            }else if(_node instanceof StringLiteralExpressionNode){
                return new SymbolDataType(StringType, false);
            }else{
                return new SymbolDataType(BooleanType, false);
            }

        }else if(node instanceof LogicExpressionNode _node){

            return new SymbolDataType(BooleanType, false);

        }else{
            // UnaryExpressionNode
            return new SymbolDataType(IntegerType, false);
        }

        return new SymbolDataType(IntegerType, false);
    }

}
