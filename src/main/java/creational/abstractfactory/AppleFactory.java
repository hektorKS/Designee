package creational.abstractfactory;

public class AppleFactory implements PlantFactory {
  @Override
  public Plant makePlant() {
    return new Apple();
  }

  @Override
  public Picker makePicker() {
    return new ApplePicker();
  }
}
