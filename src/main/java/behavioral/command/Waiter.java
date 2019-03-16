package behavioral.command;

/**
 * ConcreteCommand
 */
public class Waiter implements Command {

  private BillPayer billPayer;

  Waiter(BillPayer billPayer) {
    this.billPayer = billPayer;
  }

  @Override
  public String executeCalculateBill(double amount) {
    return billPayer.calculateBill(amount);
  }
}
