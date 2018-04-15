package main.java.Behavioral.Visitor.FruitsExample;

public interface IFruitVisitor {

    void Visit(Orange fruit);
    void Visit(Apple fruit);
    void Visit(Banana fruit);

}
