package main.java.Behavioral.Visitor.FruitsExample;

public class Orange extends Fruit {

    @Override
    public void accept(IFruitVisitor visitor) {
        visitor.Visit(this);
    }

    @Override
    public String toString(){
        return "Orange";
    }
}
