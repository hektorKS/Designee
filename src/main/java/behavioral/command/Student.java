package behavioral.command;

public class Student implements BillPayer {
  @Override
  public String calculateBill(double amount) {
    return Double.toString(amount - amount * .49);
  }
}
