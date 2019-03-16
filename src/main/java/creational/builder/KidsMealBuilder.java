package creational.builder;

public class KidsMealBuilder extends MealBuilder {

  @Override
  public void buildDrink(String drink) throws AdultsOnlyException {
    switch (drink) {
      case "Beer":
        throw new AdultsOnlyException("You can't add alcohol to kids meal!");
      default:
        super.meal.setDrink(drink);
    }
  }

  @Override
  public void buildMain() {
    super.meal.setMain("Chicken with potatoes");
  }

  @Override
  public void buildDessert() {
    super.meal.setDessert("Apple pie");
  }


}
