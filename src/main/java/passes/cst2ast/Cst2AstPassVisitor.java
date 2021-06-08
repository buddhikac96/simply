package passes.cst2ast;

import antlr.gen.SimplyV3Parser.*;
import antlr.gen.SimplyV3ParserBaseVisitor;
import ast.*;
import ast.ArithmeticExpressionNode.*;
import ast.FunctionDeclarationNode.FunctionSignatureNode;
import ast.IfStatementNode.ElseBlockNode;
import ast.IfStatementNode.IfBlockNode;
import ast.IterateStatementNode.IterateConditionExpressionNode;
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
import static ast.IterateStatementNode.IterateConditionExpressionNode.*;
import static ast.LiteralExpressionNode.*;
import static ast.LogicExpressionNode.*;

public class Cst2AstPassVisitor extends SimplyV3ParserBaseVisitor<ASTNode> {

    private static final Logger LOGGER = Logger.getLogger(Cst2AstPassVisitor.class.getName());

    public final List<String> syntaxErrors;
    final CompilationUnitNode compilationUnitNode;
    final HashSet<String> globalVariableSymbolTable;

    public Cst2AstPassVisitor(List<String> syntaxErrors) {
        this.compilationUnitNode = new CompilationUnitNode();
        this.globalVariableSymbolTable = new HashSet<>();
        this.syntaxErrors = syntaxErrors;
    }

    @Override
    public CompilationUnitNode visitCompilationUnit(CompilationUnitContext ctx) {

        //visit lib imports
        for (LibImportContext libImportContext : ctx.libImport()) {
            LibImportNode libImportNode = visitLibImport(libImportContext);
            this.compilationUnitNode.addLibImportNode(libImportNode);
        }

        //visit var declarations
        for (GlobalVariableDeclarationContext globalVariableDeclarationContext : ctx.globalVariableDeclaration()) {
            VariableDeclarationNode variableDeclarationNode = visitGlobalVariableDeclaration(globalVariableDeclarationContext);
            this.compilationUnitNode.addGlobalVariableDeclarationNode(variableDeclarationNode);
        }

        //visit function declarations
        for (FunctionDeclarationContext functionDeclarationContext : ctx.functionDeclaration()) {
            FunctionDeclarationNode functionDeclarationNode = visitFunctionDeclaration(functionDeclarationContext);
            this.compilationUnitNode.addFunctionDeclarationNode(functionDeclarationNode);
        }

        //Logger.info("CompilationUnitNode created");
        return this.compilationUnitNode;

    }

    @Override
    public LibImportNode visitLibImport(LibImportContext ctx) {
        String name = ctx.identifier().getText();

        //Logger.info("LibImportNode created");
        return new LibImportNode(name);
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
        if (this.globalVariableSymbolTable.contains(variableDeclarationNode.getName().getIdentifierName())) {
            this.syntaxErrors.add("Global Variable : " + variableDeclarationNode.getName() + " already exist");
        }

        this.globalVariableSymbolTable.add(variableDeclarationNode.getName().getIdentifierName());

        //Logger.info("VariableDeclarationNode created");
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

        //Logger.info("VariableDeclarationNode created");
        return variableDeclarationNode;

    }

    @Override
    public PrimitiveVariableDeclarationNode visitPrimitiveVariableDeclaration(PrimitiveVariableDeclarationContext ctx) {

        DataType dataType = DataTypeMapper.getSimplyTypeClass(ctx.nonVoidDataTypeName().getText());
        IdentifierNode varName = new IdentifierNode(ctx.identifier().getText());

        ExpressionNode expressionNode = null;
        if(ctx.expression() != null){
            expressionNode = visitExpression(ctx.expression());
        }

        //Logger.info("PrimitiveVariableDeclarationNode created");
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

            //Logger.info("MultiplicationExpressionNode created");
            return new MultiplicationExpressionNode(left, right);

        } else if (ctx.DIV() != null) {

            ExpressionNode left = visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = visitLogicExpression(ctx.logicExpression());

            //Logger.info("DivisionExpressionNode created");
            return new DivisionExpressionNode(left, right);

        } else if (ctx.SUB() != null) {

            ExpressionNode left = visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = visitLogicExpression(ctx.logicExpression());

            //Logger.info("SubtractionExpressionNode created");
            return new SubtractionExpressionNode(left, right);

        } else if (ctx.ADD() != null) {

            ExpressionNode left = visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = visitLogicExpression(ctx.logicExpression());

            //Logger.info("AdditionExpressionNode created");
            return new AdditionExpressionNode(left, right);

        } else if (ctx.MOD() != null) {

            ExpressionNode left = visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = visitLogicExpression(ctx.logicExpression());

            //Logger.info("ModulusExpressionNode created");
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

            //Logger.info("OrExpressionNode created");
            return new OrExpressionNode(left, right);

        } else if (ctx.AND() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());

            //Logger.info("AndExpressionNode created");
            return new AndExpressionNode(left, right);

        } else if (ctx.GT() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());

            //Logger.info("GreaterThanExpressionNode created");
            return new GreaterThanExpressionNode(left, right);

        } else if (ctx.LT() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());

            //Logger.info("LessThanExpressionNode created");
            return new LessThanExpressionNode(left, right);

        } else if (ctx.GE() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());

            //Logger.info("GreaterOrEqualThanExpressionNode created");
            return new GreaterOrEqualThanExpressionNode(left, right);

        } else if (ctx.LE() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());

            //Logger.info("LessOrEqualThanExpressionNode created");
            return new LessOrEqualThanExpressionNode(left, right);

        } else if (ctx.EQUAL() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());

            //Logger.info("EqualsExpressionNode created");
            return new EqualsExpressionNode(left, right);

        } else if (ctx.NOTEQUAL() != null) {

            ExpressionNode left = visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = visitUnaryExpression(ctx.unaryExpression());

            //Logger.info("NotEqualsExpressionNode created");
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
            ExpressionNode expressionNode = visitExpression(((PrefixNotExpressionContext) ctx).expression());
            return new UnaryExpressionNode.PrefixNotExpressionNode(expressionNode);

        } else if (ctx instanceof FunctionCallExpressionContext) {

            return visitFunctionCallExpression((FunctionCallExpressionContext) ctx);


        } else if (ctx instanceof LiteralExpressionContext) {

            LiteralContext literalContext =
                    ((LiteralExpressionContext) ctx).literal();

            if (literalContext instanceof IntegerLiteralContext) {

                int value =
                        Integer.parseInt(
                                ((IntegerLiteralContext) literalContext).IntegerLiteral().getText()
                        );

                //Logger.info("IntegerLiteralExpression created");
                return new IntegerLiteralExpressionNode(value);

            } else if (literalContext instanceof FloatLiteralContext) {

                float value =
                        Float.parseFloat(
                                ((FloatLiteralContext) literalContext).FloatLiteral().getText()
                        );

                //Logger.info("FloatLiteralExpression created");
                return new FloatLiteralExpressionNode(value);

            } else if (literalContext instanceof CharLiteralContext) {

                char value =
                        ((CharLiteralContext) literalContext).CharLiteral().getText().charAt(0);

                //Logger.info("CharLiteralExpression created");
                return new CharLiteralExpressionNode(value);

            } else if (literalContext instanceof StringLiteralContext) {

                String value =
                        ((StringLiteralContext) literalContext).StringLiteral().getText();

                //Logger.info("StringLiteralExpression created");
                return new StringLiteralExpressionNode(value);

            } else {

                boolean value =
                        Boolean.parseBoolean(
                                ((BoolLiteralContext) literalContext).BoolLiteral().getText()
                        );

                //Logger.info("BoolLiteralExpression created");
                return new BoolLiteralExpressionNode(value);
            }

        } else if (ctx instanceof VariableAccessExpressionContext) {

            String name = ((VariableAccessExpressionContext) ctx).identifier().getText();

            //Logger.info("IdentifierExpressionNode created");
            return new IdentifierNode(name);

        } else{
            // instance of ArrayAccessExpressionContext
            String name = ((ArrayAccessExpressionContext) ctx)
                    .arrayAccess().identifier().Identifier().getText();

            ExpressionNode expressionNode = visitExpression(
                    ((ArrayAccessExpressionContext) ctx).arrayAccess().expression());

            //Logger.info("ArrayAccessExpressionNode created");
            return new ArrayAccessExpressionNode(name, expressionNode);

        }
    }

    @Override
    public ArrayVariableDeclarationNode visitArrayVariableDeclaration(ArrayVariableDeclarationContext ctx) {

        String arrayName = ctx.identifier().getText();
        DataType dataType = DataTypeMapper.getSimplyTypeClass(ctx.nonVoidDataTypeName().getText());

        ArrayInitializationNode arrayInitializationNode =
                visitArrayInitialization(ctx.arrayIntialization());

        //Logger.info("ArrayVariableDeclarationNode created");
        return new ArrayVariableDeclarationNode(false, dataType, new IdentifierNode(arrayName), arrayInitializationNode);

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
        /*
            Variable declaration without initialization
            Ex: list int arr;
         */

        if(ctx == null){
            return null;
        }

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

        //Logger.info("NonEmptyArrayInitializationNode created");
        return nonEmptyArrayInitializationNode;
    }

    @Override
    public FunctionDeclarationNode visitFunctionDeclaration(FunctionDeclarationContext ctx) {
        DataType returnType = DataTypeMapper.getSimplyTypeClass(
                ctx.dataTypeName().getText()
        );

        FunctionSignatureNode functionSignatureNode =
                visitFunctionSignature(ctx.functionSignature());

        BlockNode blockNode =
                visitBlock(ctx.block());

        //Logger.info("FunctionDeclarationNode created");
        return new FunctionDeclarationNode("simply",functionSignatureNode, returnType, blockNode);
    }

    @Override
    public FunctionSignatureNode visitFunctionSignature(FunctionSignatureContext ctx) {
        String functionName = ctx.identifier().getText();

        FunctionSignatureNode functionSignatureNode =
                new FunctionSignatureNode(new IdentifierNode(functionName));

        List<ArgContext> argContextList = ctx.argList().arg();

        for (ArgContext argContext : argContextList) {
            functionSignatureNode.addArguments(
                    visitArg(argContext)
            );
        }

        //Logger.info("FunctionSignatureNode created");
        return functionSignatureNode;
    }


    @Override
    public ArgNode visitArg(ArgContext ctx) {
        String varName = ctx.identifier().getText();
        DataType dataType = DataTypeMapper.getSimplyTypeClass(ctx.nonVoidDataTypeName().getText());
        boolean isList = ctx.LIST() == null;

        //Logger.info("ArgNode created");
        return new ArgNode(dataType, varName, isList);
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

            return this.visitReturnStatementRule((ReturnStatemtntRuleContext) ctx);

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

        //Logger.info("IfStatementNode created");
        return ifStatementNode;

    }

    @Override
    public IfBlockNode visitIfBlock(IfBlockContext ctx) {

        ExpressionNode expressionNode =
                visitExpression(ctx.ifConditionExpression().expression());

        BlockNode blockNode = visitBlock(ctx.block());

        //Logger.info("IfBlockNode created");
        return new IfBlockNode(expressionNode, blockNode);

    }

    @Override
    public ElseBlockNode visitElseBlock(ElseBlockContext ctx) {

        BlockNode blockNode = visitBlock(ctx.block());

        //Logger.info("ElseBlockNode created");
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

        //Logger.info("BlockNode created");
        return blockNode;
    }

    @Override
    public IterateStatementNode visitIterateStatementRule(IterateStatementRuleContext ctx) {
        IterateStatementContext iterateStatementContext =
                ctx.iterateStatement();

        IterateConditionExpressionNode iterateConditionExpressionNode =
                visitIterateConditionExpressionRule(iterateStatementContext.iterateConditionExpression());

        BlockNode blockNode = visitBlock(iterateStatementContext.block());

        //Logger.info("IterateStatementNode created");
        return new IterateStatementNode(iterateConditionExpressionNode, blockNode);
    }

    // Visit Iterate Condition Expression
    public IterateConditionExpressionNode visitIterateConditionExpressionRule(IterateConditionExpressionContext ctx) {
        if (ctx instanceof BooleanIterateExpressionRuleContext) {

            ExpressionNode expressionNode = visitExpression(((BooleanIterateExpressionRuleContext) ctx).expression());

            //Logger.info("BooleanIterateExpressionNode created");
            return new BooleanIterateExpressionNode(expressionNode);


        } else if (ctx instanceof RangeIterateExpressionRuleContext) {

            ArgNode argNode = visitArg(((RangeIterateExpressionRuleContext) ctx).rangeExpression().arg());

            ExpressionNode fromExpression = visitExpression(((RangeIterateExpressionRuleContext) ctx)
                    .rangeExpression().fromExpression().expression());

            ExpressionNode toExpression = visitExpression(((RangeIterateExpressionRuleContext) ctx)
                    .rangeExpression().toExpression().expression());

            //Logger.info("RangeIterateExpressionNode created");
            return new RangeIterateExpressionNode(argNode, fromExpression, toExpression);

        } else if(ctx instanceof NewrangeExpressionRuleContext){

            ArgNode argNode = visitArg(((NewrangeExpressionRuleContext) ctx).newRangeExpression().arg());

            ExpressionNode fromExpression = visitExpression(((NewrangeExpressionRuleContext) ctx)
                    .newRangeExpression().fromExpression().expression());

            ExpressionNode toExpression = visitExpression(((NewrangeExpressionRuleContext) ctx)
                    .newRangeExpression().toExpression().expression());

            ExpressionNode nextExpression = visitExpression(((NewrangeExpressionRuleContext) ctx)
                    .newRangeExpression().nextExpression().expression());

            //Logger.info("RangeIterateExpressionNode created");
            return new NewRangeExpressionNode(argNode, fromExpression, toExpression, nextExpression);

        } else{
            // instance of ArrayIterateExpressionRuleContext
            ArgNode argNode = visitArg(((ArrayIterateExpressionRuleContext) ctx)
                    .arrayIterateExpression().arg());

            ExpressionNode expressionNode = visitExpression(((ArrayIterateExpressionRuleContext) ctx)
                    .arrayIterateExpression().expression());

            //Logger.info("ArrayIterateExpressionNode created");
            return new ArrayIterateExpressionNode(argNode, expressionNode);
        }
    }

    @Override
    public AssignmentStatementNode visitAssignmentStatementRule(AssignmentStatementRuleContext ctx) {
        if (ctx.assignmentStatement() instanceof PrimitiveVariableAssignmentRuleContext) {
            return visitPrimitiveVariableAssignment(((PrimitiveVariableAssignmentRuleContext)
                    ctx.assignmentStatement()).primitiveVariableAssignment());
        } else {
            // instanceof ArrayVariableAssignmentRuleContext
            return visitArrayVariableAssignment(((ArrayVariableAssignmentRuleContext)
                    ctx.assignmentStatement()).arrayVariableAssignment());
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

        //Logger.info("PrimitiveVariableAssignmentStatementNode created");
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

        //Logger.info("ArrayVariableAssignmentStatementNode created");
        return new ArrayVariableAssignmentStatementNode(name, operator, expressionNode);
    }

    @Override
    public FunctionCallStatementNode visitFuncCallStatementRule(FuncCallStatementRuleContext ctx) {
        FunctionCallExpressionNode functionCallExpressionNode = (FunctionCallExpressionNode)
                visitFuncCall(ctx.funcCallStatement().funcCall());

        //Logger.info("FunctionCallStatementNode created");
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
            String libRef = ctx.libRef().identifier().getText();
            functionCallExpressionNode = new FunctionCallExpressionNode(libRef, funcName);
        } else {
            functionCallExpressionNode = new FunctionCallExpressionNode(funcName);
        }

        for (ExpressionContext param : paramList) {
            ExpressionNode expressionNode = visitExpression(param);
            functionCallExpressionNode.addParameter(expressionNode);
        }

        //Logger.info("FunctionCallExpressionNode created");
        return functionCallExpressionNode;
    }


    @Override
    public ReturnStatementNode visitReturnStatementRule(ReturnStatemtntRuleContext ctx) {
        ExpressionNode expressionNode = visitExpression(ctx.returnStatemtnt().expression());

        //Logger.info("ReturnStatementNode created");
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

        if (loopControlOperator.equals("continue;")) {
            //Logger.info("LoopControlStatementNode(continue) created");
            return new LoopControlStatementNode(LoopControlOperator.Continue);
        } else {
            // instance of break
            //Logger.info("LoopControlStatementNode(break) created");
            return new LoopControlStatementNode(LoopControlOperator.Break);
        }
    }
}
