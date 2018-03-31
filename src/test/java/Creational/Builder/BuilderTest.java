package test.java.Creational.Builder;

import main.java.Creational.Builder.*;
import main.java.Creational.Singleton.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Separate the construction of a
 * complex object from its representing
 * so that the same construction
 * process can create different
 * representations.
 *
 * An example of the pattern in the Java API would the StringBuilder append method.
 */
public class BuilderTest {

    private StringBuilder log;
    private Cashier cashier;

    @Before
    public void setUp() throws Exception {
        cashier = new Cashier();
        this.log = new StringBuilder();
        log.append("BUILDER\n\n");
    }

    @After
    public void tearDown() throws Exception {
        Logger.INSTANCE.addToLog(log.toString());
        Logger.INSTANCE.saveLog();
    }

    private void createLog(ArrayList<Meal> meals){

        for(int i = 0; i < meals.size(); i++){
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

    private void testAdultsOnlyException() throws EmptyMealException, AdultsOnlyException {

        MealBuilder mealBuilder = new KidsMealBuilder();
        cashier.chooseMealType(mealBuilder);
        cashier.createMeal("Beer");
    }

    @Test(expected = AdultsOnlyException.class)
    public void test() throws EmptyMealException, AdultsOnlyException {

        ArrayList<Meal> meals = new ArrayList<>();

        MealBuilder kidsMealBuilder = new KidsMealBuilder();
        cashier.chooseMealType(kidsMealBuilder);
        meals.add(cashier.createMeal("Cola"));

        MealBuilder adultsMealBuilder = new AdultsMealBuilder();
        cashier.chooseMealType(adultsMealBuilder);
        meals.add(cashier.createMeal("Beer"));

        createLog(meals);

        testAdultsOnlyException();
    }

}