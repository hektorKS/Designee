package behavioral.visitor.fruitsexample;

public class Apple extends Fruit {

  @Override
  public void accept(IFruitVisitor visitor) {
    visitor.Visit(this);
  }

  @Override
  public String toString() {
    return "Apple";
  }
}
