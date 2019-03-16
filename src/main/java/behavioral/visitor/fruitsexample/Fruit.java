package behavioral.visitor.fruitsexample;

import java.util.Random;

public abstract class Fruit {
  protected double price;
  protected double weight;

  public Fruit() {
    this.price = 0.0;
    Random random = new Random();
    this.weight = 30 * random.nextDouble();
  }

  public abstract void accept(IFruitVisitor visitor);

  public double getPrice() {
    return price;
  }
}
