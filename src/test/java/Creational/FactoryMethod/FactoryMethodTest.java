package test.java.Creational.FactoryMethod;

import main.java.Creational.FactoryMethod.Creator;
import main.java.Creational.FactoryMethod.NoPizzaException;
import main.java.Creational.FactoryMethod.Pizza;
import main.java.Creational.FactoryMethod.PizzaCreator;
import main.java.Creational.Singleton.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * Define an interface for creating an object, but let subclasses decide which class to instantiate.
 * Lets a class defer instantiation to subclasses.
 *
 * ABSTRACT FACTORY vs FACTORY METHOD
 *
 * The main difference between a "factory method" and an "abstract factory" is that the factory method is
 * a single method, and an abstract factory is an object. I think a lot of people get these two terms confused,
 * and start using them interchangeably.
 *
 * Because the factory method is just a method, it can be overridden in a subclass.
 *
 * An object is calling its own factory method.
 * Therefore the only thing that could change the return value would be a subclass.
 *
 * The abstract factory is an object that has multiple factory methods on it.
 *
 * There is an object A, who wants to make a Foo object.
 * Instead of making the Foo object itself (e.g., with a factory method),
 * it's going to get a different object (the abstract factory) to create the Foo object.
 *
 */
public class FactoryMethodTest {

    private StringBuilder log;

    @Before
    public void setUp() throws Exception {
        log = new StringBuilder();
        log.append("FACTORY METHOD\n\n");
    }

    @After
    public void tearDown() throws Exception {
        Logger.INSTANCE.addToLog(log.toString());
        Logger.INSTANCE.saveLog();
    }

    private void testException() throws NoPizzaException {

        Creator creator = new PizzaCreator();
        Pizza pizza3 = creator.create("Margerita");

        log.append("Pizza3: ");
        log.append(pizza3.getName());
        log.append("\n");

    }

    @Test(expected = NoPizzaException.class)
    public void test() throws NoPizzaException {

//      We create creator and use FactoryMethod -> create() to ask him to create certain product -> PIZZA.
//      We must of course tell him what type of product we want.
//      And we just wait for order to come, we don't care about implementation detail.
        Creator creator = new PizzaCreator();

        Pizza pizza1 = creator.create("Hawaiian");
        Pizza pizza2 = creator.create("Deluxe");

        log.append("Pizza1: ");
        log.append(pizza1.getName());
        log.append("\n");

        log.append("Pizza2: ");
        log.append(pizza2.getName());
        log.append("\n");

        testException();

    }

}