package behavioral.templatemethod;

public class VeggieBurger extends Sandwich {
  @Override
  public String addMeat() {
    return "No meat.\n";
  }

  @Override
  public String addCondiments() {
    return "Adding veggie condiments.\n";
  }
}
