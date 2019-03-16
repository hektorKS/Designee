package creational.abstractfactory;

public class OrangeFactory implements PlantFactory {
  @Override
  public Plant makePlant() {
    return new Orange();
  }

  @Override
  public Picker makePicker() {
    return new OrangePicker();
  }
}
