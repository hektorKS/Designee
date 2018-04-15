package main.java.Behavioral.Command;

public class ManUnder60 implements BillPayer {
    @Override
    public String calculateBill(double amount) {
        return Double.toString(amount);
    }
}
