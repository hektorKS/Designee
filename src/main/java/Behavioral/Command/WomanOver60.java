package main.java.Behavioral.Command;

public class WomanOver60 implements BillPayer {
    @Override
    public String calculateBill(double amount) {
        return Double.toString(amount - amount * .2);
    }
}
