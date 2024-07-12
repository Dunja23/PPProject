// generated with ast extension for cup
// version 0.8
// 10/6/2024 0:42:53


package rs.ac.bg.etf.pp1.ast;

public class NamespName implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    public rs.etf.pp1.symboltable.concepts.Struct struct = null;

    private String nsName;

    public NamespName (String nsName) {
        this.nsName=nsName;
    }

    public String getNsName() {
        return nsName;
    }

    public void setNsName(String nsName) {
        this.nsName=nsName;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NamespName(\n");

        buffer.append(" "+tab+nsName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NamespName]");
        return buffer.toString();
    }
}
