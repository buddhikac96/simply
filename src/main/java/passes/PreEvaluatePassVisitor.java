package passes;

import ast.*;
import ast.util.enums.DataType;
import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringJoiner;

import static ast.ArithmeticExpressionNode.*;
import static ast.AssignmentStatementNode.*;
import static ast.FunctionDeclarationNode.*;
import static ast.IfStatementNode.*;
import static ast.IterateStatementNode.IterateConditionExpressionNode.*;
import static ast.LiteralExpressionNode.*;
import static ast.LogicExpressionNode.*;
import static ast.UnaryExpressionNode.*;

public class PreEvaluatePassVisitor extends BaseAstVisitor<Void> {

    HashMap<String, HashSet<ArrayList<DataType>>> functions;
    /*
        add : { [int, int], [float, float], [int, float] }
        pow : { [int], [float] }
     */

    public PreEvaluatePassVisitor() {
        this.functions = new HashMap<>();
    }

    public HashMap<String, HashSet<ArrayList<DataType>>> getFunctions() {
        return functions;
    }

    @Override
    public Void visit(ArgNode node) {
        return null;
    }

    @Override
    public Void visit(AdditionExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(DivisionExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(ModulusExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(MultiplicationExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(SubtractionExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(ArrayAccessExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(ArrayInitializationNode node) {
        return null;
    }

    @Override
    public Void visit(ArrayVariableDeclarationNode node) {
        return null;
    }

    @Override
    public Void visit(ArrayVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public Void visit(PrimitiveVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public Void visit(BlockNode node) {
        return null;
    }

    @Override
    public Void visit(CompilationUnitNode node) {
        return null;
    }

    @Override
    public Void visit(EmptyArrayInitializationNode node) {
        return null;
    }

    @Override
    public Void visit(FunctionCallExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(FunctionCallStatementNode node) {
        return null;
    }

    /*
        Creating function list data-set which will used in syntax analysing phase to detect duplicate function
        definitions and undefined user written functions
     */
    @Override
    public Void visit(FunctionDeclarationNode node) {
        /*
            Since function overloading is available we have to check for both function name and arguments
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

            // Create Error massage with String Joiner
            node.getFunctionSignatureNode().getFunctionArgumentNodeList().forEach(arg -> {
                sj.add(arg.getDataType().name());
            });

            //TODO: Syntax error should be added to proper data structure
            System.out.println("Function " + sj.toString() + " already exist");
        }

        return null;
    }

    @Override
    public Void visit(FunctionSignatureNode node) {
        return null;
    }

    @Override
    public Void visit(FunctionDeclarationNodeList node) {
        return null;
    }

    @Override
    public Void visit(GlobalVariableDeclarationNodeList node) {
        return null;
    }

    @Override
    public Void visit(IdentifierNode node) {
        return null;
    }

    @Override
    public Void visit(IfStatementNode node) {
        return null;
    }

    @Override
    public Void visit(ElseBlockNode node) {
        return null;
    }

    @Override
    public Void visit(IfBlockNode node) {
        return null;
    }

    @Override
    public Void visit(IterateStatementNode node) {
        return null;
    }

    @Override
    public Void visit(ArrayIterateExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(BooleanIterateExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(RangeIterateExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LibImportNode node) {
        return null;
    }

    @Override
    public Void visit(LibImportNodeList node) {
        return null;
    }

    @Override
    public Void visit(BoolLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(CharLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(FloatLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(IntegerLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(StringLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(AndExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(EqualsExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(GreaterOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(GreaterThanExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LessOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LessThanExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(NotEqualsExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(OrExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LoopControlStatementNode node) {
        return null;
    }

    @Override
    public Void visit(NonEmptyArrayInitializationNode node) {
        return null;
    }

    @Override
    public Void visit(PrimitiveVariableDeclarationNode node) {
        return null;
    }

    @Override
    public Void visit(ReturnStatementNode node) {
        return null;
    }

    @Override
    public Void visit(ParenExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(PrefixMinusExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(PrefixNotExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(PrefixPlusExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(NewRangeExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LogicExpressionNode node) {
        return null;
    }
}
