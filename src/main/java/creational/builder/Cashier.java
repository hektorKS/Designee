package creational.builder;

class Cashier {

  private MealBuilder builder;

  void chooseMealType(MealBuilder builder) {
    this.builder = builder;
  }

  Meal createMeal(String drink) throws EmptyMealException, AdultsOnlyException {

    builder.buildDrink(drink);

    builder.buildMain();

    builder.buildDessert();

    return builder.getMeal();

  }
}
