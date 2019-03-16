package behavioral.templatemethod;

public class Hamburger extends Sandwich {
  @Override
  public String addMeat() {
    return "Adding meat.\n";
  }

  @Override
  public String addCondiments() {
    return "Adding condiments.\n";
  }
}
