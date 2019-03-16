package creational.abstractfactory;

public class Orange implements Plant {
  @Override
  public String getCropsTime() {
    return "December";
  }

  @Override
  public String getName() {
    return "Orange";
  }
}
