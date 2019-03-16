package behavioral.strategy;

public class TaxPL implements Tax {
  public double count(double value) {
    return value * 0.23;
  }
}
