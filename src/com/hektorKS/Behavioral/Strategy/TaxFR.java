package com.hektorKS.Behavioral.Strategy;

public class TaxFR implements Tax {
    public double count(double value){
        return value * 0.2;
    }
}
