package main.java.Creational.FactoryMethod;

public interface Creator {
    Pizza create(String type) throws NoPizzaException;
}
