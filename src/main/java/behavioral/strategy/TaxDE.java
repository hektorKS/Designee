package behavioral.strategy;

public class TaxDE implements Tax {
  public double count(double value) {
    return value * 0.3;
  }
}
