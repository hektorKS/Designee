package main.java.Behavioral.Command;

/**
 * Invoker
 */
public class CashRegister {

    private Command command;

    public CashRegister(Command command) {
        this.command = command;
    }

    public String returnFinalBill(double amount){
        return command.executeCalculateBill(amount);
    }
}
