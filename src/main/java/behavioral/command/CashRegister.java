package behavioral.command;

/**
 * Invoker
 */
class CashRegister {

  private Command command;

  CashRegister(Command command) {
    this.command = command;
  }

  String returnFinalBill(double amount) {
    return command.executeCalculateBill(amount);
  }
}
