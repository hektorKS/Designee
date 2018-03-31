package main.java.Creational.Builder;

public abstract class MealBuilder {

    protected Meal meal;
    {
        this.meal = new Meal();
    }

    public abstract void buildDrink(String drink) throws AdultsOnlyException;
    public abstract void buildMain();
    public abstract void buildDessert();

    public Meal getMeal() throws EmptyMealException {
            if(meal.getDessert() != null || meal.getMain() != null || meal.getDrink() != null){
                return meal;
            }
            else {
                throw new EmptyMealException("You can't get empty meal!");
            }
            }
}
