package visitors;

import antlr.gen.SimplyV3Parser.*;
import antlr.gen.SimplyV3ParserBaseVisitor;
import ast.ASTNode;
import ast.ArgNode;
import ast.ArithmeticExpressionNode.*;
import ast.ArrayAccessExpressionNode;
import ast.ArrayInitializationNode;
import ast.ArrayVariableDeclarationNode;
import ast.AssignmentStatementNode;
import ast.BlockNode;
import ast.CompilationUnitNode;
import ast.EmptyArrayInitializationNode;
import ast.ExpressionNode;
import ast.FunctionCallExpressionNode;
import ast.FunctionCallStatementNode;
import ast.FunctionDeclarationNode;
import ast.FunctionDeclarationNode.FunctionSignatureNode;
import ast.IdentifierExpressionNode;
import ast.IfStatementNode;
import ast.IfStatementNode.ElseBlockNode;
import ast.IfStatementNode.IfBlockNode;
import ast.IterateStatementNode;
import ast.IterateStatementNode.IterateConditionExpressionNode;
import ast.LibImportNode;
import ast.LiteralExpressionNode;
import ast.LoopControlStatementNode;
import ast.NonEmptyArrayInitializationNode;
import ast.PrimitiveVariableDeclarationNode;
import ast.ReturnStatementNode;
import ast.StatementNode;
import ast.VariableDeclarationNode;
import ast.util.AssignmentOperatorMapper;
import ast.util.DataTypeMapper;
import ast.util.enums.AssignmentOperator;
import ast.util.enums.DataType;
import ast.util.enums.LoopControlOperator;

import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;

import static ast.AssignmentStatementNode.ArrayVariableAssignmentStatementNode;
import static ast.AssignmentStatementNode.PrimitiveVariableAssignmentStatementNode;
import static ast.LiteralExpressionNode.*;
import static ast.LogicExpressionNode.*;

public class Cst2Ast extends SimplyV3ParserBaseVisitor<ASTNode> {

    public List<String> syntaxErrors;
    CompilationUnitNode compilationUnitNode;
    HashSet<String> globalVariableSymbolTable;

    public Cst2Ast(List<String> syntaxErrors) {
        this.compilationUnitNode = new CompilationUnitNode();
        this.globalVariableSymbolTable = new HashSet<>();
        this.syntaxErrors = syntaxErrors;
    }

    @Override
    public CompilationUnitNode visitCompilationUnit(CompilationUnitContext ctx) {

        //visit lib imports
        for (LibImportContext libImportContext : ctx.libImport()) {
            visitLibImport(libImportContext);
        }

        //visit var declarations
        for (GlobalVariableDeclarationContext globalVariableDeclarationContext : ctx.globalVariableDeclaration()) {
            visitGlobalVariableDeclaration(globalVariableDeclarationContext);
        }

        //visit function declarations
        for (FunctionDeclarationContext functionDeclarationContext : ctx.functionDeclaration()) {
            visitFunctionDeclaration(functionDeclarationContext);
        }
        
        return this.compilationUnitNode;

    }

    @Override
    public LibImportNode visitLibImport(LibImportContext ctx) {
        String name = ctx.identifier().getText();
        LibImportNode libImportNode = new LibImportNode(name);
        this.compilationUnitNode.addLibImportNode(libImportNode);
        return libImportNode;
    }

    @Override
    public VariableDeclarationNode visitGlobalVariableDeclaration(GlobalVariableDeclarationContext ctx) {

        VariableDeclarationNode variableDeclarationNode;

        if(ctx.elementDeclaration() instanceof VariableDeclarationRuleContext){
            variableDeclarationNode = visitVariableDeclaration(((VariableDeclarationRuleContext) ctx
                    .elementDeclaration()).variableDeclaration());
        }else{
            // instance of ConstantDeclarationRuleContext
            variableDeclarationNode = visitConstantDeclaration(((ConstantDeclarationRuleContext) ctx
                    .elementDeclaration()).constantDeclaration());
        }


        // Check whether variable already exist
        if (this.globalVariableSymbolTable.contains(variableDeclarationNode.getName())) {
            this.syntaxErrors.add("Global Variable : " + variableDeclarationNode.getName() + " already exist");
        }

        this.globalVariableSymbolTable.add(variableDeclarationNode.getName());
        this.compilationUnitNode.addGlobalVariableDeclarationNode(variableDeclarationNode);
        return variableDeclarationNode;

    }

    @Override
    public VariableDeclarationNode visitVariableDeclaration(VariableDeclarationContext ctx) {
        if (ctx.arrayVariableDeclaration() != null) {
            return visitArrayVariableDeclaration(ctx.arrayVariableDeclaration());
        } else {
            return visitPrimitiveVariableDeclaration(ctx.primitiveVariableDeclaration());
        }
    }

    @Override
    public VariableDeclarationNode visitConstantDeclaration(ConstantDeclarationContext ctx) {

        VariableDeclarationNode variableDeclarationNode =
                visitVariableDeclaration(ctx.variableDeclaration());
        variableDeclarationNode.setConst();

        return variableDeclarationNode;

    }

    @Override
    public PrimitiveVariableDeclarationNode visitPrimitiveVariableDeclaration(PrimitiveVariableDeclarationContext ctx) {

        DataType dataType = DataTypeMapper.getType(ctx.nonVoidDataTypeName().getText());
        String varName = ctx.identifier().getText();

        // TODO: If expression is a function call -> Syntax Error
        ExpressionNode expressionNode = visitExpression(ctx.expression());

        return new PrimitiveVariableDeclarationNode(
                false,
                dataType,
                varName,
                expressionNode
        );
    }

    @Override
    public ExpressionNode visitExpression(ExpressionContext ctx) {
        return visitArithmaticExpression(ctx.arithmaticExpression());
    }

    @Override
    public ExpressionNode visitArithmaticExpression(ArithmaticExpressionContext ctx) {
        if (ctx.MUL() != null) {

            ExpressionNode left = visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = visitLogicExpression(ctx.logicExpression());
            return new MultiplicationExpressionNode(left, right);

        } else if (ctx.DIV() != null) {

            ExpressionNode left = visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = visitLogicExpression(ctx.logicExpression());
            return new DivisionExpressionNode(left, right);

        } else if (ctx.SUB() != null) {

            ExpressionNode left = visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = visitLogicExpression(ctx.logicExpression());
            return new SubtractionExpressionNode(left, right);

        } else if (ctx.ADD() != null) {

            ExpressionNode left = visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = visitLogicExpression(ctx.logicExpression());

            return new AdditionExpressionNode(left, right);

        } else if (ctx.MOD() != null) {

            ExpressionNode left = visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = visitLogicExpression(ctx.logicExpression());
            return new ModulusExpressionNode(left, right);

        } else {

            return visitLogicExpression(ctx.logicExpression());

        }
    }

    @Override
    public ExpressionNode visitLogicExpression(LogicExpressionContext ctx) {
        if (ctx.OR() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());
            return new OrExpressionNode(left, right);

        } else if (ctx.AND() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());
            return new AndExpressionNode(left, right);

        } else if (ctx.GT() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());
            return new GreaterThanExpressionNode(left, right);

        } else if (ctx.LT() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());
            return new LessThanExpressionNode(left, right);

        } else if (ctx.GE() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());
            return new GreaterOrEqualThanExpressionNode(left, right);

        } else if (ctx.LE() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());
            return new LessOrEqualThanExpressionNode(left, right);

        } else if (ctx.EQUAL() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());
            return new EqualsExpressionNode(left, right);

        } else if (ctx.NOTEQUAL() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());
            return new NotEqualsExpressionNode(left, right);

        } else {

            return visitUnaryExpression(ctx.unaryExpression());

        }

    }

    public ExpressionNode visitUnaryExpression(UnaryExpressionContext ctx) {
        if (ctx instanceof ParenExpressionContext) {

            return visitExpression(((ParenExpressionContext) ctx).expression());

        } else if (ctx instanceof PrefixPlusExpressionContext) {

            return visitExpression((((PrefixPlusExpressionContext) ctx).expression()));

        } else if (ctx instanceof PrefixMinusExpressionContext) {

            return visitExpression(((PrefixMinusExpressionContext) ctx).expression());

        } else if (ctx instanceof PrefixNotExpressionContext) {

            return visitExpression(((PrefixNotExpressionContext) ctx).expression());

        } else if (ctx instanceof FunctionCallExpressionContext) {

            return visitFunctionCallExpression((FunctionCallExpressionContext) ctx);


        } else if (ctx instanceof LiteralExpressionContext) {

            LiteralContext literalContext =
                    ((LiteralExpressionContext) ctx).literal();

            LiteralExpressionNode literalExpressionNode;

            if (literalContext instanceof IntegerLiteralContext) {

                int value =
                        Integer.parseInt(
                                ((IntegerLiteralContext) literalContext).IntegerLiteral().getText()
                        );

                literalExpressionNode = new IntegerLiteralExpression(value);

            } else if (literalContext instanceof FloatLiteralContext) {

                float value =
                        Float.parseFloat(
                                ((FloatLiteralContext) literalContext).FloatLiteral().getText()
                        );

                literalExpressionNode = new FloatLiteralExpression(value);

            } else if (literalContext instanceof CharLiteralContext) {

                char value =
                        ((CharLiteralContext) literalContext).CharLiteral().getText().charAt(0);

                literalExpressionNode = new CharLiteralExpression(value);

            } else if (literalContext instanceof StringLiteralContext) {

                String value =
                        ((StringLiteralContext) literalContext).StringLiteral().getText();

                literalExpressionNode = new StringLiteralExpression(value);

            } else {

                boolean value =
                        Boolean.parseBoolean(
                                ((BoolLiteralContext) literalContext).BoolLiteral().getText()
                        );

                literalExpressionNode = new BoolLiteralExpression(value);
            }

            return literalExpressionNode;
        } else if (ctx instanceof VariableAccessExpressionContext) {

            String name = ((VariableAccessExpressionContext) ctx).identifier().getText();

            return new IdentifierExpressionNode(name);

        } else{
            // instance of ArrayAccessExpressionContext
            String name = ((ArrayAccessExpressionContext) ctx)
                    .arrayAccess().identifier().Identifier().getText();

            ExpressionNode expressionNode = visitExpression(
                    ((ArrayAccessExpressionContext) ctx).arrayAccess().expression());

            return new ArrayAccessExpressionNode(name, expressionNode);

        }
    }

    @Override
    public ArrayVariableDeclarationNode visitArrayVariableDeclaration(ArrayVariableDeclarationContext ctx) {

        String arrayName = ctx.identifier().getText();
        DataType dataType = DataTypeMapper.getType(ctx.nonVoidDataTypeName().getText());

        ArrayInitializationNode arrayInitializationNode =
                visitArrayInitialization(ctx.arrayIntialization());

        return new ArrayVariableDeclarationNode(false, dataType, arrayName, arrayInitializationNode);

    }


    public ArrayInitializationNode visitArrayInitialization(ArrayIntializationContext ctx) {
        if (ctx instanceof EmptyArrayInitializationContext) {
            return visitEmptyArrayInitialization((EmptyArrayInitializationContext) ctx);
        } else {
            return visitNonEmptyArrayInitialization((NonEmptyArrayInitializationContext) ctx);
        }
    }


    @Override
    public EmptyArrayInitializationNode visitEmptyArrayInitialization(EmptyArrayInitializationContext ctx) {
        return new EmptyArrayInitializationNode();
    }

    @Override
    public NonEmptyArrayInitializationNode visitNonEmptyArrayInitialization(NonEmptyArrayInitializationContext ctx) {
        NonEmptyArrContext nonEmptyArrContext = ctx.nonEmptyArr();

        NonEmptyArrayInitializationNode nonEmptyArrayInitializationNode =
                new NonEmptyArrayInitializationNode();

        List<ArrayValueContext> arrayValueContextListList =
                nonEmptyArrContext.arrayValues().arrayValue();

        for (ArrayValueContext arrayValue : arrayValueContextListList) {
            nonEmptyArrayInitializationNode.addValues(
                    visitExpression(arrayValue.expression())
            );
        }

        return nonEmptyArrayInitializationNode;
    }

    @Override
    public FunctionDeclarationNode visitFunctionDeclaration(FunctionDeclarationContext ctx) {
        DataType returnType = DataTypeMapper.getType(
                ctx.dataTypeName().getText()
        );

        FunctionSignatureNode functionSignatureNode =
                visitFunctionSignature(ctx.functionSignature());

        BlockNode blockNode =
                visitBlock(ctx.block());

        return new FunctionDeclarationNode(functionSignatureNode, returnType, blockNode);


    }

    @Override
    public FunctionSignatureNode visitFunctionSignature(FunctionSignatureContext ctx) {
        String functionName = ctx.identifier().getText();

        FunctionSignatureNode functionSignatureNode =
                new FunctionSignatureNode(functionName);

        List<ArgContext> argContextList = ctx.argList().arg();

        for (ArgContext argContext : argContextList) {
            functionSignatureNode.addArguments(
                    visitArg(argContext)
            );
        }

        return functionSignatureNode;
    }


    @Override
    public ArgNode visitArg(ArgContext ctx) {
        String varName = ctx.identifier().getText();
        DataType dataType = DataTypeMapper.getType(ctx.nonVoidDataTypeName().getText());

        return new ArgNode(dataType, varName);
    }

    @Override
    public BlockNode visitBlock(BlockContext ctx) {

        return visitBlockBody(ctx.blockBody());

    }


    // Visit Statement Rules
    public StatementNode visitStatementRule(StatementContext ctx) {
        if (ctx instanceof IfStatementRuleContext) {

            return visitIfStatementRule((IfStatementRuleContext) ctx);

        } else if (ctx instanceof IterateStatementRuleContext) {

            return visitIterateStatementRule((IterateStatementRuleContext) ctx);

        } else if (ctx instanceof AssignmentStatementRuleContext) {

            return visitAssignmentStatementRule((AssignmentStatementRuleContext) ctx);

        } else if (ctx instanceof FuncCallStatementRuleContext) {

            return visitFuncCallStatementRule((FuncCallStatementRuleContext) ctx);

        } else if (ctx instanceof ReturnStatemtntRuleContext) {

            return visitReturnStatemtntRule((ReturnStatemtntRuleContext) ctx);

        } else if (ctx instanceof VariableDeclarationStatementRuleContext) {

            return visitVariableDeclarationStatementRule(
                    (VariableDeclarationStatementRuleContext) ctx);

        } else if (ctx instanceof ConstantDeclarationStatementRuleContext) {

            return visitConstantDeclarationStatementRule(
                    (ConstantDeclarationStatementRuleContext) ctx);

        } else {

            return visitLoopControlStatementRule(
                    (LoopControlStatementRuleContext) ctx);

        }
    }

    @Override
    public IfStatementNode visitIfStatementRule(IfStatementRuleContext ctx) {

        IfStatementContext ifStatementContext =
                ctx.ifStatement();

        IfBlockNode ifBlockNode =
                visitIfBlock(ifStatementContext.ifBlock());

        IfStatementNode ifStatementNode;

        if (ctx.ifStatement().elseBlock() != null) {
            ElseBlockNode elseBlockNode =
                    visitElseBlock(ctx.ifStatement().elseBlock());

            ifStatementNode = new IfStatementNode(ifBlockNode, elseBlockNode);
        } else {
            ifStatementNode = new IfStatementNode(ifBlockNode);
        }

        List<ElseIfBlockContext> elseIfBlockContexts =
                ctx.ifStatement().elseIfBlock();

        for (ElseIfBlockContext elseIfBlockContext : elseIfBlockContexts) {
            ifStatementNode.addElseIfBlockNode(
                    visitIfBlock(elseIfBlockContext.ifBlock())
            );
        }

        return ifStatementNode;

    }

    @Override
    public IfBlockNode visitIfBlock(IfBlockContext ctx) {

        ExpressionNode expressionNode =
                visitExpression(ctx.ifConditionExpression().expression());

        BlockNode blockNode = visitBlock(ctx.block());
        return new IfBlockNode(expressionNode, blockNode);

    }

    @Override
    public ElseBlockNode visitElseBlock(ElseBlockContext ctx) {

        BlockNode blockNode = visitBlock(ctx.block());
        return new ElseBlockNode(blockNode);

    }

    @Override
    public BlockNode visitBlockBody(BlockBodyContext ctx) {

        List<StatementContext> statementContextList =
                ctx.statements().statement();

        BlockNode blockNode = new BlockNode();

        for (StatementContext statementContext : statementContextList) {
            blockNode.addStatementNode(
                    visitStatementRule(statementContext)
            );
        }

        return blockNode;
    }

    @Override
    public IterateStatementNode visitIterateStatementRule(IterateStatementRuleContext ctx) {
        IterateStatementContext iterateStatementContext =
                ctx.iterateStatement();

        IterateConditionExpressionNode iterateConditionExpressionNode =
                visitIterateConditionExpressionRule(iterateStatementContext.iterateConditionExpression());

        BlockNode blockNode = visitBlock(iterateStatementContext.block());

        return new IterateStatementNode(iterateConditionExpressionNode, blockNode);
    }

    // Visit Iterate Condition Expression
    public IterateConditionExpressionNode visitIterateConditionExpressionRule(IterateConditionExpressionContext ctx) {
        if (ctx instanceof BooleanIterateExpressionRuleContext) {

            ExpressionNode expressionNode = visitExpression(((BooleanIterateExpressionRuleContext) ctx).expression());

            return new IterateConditionExpressionNode
                    .BooleanIterateExpressionNode(expressionNode);


        } else if (ctx instanceof RangeIterateExpressionRuleContext) {

            ArgNode argNode = visitArg(((RangeIterateExpressionRuleContext) ctx).rangeExpression().arg());

            ExpressionNode fromExpression = visitExpression(((RangeIterateExpressionRuleContext) ctx)
                    .rangeExpression().fromExpression().expression());

            ExpressionNode toExpression = visitExpression(((RangeIterateExpressionRuleContext) ctx)
                    .rangeExpression().toExpression().expression());

            return new
                    IterateConditionExpressionNode.
                            RangeIterateExpressionNode(argNode, fromExpression, toExpression);

        } else if (ctx instanceof ArrayIterateExpressionRuleContext) {
            ArgNode argNode = visitArg(((ArrayIterateExpressionRuleContext) ctx)
                    .arrayIterateExpression().arg());

            ExpressionNode expressionNode = visitExpression(((ArrayIterateExpressionRuleContext) ctx)
                    .arrayIterateExpression().expression());

            return new IterateConditionExpressionNode
                    .ArrayIterateExpressionNode(argNode, expressionNode);
        }

        return null;
    }

    @Override
    public AssignmentStatementNode visitAssignmentStatementRule(AssignmentStatementRuleContext ctx) {
        if (ctx.assignmentStatement() instanceof PrimitiveVariableAssignmentRuleContext) {
            return visitPrimitiveVariableAssignment(((PrimitiveVariableAssignmentRuleContext)
                    ctx.assignmentStatement()).primitiveVariableAssignment());
        } else if (ctx.assignmentStatement() instanceof ArrayVariableAssignmentRuleContext) {
            return visitArrayVariableAssignment(((ArrayVariableAssignmentRuleContext)
                    ctx.assignmentStatement()).arrayVariableAssignment());
        } else {
            return null;
        }
    }

    @Override
    public PrimitiveVariableAssignmentStatementNode visitPrimitiveVariableAssignment(PrimitiveVariableAssignmentContext ctx) {

        String name = ctx.identifier().getText();

        AssignmentOperator operator = AssignmentOperatorMapper.getAssignmentOperator(
                ctx.assignmentOperator().getText()
        );

        ExpressionNode expressionNode =
                visitExpression(ctx.expression());

        return new PrimitiveVariableAssignmentStatementNode(name, operator, expressionNode);
    }

    @Override
    public ArrayVariableAssignmentStatementNode visitArrayVariableAssignment(ArrayVariableAssignmentContext ctx) {

        String name = ctx.arrayAccess().identifier().getText();

        AssignmentOperator operator = AssignmentOperatorMapper.getAssignmentOperator(
                ctx.assignmentOperator().getText()
        );

        ExpressionNode expressionNode =
                visitExpression(ctx.expression());

        return new ArrayVariableAssignmentStatementNode(name, operator, expressionNode);
    }

    @Override
    public FunctionCallStatementNode visitFuncCallStatementRule(FuncCallStatementRuleContext ctx) {
        FunctionCallExpressionNode functionCallExpressionNode = (FunctionCallExpressionNode)
                visitFuncCall(ctx.funcCallStatement().funcCall());

        return new FunctionCallStatementNode(functionCallExpressionNode);
    }

    @Override
    public ExpressionNode visitFunctionCallExpression(FunctionCallExpressionContext ctx) {
        return visitFuncCall(ctx.funcCall());
    }

    @Override
    public ExpressionNode visitFuncCall(FuncCallContext ctx) {
        String funcName = ctx.identifier().getText();

        List<ExpressionContext> paramList = ctx.funcCallParamList().expression();

        FunctionCallExpressionNode functionCallExpressionNode;

        if (ctx.libRef() != null) {
            String libRef = ctx.libRef().getText();
            functionCallExpressionNode = new FunctionCallExpressionNode(libRef, funcName);
        } else {
            functionCallExpressionNode = new FunctionCallExpressionNode(funcName);
        }

        for (ExpressionContext param : paramList) {
            ExpressionNode expressionNode = visitExpression(param);
            functionCallExpressionNode.addParameter(expressionNode);
        }

        return functionCallExpressionNode;
    }


    @Override
    public ReturnStatementNode visitReturnStatemtntRule(ReturnStatemtntRuleContext ctx) {
        ExpressionNode expressionNode = visitExpression(ctx.returnStatemtnt().expression());

        return new ReturnStatementNode(expressionNode);
    }

    @Override
    public VariableDeclarationNode visitVariableDeclarationStatementRule(VariableDeclarationStatementRuleContext ctx) {
        return visitVariableDeclaration(ctx.variableDeclaration());
    }

    @Override
    public VariableDeclarationNode visitConstantDeclarationStatementRule(ConstantDeclarationStatementRuleContext ctx) {
        return visitConstantDeclaration(ctx.constantDeclaration());
    }

    @Override
    public LoopControlStatementNode visitLoopControlStatementRule(LoopControlStatementRuleContext ctx) {

        String loopControlOperator = ctx.loopControlStatement().getText();

        if (loopControlOperator.equals("continue")) {
            return new LoopControlStatementNode(LoopControlOperator.Continue);
        } else if (loopControlOperator.equals("break")) {
            return new LoopControlStatementNode(LoopControlOperator.Break);
        } else {
            return null;
        }

    }
}
