package behavioral.visitor.fruitsexample;

public class Orange extends Fruit {

  @Override
  public void accept(IFruitVisitor visitor) {
    visitor.Visit(this);
  }

  @Override
  public String toString() {
    return "Orange";
  }
}
