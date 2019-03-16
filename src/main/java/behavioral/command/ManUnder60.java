package behavioral.command;

public class ManUnder60 implements BillPayer {
  @Override
  public String calculateBill(double amount) {
    return Double.toString(amount);
  }
}
