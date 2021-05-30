package ast.astImgGenerator;

import ast.ASTNode;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

import static guru.nidi.graphviz.model.Factory.mutGraph;
import static guru.nidi.graphviz.model.Factory.mutNode;

public class AstDotGenerator {

    static final HashMap<String, Integer> hashMap = new HashMap<>();

    public static void draw(ASTNode astNode){
        MutableGraph g = mutGraph("example1").setDirected(true);
        MutableNode n = mutNode(getName(astNode.getClass().getName()));
        g.add(n);

        generate(astNode, n);


        try {
            Graphviz.fromGraph(g).render(Format.PNG).toFile(new File("astImg/ast"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generate(ASTNode astNode, MutableNode head){
        if(astNode.getChildren().stream().noneMatch(Objects::nonNull)){
            return;
        }

        astNode.getChildren().stream().filter(Objects::nonNull).forEach(node -> {
            MutableNode newMutableNode = mutNode(getName(node.getClass().getSimpleName()));
            head.addLink(newMutableNode);

            generate(node, newMutableNode);
        });
    }

    private static String getName(String name){
        if(hashMap.containsKey(name)){
            int append = hashMap.get(name) + 1;
            hashMap.replace(name, append);
            return name + append;
        }else{
            hashMap.put(name, 1);
            return name;
        }
    }
}