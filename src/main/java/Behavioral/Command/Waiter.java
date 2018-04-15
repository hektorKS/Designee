package main.java.Behavioral.Command;

/**
 * ConcreteCommand
 */
public class Waiter implements Command {

    private BillPayer billPayer;

    public Waiter(BillPayer billPayer) {
        this.billPayer = billPayer;
    }

    @Override
    public String executeCalculateBill(double amount) {
        return billPayer.calculateBill(amount);
    }
}
