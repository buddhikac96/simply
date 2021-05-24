package app;

import antlr.gen.SimplyV3Lexer;
import antlr.gen.SimplyV3Parser;
import ast.ASTNode;
import ast.CompilationUnitNode;
import ast.gui.AstDotGenerator;
import errors.SimplyError;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import passes.Cst2AstPassVisitor;
import passes.semantic.NewSemanticAnalyzerPassVisitor;
import passes.transpiler.OriginalTranspiler;
import universalJavaMapper.newProvider.SimplyFunctionServiceProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MainAppDemo {

    private static final Logger LOGGER = Logger.getLogger(MainAppDemo.class.getName());

    public static void main(String[] args) throws Exception {

        String filePath = "Samples/sample2.simply";
        ParseTree tree = getParseTree(filePath);

        List<String> errors = new ArrayList<>();

        // Convert CST into AST
        Cst2AstPassVisitor cst2AstPassVisitor = new Cst2AstPassVisitor(errors);
        CompilationUnitNode astRoot = (CompilationUnitNode) cst2AstPassVisitor.visit(tree);

        // Generate AST Image
        AstDotGenerator.draw(astRoot);


        // pre-evaluation pass
        // get the function list data structure
        // pass data structure to syntax analyzing phase

        //PreEvaluatePassVisitor preEvaluatePassVisitor = new PreEvaluatePassVisitor();
        //astRoot.accept(preEvaluatePassVisitor);

        //HashMap<String, HashSet<ArrayList<DataType>>> userDefinedFunctionList = preEvaluatePassVisitor.getFunctions();

        // Error List for semantic analysis
        List<SimplyError> simplyErrorList = new ArrayList<>();

        // Java Library provider
        var sfm = new SimplyFunctionServiceProvider();

        // Semantics analyzing
        var semanticAnalyzerPassVisitor = new NewSemanticAnalyzerPassVisitor(simplyErrorList, sfm);
        astRoot.accept(semanticAnalyzerPassVisitor);

        //SemanticAnalyzerPassVisitor semanticAnalyzerPassVisitor = new SemanticAnalyzerPassVisitor(userDefinedFunctionList);
        //astRoot.accept(semanticAnalyzerPassVisitor);

        /*if(!semanticAnalyzerPassVisitor.simplyErrorList.isEmpty()){
            for(SimplyError e : semanticAnalyzerPassVisitor.simplyErrorList){
                System.out.println(e.getErrorMessage());
            }
        }else{
            generateCode(astRoot);
        }*/

        generateCode(astRoot);
    }

    private static ParseTree getParseTree(String path) throws IOException {
        CharStream charStream = CharStreams.fromFileName(path);
        SimplyV3Lexer lexer = new SimplyV3Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SimplyV3Parser parser = new SimplyV3Parser(commonTokenStream);

        return parser.compilationUnit();
    }

    private static void generateCode(ASTNode node) throws Exception {
        // TempTranspiler transpiler = new TempTranspiler();
        OriginalTranspiler transpiler = new OriginalTranspiler();
        node.accept(transpiler);

        System.out.println(transpiler.code);
    }
}
