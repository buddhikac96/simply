package visitors;

import antlr.gen.SimplyV3Parser;
import antlr.gen.SimplyV3ParserBaseVisitor;
import ast.*;
import ast.util.DataTypeMapper;
import ast.util.enums.DataType;

public class Cst2Ast extends SimplyV3ParserBaseVisitor<ASTNode> {

    CompilationUnitNode compilationUnitNode;

    public Cst2Ast() {
        this.compilationUnitNode = new CompilationUnitNode();
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
    public ASTNode visitGlobalVariableDeclaration(SimplyV3Parser.GlobalVariableDeclarationContext ctx) {

        if(ctx.variableDeclaration() != null){
            VariableDeclarationNode variableDeclarationNode =
                    (VariableDeclarationNode) visitVariableDeclaration(ctx.variableDeclaration());
            this.compilationUnitNode.addGlobalVariableDeclarationNode(variableDeclarationNode);

            return variableDeclarationNode;
        }else{
            VariableDeclarationNode variableDeclarationNode =
                    (VariableDeclarationNode) visitConstantDeclaration(ctx.constantDeclaration());

            this.compilationUnitNode.addGlobalVariableDeclarationNode(variableDeclarationNode);

            return variableDeclarationNode;
        }

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
    public ASTNode visitArrayVariableDeclaration(SimplyV3Parser.ArrayVariableDeclarationContext ctx) {
        return super.visitArrayVariableDeclaration(ctx);
    }

    @Override
    public ASTNode visitExpression(SimplyV3Parser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }
}
