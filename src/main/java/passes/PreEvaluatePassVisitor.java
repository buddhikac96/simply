package passes;

import ast.*;
import ast.util.enums.DataType;
import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringJoiner;

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
    public Void visit(ArithmeticExpressionNode.AdditionExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(ArithmeticExpressionNode.DivisionExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(ArithmeticExpressionNode.ModulusExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(ArithmeticExpressionNode.MultiplicationExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(ArithmeticExpressionNode.SubtractionExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(ArrayAccessNode node) {
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
    public Void visit(AssignmentStatementNode.ArrayVariableAssignmentStatementNode node) {
        return null;
    }

    @Override
    public Void visit(AssignmentStatementNode.PrimitiveVariableAssignmentStatementNode node) {
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
    public Void visit(FunctionDeclarationNode.FunctionSignatureNode node) {
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
    public Void visit(IfStatementNode.ElseBlockNode node) {
        return null;
    }

    @Override
    public Void visit(IfStatementNode.IfBlockNode node) {
        return null;
    }

    @Override
    public Void visit(IterateStatementNode node) {
        return null;
    }

    @Override
    public Void visit(IterateStatementNode.IterateConditionExpressionNode.ArrayIterateExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(IterateStatementNode.IterateConditionExpressionNode.BooleanIterateExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(IterateStatementNode.IterateConditionExpressionNode.RangeIterateExpressionNode node) {
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
    public Void visit(LiteralExpressionNode.BoolLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LiteralExpressionNode.CharLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LiteralExpressionNode.FloatLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LiteralExpressionNode.IntegerLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LiteralExpressionNode.StringLiteralExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LogicExpressionNode.AndExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LogicExpressionNode.EqualsExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LogicExpressionNode.GreaterOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LogicExpressionNode.GreaterThanExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LogicExpressionNode.LessOrEqualThanExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LogicExpressionNode.LessThanExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LogicExpressionNode.NotEqualsExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(LogicExpressionNode.OrExpressionNode node) {
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
    public Void visit(UnaryExpressionNode.ParenExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(UnaryExpressionNode.PrefixMinusExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(UnaryExpressionNode.PrefixNotExpressionNode node) {
        return null;
    }

    @Override
    public Void visit(UnaryExpressionNode.PrefixPlusExpressionNode node) {
        return null;
    }
}
