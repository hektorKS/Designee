package behavioral.visitor.fruitsexample;

public class Banana extends Fruit {

  @Override
  public void accept(IFruitVisitor visitor) {
    visitor.Visit(this);
  }

  @Override
  public String toString() {
    return "Banana";
  }
}
