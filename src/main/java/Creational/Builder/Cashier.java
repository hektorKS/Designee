package main.java.Creational.Builder;

public class Cashier {

    MealBuilder builder;

    public void chooseMealType(MealBuilder builder){
        this.builder = builder;
    }

    public Meal createMeal(String drink) throws EmptyMealException, AdultsOnlyException {

        builder.buildDrink(drink);

        builder.buildMain();

        builder.buildDessert();

        return builder.getMeal();

    }
}
