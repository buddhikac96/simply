package ast;

import visitors.AstVisitor;

import java.util.List;

public abstract class ASTNode {

    public abstract List<ASTNode> getChildren();

    public abstract void accept(AstVisitor visitor);
}