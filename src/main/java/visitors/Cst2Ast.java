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
        super.visitCompilationUnit(ctx);
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
        VariableDeclarationNode variableDeclarationNode =
                (VariableDeclarationNode) visitVariableDeclaration(ctx.variableDeclaration());

        this.compilationUnitNode.addGlobalVariableDeclarationNode(variableDeclarationNode);

        return variableDeclarationNode;
    }

    @Override
    public ASTNode visitVariableDeclaration(SimplyV3Parser.VariableDeclarationContext ctx) {
        return super.visitVariableDeclaration(ctx);
    }

    @Override
    public ASTNode visitConstantDeclaration(SimplyV3Parser.ConstantDeclarationContext ctx) {
        boolean isConst = true;
        VariableDeclarationNode variableDeclarationNode =
                (VariableDeclarationNode) visitVariableDeclaration(ctx.variableDeclaration());
        variableDeclarationNode.setConst();

        return variableDeclarationNode;
    }

    @Override
    public ASTNode visitPrimitiveVariableDeclaration(SimplyV3Parser.PrimitiveVariableDeclarationContext ctx) {
        DataType dataType = DataTypeMapper.getType(ctx.getChild(0).getText());
        String varName = ctx.getChild(1).getText();
        ExpressionNode expressionNode = (ExpressionNode) visitExpression(ctx.expression());

        return new PrimitiveVariableDeclarationNode(false, dataType, varName, expressionNode);
    }


}
