package main.java.Behavioral.Visitor;

public class Orange extends Fruit {
    @Override
    public void Accept(IFruitVisitor visitor) {
        visitor.Visit(this);
    }

    @Override
    public String toString(){
        return "Orange";
    }
}
