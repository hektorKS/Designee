package creational.builder;


import creational.singleton.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * Separate the construction of a
 * complex object from its representing
 * so that the same construction
 * process can create different
 * representations.
 * <p>
 * An example of the pattern in the Java API would the StringBuilder append method.
 */
class BuilderTest {

  private StringBuilder log;
  private Cashier cashier;

  @BeforeEach
  void setUp() {
    cashier = new Cashier();
    this.log = new StringBuilder();
    log.append("BUILDER\n\n");
  }

  @AfterEach
  void tearDown() {
    Logger.INSTANCE.addToLog(log.toString());
    Logger.INSTANCE.saveLog();
  }

  private void createLog(ArrayList<Meal> meals) {

    for (int i = 0; i < meals.size(); i++) {
      log.append("Meal ");
      log.append(i);
      log.append(":\n");
      log.append("Main: ");
      log.append(meals.get(i).getMain());
      log.append("\n");
      log.append("Drink: ");
      log.append(meals.get(i).getDrink());
      log.append("\n");
      log.append("Dessert: ");
      log.append(meals.get(i).getDessert());
      log.append("\n");
    }

  }

  @Test
  void testKidNotAllowedToBuyBear() {

    Assertions.assertThrows(AdultsOnlyException.class,
        () -> {
          MealBuilder kidsMealBuilder = new KidsMealBuilder();
          cashier.chooseMealType(kidsMealBuilder);
          cashier.createMeal("Beer");
        }
    );

  }


  @Test
  void testValidMeals() throws EmptyMealException, AdultsOnlyException {

    ArrayList<Meal> meals = new ArrayList<>();

    MealBuilder kidsMealBuilder = new KidsMealBuilder();
    cashier.chooseMealType(kidsMealBuilder);
    meals.add(cashier.createMeal("Cola"));

    MealBuilder adultsMealBuilder = new AdultsMealBuilder();
    cashier.chooseMealType(adultsMealBuilder);
    meals.add(cashier.createMeal("Beer"));

    createLog(meals);

  }

}