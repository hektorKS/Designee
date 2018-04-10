package main.java.Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FruitSorter implements IFruitVisitor {

    private List<Orange> oranges;
    private List<Apple> apples;
    private List<Banana> bananas;

    {
        this.oranges = new ArrayList<>();
        this.apples = new ArrayList<>();
        this.bananas = new ArrayList<>();
    }

    @Override
    public void Visit(Orange fruit) {
        oranges.add(fruit);
    }

    @Override
    public void Visit(Apple fruit) {
        apples.add(fruit);
    }

    @Override
    public void Visit(Banana fruit) {
        bananas.add(fruit);
    }

    public List<Orange> getOranges() {
        return oranges;
    }

    public List<Apple> getApples() {
        return apples;
    }

    public List<Banana> getBananas() {
        return bananas;
    }
}
