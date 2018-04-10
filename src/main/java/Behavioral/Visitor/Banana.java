package main.java.Behavioral.Visitor;

public class Banana extends Fruit {
    @Override
    public void Accept(IFruitVisitor visitor) {
        visitor.Visit(this);
    }

    @Override
    public String toString(){
        return "Banana";
    }
}
