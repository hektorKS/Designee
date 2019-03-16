package creational.factorymethod;

public interface Creator {
  Pizza create(String type) throws PizzaCreationException;
}
