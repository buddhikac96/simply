package visitors;

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

import java.util.HashSet;
import java.util.List;

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
    public ASTNode visitCompilationUnit(CompilationUnitContext ctx) {

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
    public ASTNode visitLibImport(LibImportContext ctx) {
        String name = ctx.identifier().getText();
        LibImportNode libImportNode = new LibImportNode(name);
        this.compilationUnitNode.addLibImportNode(libImportNode);
        return libImportNode;
    }

    @Override
    public ASTNode visitIdentifier(IdentifierContext ctx) {
        return super.visitIdentifier(ctx);
    }

    @Override
    public ASTNode visitGlobalVariableDeclaration(GlobalVariableDeclarationContext ctx) {

        VariableDeclarationNode variableDeclarationNode;

        if (ctx.variableDeclaration() != null) {
            variableDeclarationNode =
                    (VariableDeclarationNode) visitVariableDeclaration(ctx.variableDeclaration());
        } else {
            variableDeclarationNode =
                    (VariableDeclarationNode) visitConstantDeclaration(ctx.constantDeclaration());
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
    public ASTNode visitVariableDeclaration(VariableDeclarationContext ctx) {
        if (ctx.arrayVariableDeclaration() != null) {
            return visitArrayVariableDeclaration(ctx.arrayVariableDeclaration());
        } else {
            return visitPrimitiveVariableDeclaration(ctx.primitiveVariableDeclaration());
        }
    }

    @Override
    public ASTNode visitConstantDeclaration(ConstantDeclarationContext ctx) {

        VariableDeclarationNode variableDeclarationNode =
                (VariableDeclarationNode) visitVariableDeclaration(ctx.variableDeclaration());
        variableDeclarationNode.setConst();

        return variableDeclarationNode;

    }

    @Override
    public ASTNode visitPrimitiveVariableDeclaration(PrimitiveVariableDeclarationContext ctx) {

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
    public ASTNode visitNonVoidDataTypeName(NonVoidDataTypeNameContext ctx) {
        return super.visitNonVoidDataTypeName(ctx);
    }

    @Override
    public ASTNode visitExpression(ExpressionContext ctx) {
        return visitArithmaticExpression(ctx.arithmaticExpression());
    }

    @Override
    public ASTNode visitArithmaticExpression(ArithmaticExpressionContext ctx) {
        if (ctx.MUL() != null) {

            ExpressionNode left = (ExpressionNode) visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            return new MultiplicationExpressionNode(left, right);

        } else if (ctx.DIV() != null) {

            ExpressionNode left = (ExpressionNode) visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            return new DivisionExpressionNode(left, right);

        } else if (ctx.SUB() != null) {

            ExpressionNode left = (ExpressionNode) visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            return new SubtractionExpressionNode(left, right);

        } else if (ctx.ADD() != null) {

            ExpressionNode left = (ExpressionNode) visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = (ExpressionNode) visitLogicExpression(ctx.logicExpression());

            return new AdditionExpressionNode(left, right);

        } else if (ctx.MOD() != null) {

            ExpressionNode left = (ExpressionNode) visitArithmaticExpression(ctx.arithmaticExpression());
            ExpressionNode right = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            return new ModulusExpressionNode(left, right);

        } else {

            return visitLogicExpression(ctx.logicExpression());

        }
    }

    @Override
    public ASTNode visitLogicExpression(LogicExpressionContext ctx) {
        if (ctx.OR() != null) {

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new OrExpressionNode(left, right);

        } else if (ctx.AND() != null) {

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new AndExpressionNode(left, right);

        } else if (ctx.GT() != null) {

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new GreaterThanExpressionNode(left, right);

        } else if (ctx.LT() != null) {

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new LessThanExpressionNode(left, right);

        } else if (ctx.GE() != null) {

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new GreaterOrEqualThanExpressionNode(left, right);

        } else if (ctx.LE() != null) {

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new LessOrEqualThanExpressionNode(left, right);

        } else if (ctx.EQUAL() != null) {

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new EqualsExpressionNode(left, right);

        } else if (ctx.NOTEQUAL() != null) {

            ExpressionNode left = (ExpressionNode) visitLogicExpression(ctx.logicExpression());
            ExpressionNode right = (ExpressionNode) visitUnaryExpression(ctx.unaryExpression());
            return new NotEqualsExpressionNode(left, right);

        } else {

            return visitUnaryExpression(ctx.unaryExpression());

        }

    }

    public ASTNode visitUnaryExpression(UnaryExpressionContext ctx) {
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

        } else if (ctx instanceof ArrayAccessExpressionContext) {

            String name = ((ArrayAccessExpressionContext) ctx)
                    .arrayAccess().identifier().Identifier().getText();

            ExpressionNode expressionNode = (ExpressionNode) visitExpression(
                    ((ArrayAccessExpressionContext) ctx).arrayAccess().expression());

            return new ArrayAccessExpressionNode(name, expressionNode);

        }

        return null;
    }

    @Override
    public ASTNode visitArrayVariableDeclaration(ArrayVariableDeclarationContext ctx) {

        String arrayName = ctx.identifier().getText();
        DataType dataType = DataTypeMapper.getType(ctx.nonVoidDataTypeName().getText());

        ArrayInitializationNode arrayInitializationNode =
                (ArrayInitializationNode) visitArrayInitialization(ctx.arrayIntialization());

        return new ArrayVariableDeclarationNode(false, dataType, arrayName, arrayInitializationNode);

    }


    public ASTNode visitArrayInitialization(ArrayIntializationContext ctx) {
        if (ctx instanceof EmptyArrayInitializationContext) {
            return visitEmptyArrayInitialization((EmptyArrayInitializationContext) ctx);
        } else {
            return visitNonEmptyArrayInitialization((NonEmptyArrayInitializationContext) ctx);
        }
    }


    @Override
    public ASTNode visitEmptyArrayInitialization(EmptyArrayInitializationContext ctx) {
        return new EmptyArrayInitializationNode();
    }

    @Override
    public ASTNode visitNonEmptyArrayInitialization(NonEmptyArrayInitializationContext ctx) {
        NonEmptyArrContext nonEmptyArrContext = ctx.nonEmptyArr();

        NonEmptyArrayInitializationNode nonEmptyArrayInitializationNode =
                new NonEmptyArrayInitializationNode();

        List<ArrayValueContext> arrayValueContextListList =
                nonEmptyArrContext.arrayValues().arrayValue();

        for (ArrayValueContext arrayValue : arrayValueContextListList) {
            nonEmptyArrayInitializationNode.addValues(
                    (ExpressionNode) visitExpression(arrayValue.expression())
            );
        }

        return nonEmptyArrayInitializationNode;
    }

    @Override
    public ASTNode visitFunctionDeclaration(FunctionDeclarationContext ctx) {
        DataType returnType = DataTypeMapper.getType(
                ctx.dataTypeName().getText()
        );

        FunctionSignatureNode functionSignatureNode =
                (FunctionSignatureNode) visitFunctionSignature(ctx.functionSignature());

        BlockNode blockNode =
                (BlockNode) visitBlock(ctx.block());

        return new FunctionDeclarationNode(functionSignatureNode, returnType, blockNode);


    }

    @Override
    public ASTNode visitFunctionSignature(FunctionSignatureContext ctx) {
        String functionName = ctx.identifier().getText();

        FunctionSignatureNode functionSignatureNode =
                new FunctionSignatureNode(functionName);

        List<ArgContext> argContextList = ctx.argList().arg();

        for (ArgContext argContext : argContextList) {
            functionSignatureNode.addArguments(
                    (ArgNode) visitArg(argContext)
            );
        }

        return functionSignatureNode;
    }


    @Override
    public ASTNode visitArg(ArgContext ctx) {
        String varName = ctx.identifier().getText();
        DataType dataType = DataTypeMapper.getType(ctx.nonVoidDataTypeName().getText());

        return new ArgNode(dataType, varName);
    }

    @Override
    public ASTNode visitBlock(BlockContext ctx) {

        return visitBlockBody(ctx.blockBody());

    }


    // Visit Statement Rules
    public ASTNode visitStatementRule(StatementContext ctx) {
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
    public ASTNode visitIfStatementRule(IfStatementRuleContext ctx) {

        IfStatementContext ifStatementContext =
                ctx.ifStatement();

        IfBlockNode ifBlockNode =
                (IfBlockNode) visitIfBlock(ifStatementContext.ifBlock());

        IfStatementNode ifStatementNode;

        if (ctx.ifStatement().elseBlock() != null) {
            ElseBlockNode elseBlockNode =
                    (ElseBlockNode) visitElseBlock(ctx.ifStatement().elseBlock());

            ifStatementNode = new IfStatementNode(ifBlockNode, elseBlockNode);
        } else {
            ifStatementNode = new IfStatementNode(ifBlockNode);
        }

        List<ElseIfBlockContext> elseIfBlockContexts =
                ctx.ifStatement().elseIfBlock();

        for (ElseIfBlockContext elseIfBlockContext : elseIfBlockContexts) {
            ifStatementNode.addElseIfBlockNode(
                    (IfBlockNode) visitIfBlock(elseIfBlockContext.ifBlock())
            );
        }

        return ifStatementNode;

    }

    @Override
    public ASTNode visitIfBlock(IfBlockContext ctx) {

        ExpressionNode expressionNode =
                (ExpressionNode) visitExpression(ctx.ifConditionExpression().expression());

        BlockNode blockNode = (BlockNode) visitBlock(ctx.block());
        return new IfBlockNode(expressionNode, blockNode);

    }

    @Override
    public ASTNode visitElseBlock(ElseBlockContext ctx) {

        BlockNode blockNode = (BlockNode) visitBlock(ctx.block());
        return new ElseBlockNode(blockNode);

    }

    @Override
    public ASTNode visitBlockBody(BlockBodyContext ctx) {

        List<StatementContext> statementContextList =
                ctx.statements().statement();

        BlockNode blockNode = new BlockNode();

        for (StatementContext statementContext : statementContextList) {
            blockNode.addStatementNode(
                    (StatementNode) visitStatementRule(statementContext)
            );
        }

        return blockNode;
    }

    @Override
    public ASTNode visitIterateStatementRule(IterateStatementRuleContext ctx) {
        IterateStatementContext iterateStatementContext =
                ctx.iterateStatement();

        IterateConditionExpressionNode iterateConditionExpressionNode =
                (IterateConditionExpressionNode)
                        visitIterateConditionExpressionRule(iterateStatementContext.iterateConditionExpression());

        BlockNode blockNode = (BlockNode) visitBlock(iterateStatementContext.block());

        return new IterateStatementNode(iterateConditionExpressionNode, blockNode);
    }

    // Visit Iterate Condition Expression
    public ASTNode visitIterateConditionExpressionRule(IterateConditionExpressionContext ctx) {
        if (ctx instanceof BooleanIterateExpressionRuleContext) {

            ExpressionNode expressionNode = (ExpressionNode)
                    visitExpression(((BooleanIterateExpressionRuleContext) ctx).expression());

            return new IterateConditionExpressionNode
                    .BooleanIterateExpressionNode(expressionNode);


        } else if (ctx instanceof RangeIterateExpressionRuleContext) {

            ArgNode argNode = (ArgNode)
                    visitArg(((RangeIterateExpressionRuleContext) ctx).rangeExpression().arg());

            ExpressionNode fromExpression = (ExpressionNode)
                    visitExpression(((RangeIterateExpressionRuleContext) ctx)
                            .rangeExpression().fromExpression().expression());

            ExpressionNode toExpression = (ExpressionNode)
                    visitExpression(((RangeIterateExpressionRuleContext) ctx)
                            .rangeExpression().toExpression().expression());

            return new
                    IterateConditionExpressionNode.
                            RangeIterateExpressionNode(argNode, fromExpression, toExpression);

        } else if (ctx instanceof ArrayIterateExpressionRuleContext) {
            ArgNode argNode = (ArgNode)
                    visitArg(((ArrayIterateExpressionRuleContext) ctx)
                            .arrayIterateExpression().arg());

            ExpressionNode expressionNode = (ExpressionNode)
                    visitExpression(((ArrayIterateExpressionRuleContext) ctx)
                            .arrayIterateExpression().expression());

            return new IterateConditionExpressionNode
                    .ArrayIterateExpressionNode(argNode, expressionNode);
        }

        return null;
    }

    @Override
    public ASTNode visitAssignmentStatementRule(AssignmentStatementRuleContext ctx) {
        if(ctx.assignmentStatement() instanceof PrimitiveVariableAssignmentRuleContext){
            return visitPrimitiveVariableAssignment(((PrimitiveVariableAssignmentRuleContext)
                    ctx.assignmentStatement()).primitiveVariableAssignment());
        }else if(ctx.assignmentStatement() instanceof ArrayVariableAssignmentRuleContext){
            return visitArrayVariableAssignment(((ArrayVariableAssignmentRuleContext)
                    ctx.assignmentStatement()).arrayVariableAssignment());
        }else{
            return null;
        }
    }

    @Override
    public ASTNode visitPrimitiveVariableAssignment(PrimitiveVariableAssignmentContext ctx) {

        String name = ctx.identifier().getText();

        AssignmentOperator operator = AssignmentOperatorMapper.getAssignmentOperator(
                ctx.assignmentOperator().getText()
        );

        ExpressionNode expressionNode =
                (ExpressionNode) visitExpression(ctx.expression());

        return new PrimitiveVariableAssignmentStatementNode(name, operator, expressionNode);
    }

    @Override
    public ASTNode visitArrayVariableAssignment(ArrayVariableAssignmentContext ctx) {
        System.out.println(ctx.getText());
        String name = ctx.arrayAccess().identifier().getText();

        AssignmentOperator operator = AssignmentOperatorMapper.getAssignmentOperator(
                ctx.assignmentOperator().getText()
        );

        ExpressionNode expressionNode =
                (ExpressionNode) visitExpression(ctx.expression());

        return new ArrayVariableAssignmentStatementNode(name, operator, expressionNode);
    }

    @Override
    public ASTNode visitFuncCallStatementRule(FuncCallStatementRuleContext ctx) {
        FunctionCallExpressionNode functionCallExpressionNode = (FunctionCallExpressionNode)
                visitFuncCall(ctx.funcCallStatement().funcCall());

        return new FunctionCallStatementNode(functionCallExpressionNode);
    }

    @Override
    public ASTNode visitFunctionCallExpression(FunctionCallExpressionContext ctx) {
        return visitFuncCall(ctx.funcCall());
    }

    @Override
    public ASTNode visitFuncCall(FuncCallContext ctx) {
        String funcName = ctx.identifier().getText();

        List<ExpressionContext> paramList = ctx.funcCallParamList().expression();

        FunctionCallExpressionNode functionCallExpressionNode;

        if(ctx.libRef() != null){
            String libRef = ctx.libRef().getText();
            functionCallExpressionNode = new FunctionCallExpressionNode(libRef,funcName);
        }else{
            functionCallExpressionNode = new FunctionCallExpressionNode(funcName);
        }

        for (ExpressionContext param : paramList) {
            ExpressionNode expressionNode = (ExpressionNode) visitExpression(param);
            functionCallExpressionNode.addParameter(expressionNode);
        }

        return functionCallExpressionNode;
    }



    @Override
    public ASTNode visitReturnStatemtntRule(ReturnStatemtntRuleContext ctx) {
        ExpressionNode expressionNode = (ExpressionNode)
                visitExpression(ctx.returnStatemtnt().expression());

        return new ReturnStatementNode(expressionNode);
    }

    @Override
    public ASTNode visitVariableDeclarationStatementRule(VariableDeclarationStatementRuleContext ctx) {
        return super.visitVariableDeclarationStatementRule(ctx);
    }

    @Override
    public ASTNode visitConstantDeclarationStatementRule(ConstantDeclarationStatementRuleContext ctx) {
        return super.visitConstantDeclarationStatementRule(ctx);
    }

    @Override
    public ASTNode visitLoopControlStatementRule(LoopControlStatementRuleContext ctx) {
        return super.visitLoopControlStatementRule(ctx);
    }
}
