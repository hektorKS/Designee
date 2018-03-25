package com.hektorKS.Creational.FactoryMethod;

public interface Creator {
    public Pizza create(String type) throws NoPizzaException;
}
