package behavioral.command;

public class WomanOver60 implements BillPayer {
  @Override
  public String calculateBill(double amount) {
    return Double.toString(amount - amount * .2);
  }
}
