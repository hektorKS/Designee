package behavioral.visitor.fruitsexample;

public class FruitPricer implements IFruitVisitor {
  @Override
  public void Visit(Orange fruit) {
    fruit.price = 4.99 * fruit.weight;
  }

  @Override
  public void Visit(Apple fruit) {
    fruit.price = 1.89 * fruit.weight;
  }

  @Override
  public void Visit(Banana fruit) {
    fruit.price = 3.59 * fruit.weight;
  }
}
