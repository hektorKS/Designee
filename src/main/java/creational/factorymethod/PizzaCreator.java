package creational.factorymethod;

public class PizzaCreator implements Creator {

  @Override
  public Pizza create(String type) throws PizzaCreationException {
    try {
      return (Pizza) Class.forName("creational.factorymethod." + type + "Pizza").newInstance();
    } catch (Exception e) {
      throw new PizzaCreationException("Exception during pizza creation!");
    }
  }
}
