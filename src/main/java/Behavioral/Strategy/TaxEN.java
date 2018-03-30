package main.java.Behavioral.Strategy;

public class TaxEN implements Tax {
    public double count(double value){
        return value * 0.2;
    }
}
