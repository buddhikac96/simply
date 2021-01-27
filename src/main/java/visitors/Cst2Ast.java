package visitors;

import antlr.gen.SimplyV3Parser;
import antlr.gen.SimplyV3ParserBaseVisitor;
import ast.*;
import ast.util.DataTypeMapper;
import ast.util.enums.DataType;

import java.util.HashSet;
import java.util.List;

public class Cst2Ast extends SimplyV3ParserBaseVisitor<ASTNode> {

    CompilationUnitNode compilationUnitNode;
    HashSet<String> globalVariableSymbolTable;
    public List<String> syntaxErrors;

    public Cst2Ast(List<String> syntaxErrors) {
        this.compilationUnitNode = new CompilationUnitNode();
        this.globalVariableSymbolTable = new HashSet<>();
        this.syntaxErrors = syntaxErrors;
    }

    @Override
    public ASTNode visitCompilationUnit(SimplyV3Parser.CompilationUnitContext ctx) {

        //visit lib imports
        for(SimplyV3Parser.LibImportContext libImportContext : ctx.libImport()){
            visitLibImport(libImportContext);
        }

        //visit var declarations
        for(SimplyV3Parser.GlobalVariableDeclarationContext globalVariableDeclarationContext : ctx.globalVariableDeclaration()){
            visitGlobalVariableDeclaration(globalVariableDeclarationContext);
        }

        //visit function declarations
        for(SimplyV3Parser.FunctionDeclarationContext functionDeclarationContext : ctx.functionDeclaration()){
            super.visitFunctionDeclaration(functionDeclarationContext);
        }

        return this.compilationUnitNode;

    }

    @Override
    public ASTNode visitLibImport(SimplyV3Parser.LibImportContext ctx) {
        String name = ctx.identifier().getText();
        LibImportNode libImportNode = new LibImportNode(name);
        this.compilationUnitNode.addLibImportNode(libImportNode);
        return libImportNode;
    }

    @Override
    public ASTNode visitIdentifier(SimplyV3Parser.IdentifierContext ctx) {
        return super.visitIdentifier(ctx);
    }

    @Override
    public ASTNode visitGlobalVariableDeclaration(SimplyV3Parser.GlobalVariableDeclarationContext ctx) {

        VariableDeclarationNode variableDeclarationNode;

        if(ctx.variableDeclaration() != null){
            variableDeclarationNode =
                    (VariableDeclarationNode) visitVariableDeclaration(ctx.variableDeclaration());
        }else{
            variableDeclarationNode =
                    (VariableDeclarationNode) visitConstantDeclaration(ctx.constantDeclaration());
        }

        // Check whether variable already exist
        if(this.globalVariableSymbolTable.contains(variableDeclarationNode.getName())){
            this.syntaxErrors.add("Global Variable : " + variableDeclarationNode.getName() + " already exist");
        }

        this.globalVariableSymbolTable.add(variableDeclarationNode.getName());
        this.compilationUnitNode.addGlobalVariableDeclarationNode(variableDeclarationNode);
        return variableDeclarationNode;

    }

    @Override
    public ASTNode visitVariableDeclaration(SimplyV3Parser.VariableDeclarationContext ctx) {
        if(ctx.arrayVariableDeclaration() != null){
            return visitArrayVariableDeclaration(ctx.arrayVariableDeclaration());
        }else{
            return visitPrimitiveVariableDeclaration(ctx.primitiveVariableDeclaration());
        }
    }

    @Override
    public ASTNode visitConstantDeclaration(SimplyV3Parser.ConstantDeclarationContext ctx) {

        VariableDeclarationNode variableDeclarationNode =
                (VariableDeclarationNode) visitVariableDeclaration(ctx.variableDeclaration());
        variableDeclarationNode.setConst();

        return variableDeclarationNode;

    }

    @Override
    public ASTNode visitPrimitiveVariableDeclaration(SimplyV3Parser.PrimitiveVariableDeclarationContext ctx) {

        DataType dataType = DataTypeMapper.getType(ctx.nonVoidDataTypeName().getText());
        String varName = ctx.identifier().getText();
        ExpressionNode expressionNode = (ExpressionNode) visitExpression(ctx.expression());

        return new PrimitiveVariableDeclarationNode(
                false,
                dataType,
                varName,
                expressionNode
        );
    }

    @Override
    public ASTNode visitNonVoidDataTypeName(SimplyV3Parser.NonVoidDataTypeNameContext ctx) {
        return super.visitNonVoidDataTypeName(ctx);
    }

    @Override
    public ASTNode visitExpression(SimplyV3Parser.ExpressionContext ctx) {
        return visitArithmaticExpression(ctx.arithmaticExpression());
    }

    @Override
    public ASTNode visitArithmaticExpression(SimplyV3Parser.ArithmaticExpressionContext ctx) {
        if(ctx.MUL() != null){

            ExpressionNode left = (ExpressionNode) visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            return new ArithmeticExpressionNode.MultiplicationExpressionNode(left, right);

        }else if(ctx.DIV() != null){

            ExpressionNode left = (ExpressionNode) visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            return new ArithmeticExpressionNode.DivisionExpressionNode(left, right);

        }else if(ctx.SUB() != null){

            ExpressionNode left = (ExpressionNode) visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            return new ArithmeticExpressionNode.SubtractionExpressionNode(left, right);

        }else if(ctx.ADD() != null){

            ExpressionNode left = (ExpressionNode) visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = (ExpressionNode) visitLogicExpression(ctx.logicExpression());

            return new ArithmeticExpressionNode.AdditionExpressionNode(left, right);

        }else if(ctx.MOD() != null){

            ExpressionNode left = (ExpressionNode) visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            return new ArithmeticExpressionNode.ModulusExpressionNode(left, right);

        }else{

            return visitLogicExpression(ctx.logicExpression());

        }
    }

    @Override
    public ASTNode visitLogicExpression(SimplyV3Parser.LogicExpressionContext ctx) {
        if(ctx.OR() != null){

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new LogicExpressionNode.OrExpressionNode(left, right);

        }else if(ctx.AND() != null){

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new LogicExpressionNode.AndExpressionNode(left, right);

        }else if(ctx.GT() != null){

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new LogicExpressionNode.GreaterThanExpressionNode(left, right);

        }else if(ctx.LT() != null){

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new LogicExpressionNode.LessThanExpressionNode(left, right);

        }else if(ctx.GE() != null){

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new LogicExpressionNode.GreaterOrEqualThanExpressionNode(left, right);

        }else if(ctx.LE() != null){

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new LogicExpressionNode.LessOrEqualThanExpressionNode(left, right);

        }else if(ctx.EQUAL() != null){

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new LogicExpressionNode.EqualsExpressionNode(left, right);

        }else if(ctx.NOTEQUAL() != null){

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new LogicExpressionNode.NotEqualsExpressionNode(left, right);

        }else{

            return visitUnaryExpression(ctx.unaryExpression());

        }

    }
}
