package main.java.Creational.FactoryMethod;

public class PizzaCreator implements Creator {

    @Override
    public Pizza create(String type) throws PizzaCreationException {
        try{
            return (Pizza) Class.forName("main.java.Creational.FactoryMethod." + type + "Pizza").newInstance();
        } catch (Exception e) {
            throw new PizzaCreationException("Exception during pizza creation!");
        }
    }

}
