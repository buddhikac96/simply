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

        // TODO: If expression is a function call -> Syntax Error
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

    public ASTNode visitUnaryExpression(SimplyV3Parser.UnaryExpressionContext ctx) {
        if(ctx instanceof SimplyV3Parser.ParenExpressionContext) {

            return visitExpression(((SimplyV3Parser.ParenExpressionContext) ctx).expression());

        }else if(ctx instanceof SimplyV3Parser.PrefixPlusExpressionContext){

            return visitExpression((((SimplyV3Parser.PrefixPlusExpressionContext) ctx).expression()));

        }else if(ctx instanceof SimplyV3Parser.PrefixMinusExpressionContext){

            return visitExpression(((SimplyV3Parser.PrefixMinusExpressionContext) ctx).expression());

        }else if(ctx instanceof SimplyV3Parser.PrefixNotExpressionContext){

            return visitExpression(((SimplyV3Parser.PrefixNotExpressionContext) ctx).expression());

        }else if(ctx instanceof SimplyV3Parser.FunctionCallExpressionContext){

            SimplyV3Parser.FunctionCallExpressionContext funcCallCtx =
                    (SimplyV3Parser.FunctionCallExpressionContext) ctx;

            String libRef = "";

            if(funcCallCtx.funcCall().libRef() != null){
                libRef = funcCallCtx.funcCall().libRef().getText();
            }

            String funcName = funcCallCtx.funcCall().identifier().getText();

            FunctionCallExpressionNode functionCallExpressionNode = new FunctionCallExpressionNode(libRef, funcName);

            for(int i = 0; i < funcCallCtx.funcCall().funcCallParamList().expression().size(); i++){
                functionCallExpressionNode.addParameter(
                        (ExpressionNode) visitExpression(
                                funcCallCtx.funcCall().funcCallParamList().expression(i)
                        )
                );
            }

            return functionCallExpressionNode;

        }else if(ctx instanceof SimplyV3Parser.LiteralExpressionContext){

            SimplyV3Parser.LiteralContext literalContext =
                    ((SimplyV3Parser.LiteralExpressionContext) ctx).literal();

            LiteralExpressionNode literalExpressionNode;

            if(literalContext instanceof SimplyV3Parser.IntegerLiteralContext){

                int value =
                        Integer.parseInt(
                                ((SimplyV3Parser.IntegerLiteralContext) literalContext).IntegerLiteral().getText()
                        );

                literalExpressionNode = new LiteralExpressionNode.IntegerLiteralExpression(value);

            }else if(literalContext instanceof SimplyV3Parser.FloatLiteralContext){

                float value =
                        Float.parseFloat(
                                ((SimplyV3Parser.FloatLiteralContext) literalContext).FloatLiteral().getText()
                        );

                literalExpressionNode = new LiteralExpressionNode.FloatLiteralExpression(value);

            }else if(literalContext instanceof SimplyV3Parser.CharLiteralContext){

                char value =
                        ((SimplyV3Parser.CharLiteralContext) literalContext).CharLiteral().getText().charAt(0);

                literalExpressionNode = new LiteralExpressionNode.CharLiteralExpression(value);

            }else if(literalContext instanceof SimplyV3Parser.StringLiteralContext){

                String value =
                        ((SimplyV3Parser.StringLiteralContext) literalContext).StringLiteral().getText();

                literalExpressionNode = new LiteralExpressionNode.StringLiteralExpression(value);

            }else{

                boolean value =
                        Boolean.parseBoolean(
                                ((SimplyV3Parser.BoolLiteralContext) literalContext).BoolLiteral().getText()
                        );

                literalExpressionNode = new LiteralExpressionNode.BoolLiteralExpression(value);
            }

            return literalExpressionNode;
        }else if(ctx instanceof SimplyV3Parser.ArrayAccessExpressionContext){

            System.out.println("Array access expression");

            String arrayName = ((SimplyV3Parser.ArrayAccessExpressionContext) ctx).identifier().getText();
            ExpressionNode accessValueExpression =
                    (ExpressionNode) visitExpression(
                            ((SimplyV3Parser.ArrayAccessExpressionContext) ctx).arrayAccess().expression()
                    );

            return new ArrayAccessExpressionNode(arrayName, accessValueExpression);

        }

        return null;
    }

    @Override
    public ASTNode visitArrayVariableDeclaration(SimplyV3Parser.ArrayVariableDeclarationContext ctx) {

        String arrayName = ctx.identifier().getText();
        DataType dataType = DataTypeMapper.getType(ctx.nonVoidDataTypeName().getText());

        ArrayInitializationNode arrayInitializationNode =
                (ArrayInitializationNode) visitArrayInitialization(ctx.arrayIntialization());

        return new ArrayVariableDeclarationNode(false, dataType, arrayName, arrayInitializationNode);

    }


    public ASTNode visitArrayInitialization(SimplyV3Parser.ArrayIntializationContext ctx) {
        if(ctx instanceof SimplyV3Parser.EmptyArrayInitializationContext){
            return visitEmptyArrayInitialization((SimplyV3Parser.EmptyArrayInitializationContext) ctx);
        }else{
            return visitNonEmptyArrayInitialization((SimplyV3Parser.NonEmptyArrayInitializationContext) ctx);
        }
    }


    @Override
    public ASTNode visitEmptyArrayInitialization(SimplyV3Parser.EmptyArrayInitializationContext ctx) {
        return new EmptyArrayInitializationNode();
    }

    @Override
    public ASTNode visitNonEmptyArrayInitialization(SimplyV3Parser.NonEmptyArrayInitializationContext ctx) {
        SimplyV3Parser.NonEmptyArrContext nonEmptyArrContext = ctx.nonEmptyArr();

        NonEmptyArrayInitializationNode nonEmptyArrayInitializationNode =
                new NonEmptyArrayInitializationNode();

        List<SimplyV3Parser.ArrayValueContext> arrayValueContextListList =
                nonEmptyArrContext.arrayValues().arrayValue();

        for(SimplyV3Parser.ArrayValueContext arrayValue : arrayValueContextListList){
            nonEmptyArrayInitializationNode.addValues(
                    (ExpressionNode) visitExpression(arrayValue.expression())
            );
        }

        return nonEmptyArrayInitializationNode;
    }

    @Override
    public ASTNode visitFunctionDeclaration(SimplyV3Parser.FunctionDeclarationContext ctx) {
        DataType returnType = DataTypeMapper.getType(
                ctx.dataTypeName().getText()
        );

        FunctionDeclarationNode.FunctionSignatureNode functionSignatureNode =
                (FunctionDeclarationNode.FunctionSignatureNode) visitFunctionSignature(ctx.functionSignature());

        BlockNode blockNode =
                (BlockNode) visitBlock(ctx.block());

        return new FunctionDeclarationNode(functionSignatureNode, returnType, blockNode);


    }

    @Override
    public ASTNode visitFunctionSignature(SimplyV3Parser.FunctionSignatureContext ctx) {
        String functionName = ctx.identifier().getText();

        FunctionDeclarationNode.FunctionSignatureNode functionSignatureNode =
                new FunctionDeclarationNode.FunctionSignatureNode(functionName);

        List<SimplyV3Parser.ArgContext> argContextList = ctx.argList().arg();

        for(SimplyV3Parser.ArgContext argContext : argContextList){
            functionSignatureNode.addArguments(
                    (FunctionDeclarationNode.FunctionArgumentNode) visitArg(argContext)
            );
        }

        return functionSignatureNode;
    }


    @Override
    public ASTNode visitArg(SimplyV3Parser.ArgContext ctx) {
        String varName = ctx.identifier().getText();
        DataType dataType = DataTypeMapper.getType(ctx.nonVoidDataTypeName().getText());

        return new ArgNode(dataType, varName);
    }

    @Override
    public ASTNode visitBlock(SimplyV3Parser.BlockContext ctx) {
        BlockNode blockNode = new BlockNode();

        List<SimplyV3Parser.StatementContext> statementContextList = ctx.blockBody().statements().statement();

        for(SimplyV3Parser.StatementContext statementContext : statementContextList){
            blockNode.addStatementNode(
                    (StatementNode) visitStatementRule(statementContext)
            );
        }

        return blockNode;

    }


    // Visit Statement Rules
    public ASTNode visitStatementRule(SimplyV3Parser.StatementContext ctx) {
        if(ctx instanceof SimplyV3Parser.IfStatementRuleContext){

            return visitIfStatementRule((SimplyV3Parser.IfStatementRuleContext) ctx);

        }else if(ctx instanceof SimplyV3Parser.IterateStatementRuleContext){

            return visitIterateStatementRule((SimplyV3Parser.IterateStatementRuleContext) ctx);

        }else if(ctx instanceof SimplyV3Parser.AssignmentStatementRuleContext){

            return visitAssignmentStatementRule((SimplyV3Parser.AssignmentStatementRuleContext) ctx);

        }else if(ctx instanceof SimplyV3Parser.FuncCallStatementRuleContext){

            return visitFuncCallStatementRule((SimplyV3Parser.FuncCallStatementRuleContext) ctx);

        }else if(ctx instanceof SimplyV3Parser.ReturnStatemtntRuleContext){

            return visitReturnStatemtntRule((SimplyV3Parser.ReturnStatemtntRuleContext) ctx);

        }else if(ctx instanceof SimplyV3Parser.VariableDeclarationStatementRuleContext){

            return visitVariableDeclarationStatementRule(
                    (SimplyV3Parser.VariableDeclarationStatementRuleContext) ctx);

        }else if(ctx instanceof SimplyV3Parser.ConstantDeclarationStatementRuleContext){

            return visitConstantDeclarationStatementRule(
                    (SimplyV3Parser.ConstantDeclarationStatementRuleContext) ctx);

        }else{

            return visitLoopControlStatementRule(
                    (SimplyV3Parser.LoopControlStatementRuleContext) ctx);

        }
    }

    @Override
    public ASTNode visitIfStatementRule(SimplyV3Parser.IfStatementRuleContext ctx) {

        System.out.println("if statement");

        SimplyV3Parser.IfStatementContext ifStatementContext =
                ctx.ifStatement();

        IfStatementNode.IfBlockNode ifBlockNode =
                (IfStatementNode.IfBlockNode) visitIfBlock(ifStatementContext.ifBlock());

        IfStatementNode.ElseBlockNode elseBlockNode =
                (IfStatementNode.ElseBlockNode) visitElseBlock(ctx.ifStatement().elseBlock());

        IfStatementNode ifStatementNode = new IfStatementNode(ifBlockNode, elseBlockNode);

        List<SimplyV3Parser.ElseIfBlockContext> elseIfBlockContexts =
                ctx.ifStatement().elseIfBlock();

        for(SimplyV3Parser.ElseIfBlockContext elseIfBlockContext : elseIfBlockContexts){
            ifStatementNode.addElseIfBlockNode(
                    (IfStatementNode.IfBlockNode) visitIfBlock(elseIfBlockContext.ifBlock())
            );
        }

        return ifStatementNode;

    }

    @Override
    public ASTNode visitIterateStatementRule(SimplyV3Parser.IterateStatementRuleContext ctx) {
        return super.visitIterateStatementRule(ctx);
    }

    @Override
    public ASTNode visitAssignmentStatementRule(SimplyV3Parser.AssignmentStatementRuleContext ctx) {
        return super.visitAssignmentStatementRule(ctx);
    }

    @Override
    public ASTNode visitFuncCallStatementRule(SimplyV3Parser.FuncCallStatementRuleContext ctx) {
        return super.visitFuncCallStatementRule(ctx);
    }

    @Override
    public ASTNode visitReturnStatemtntRule(SimplyV3Parser.ReturnStatemtntRuleContext ctx) {
        return super.visitReturnStatemtntRule(ctx);
    }

    @Override
    public ASTNode visitVariableDeclarationStatementRule(SimplyV3Parser.VariableDeclarationStatementRuleContext ctx) {
        return super.visitVariableDeclarationStatementRule(ctx);
    }

    @Override
    public ASTNode visitConstantDeclarationStatementRule(SimplyV3Parser.ConstantDeclarationStatementRuleContext ctx) {
        return super.visitConstantDeclarationStatementRule(ctx);
    }

    @Override
    public ASTNode visitLoopControlStatementRule(SimplyV3Parser.LoopControlStatementRuleContext ctx) {
        return super.visitLoopControlStatementRule(ctx);
    }
}
