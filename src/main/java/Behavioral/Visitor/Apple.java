package main.java.Behavioral.Visitor;

public class Apple extends Fruit {

    @Override
    public void Accept(IFruitVisitor visitor) {
        visitor.Visit(this);
    }

    @Override
    public String toString(){
        return "Apple";
    }
}
