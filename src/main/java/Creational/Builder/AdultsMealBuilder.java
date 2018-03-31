package main.java.Creational.Builder;

public class AdultsMealBuilder extends MealBuilder {

    @Override
    public void buildDrink(String drink) {
        super.meal.setDrink(drink);
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
