package passes;

import antlr.gen.SimplyV3Parser;
import antlr.gen.SimplyV3ParserBaseVisitor;

public class PreEvaluatePassVisitor extends SimplyV3ParserBaseVisitor {

    /*
        Create function data-set which will used in syntax-analise phase
     */
    @Override
    public Object visitFunctionDeclaration(SimplyV3Parser.FunctionDeclarationContext ctx) {
        return super.visitFunctionDeclaration(ctx);
    }
}
