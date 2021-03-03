/*
    TODO: Not possible to get line number details in syntax errors. Get context details in to the visitor from ast
 */

package passes;

import app.bootstrap.LibResourceModalMapper;
import ast.*;
import ast.helper.syntaxErrorHelper.LibResourceModal;
import ast.util.enums.DataType;
import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringJoiner;

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
import static ast.helper.syntaxErrorHelper.LibResourceModal.*;

public class SyntaxAnalyzerPassVisitor extends BaseAstVisitor<String> {

    LibResourceModal libResourceModal;
    HashMap<String, HashSet<ArrayList<DataType>>> functions;

    public SyntaxAnalyzerPassVisitor() {
        this.libResourceModal = LibResourceModalMapper.getMap();
        this.functions = new HashMap<>();
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
    public String visit(ArrayAccessNode node) {
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
        /*
            TODO: Think and update
            Function name and number of arguments are both checked. We can update this to check both, not one by one.
         */
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
            }

            /*
                Not have checked number of arguments. Find a way to check both function name and number of arguments once
             */
        }

        return null;
    }

    @Override
    public String visit(FunctionCallStatementNode node) {
        return null;
    }

    //TODO: This should be happen in the bootstrap. Otherwise function calls cant be validated.
    @Override
    public String visit(FunctionDeclarationNode node) {
        /*
            Find duplicate function declarations
            Overloading available
         */
        String funcName = node.getFunctionSignatureNode().getFunctionName();
        if(!this.functions.containsKey(funcName)){
            this.functions.put(funcName, new HashSet<>());
        }

        ArrayList<DataType> arguments = new ArrayList<>();
        node.getFunctionSignatureNode().getFunctionArgumentNodeList().forEach(arg -> {
            arguments.add(arg.getDataType());
        });

        boolean isExist = functions.get(funcName).add(arguments);

        if(!isExist){
            StringJoiner sj = new StringJoiner(",", funcName+"(", ")");
            node.getFunctionSignatureNode().getFunctionArgumentNodeList().forEach(arg -> {
                sj.add(arg.getDataType().name());
            });

            //TODO: Syntax error should be added to proper data structure
            System.out.println("Function " + sj.toString() + " already exist");
        }

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
            System.out.println("Undefined library import: " + node.getLibName());
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
}
