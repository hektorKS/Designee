package behavioral.command;

public class ManOver60 implements BillPayer {

  @Override
  public String calculateBill(double amount) {
    return Double.toString(amount - amount * .1);
  }
}
