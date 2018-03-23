package com.hektorKS.Creational.AbstractFactory;

public class Apple implements Plant {

    @Override
    public String getCropsTime() {
        return "September";
    }

    @Override
    public String getName() {
        return "Apple";
    }
}
