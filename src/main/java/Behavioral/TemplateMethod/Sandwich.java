package main.java.Behavioral.TemplateMethod;

public abstract class Sandwich {

    public final String makeSandwich() {

        String result = cutBun() +
                addMeat() +
                addVegatables() +
                addCondiments() +
                wrapSandwich();

        return result;

    }

    public abstract String addMeat();
    public abstract String addCondiments();

    private String cutBun(){
        return "Cutting bun.\n";
    }

    private String addVegatables(){
        return "Adding vegetables\n";
    }

    private String wrapSandwich(){
        return "Wrapping sandwich.\n";
    }


}
