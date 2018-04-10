package main.java.Behavioral.Visitor;

public interface IFruitVisitor {
    void Visit(Orange fruit);
    void Visit(Apple fruit);
    void Visit(Banana fruit);

}
