package at.ac.fhstp.gof.visitor;

public interface Visitor {

    void visit(XmlElement xe);

    void visit(JsonElement je);
}
