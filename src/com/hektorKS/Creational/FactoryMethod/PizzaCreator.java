package com.hektorKS.Creational.FactoryMethod;

public class PizzaCreator implements Creator {

//    This can be also implemented in different way switch just makes it bit easier.
    @Override
    public Pizza create(String type) throws NoPizzaException {
        switch (type){
            case "Hawaiian":
                return new HawaiianPizza();
            case "Deluxe":
                return new DeluxePizza();
            default:
                throw new NoPizzaException("Nie ma takiej pizzy!");
        }
    }
}
