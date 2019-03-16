package creational.factorymethod;


import creational.singleton.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Define an interface for creating an object, but let subclasses decide which class to instantiate.
 * Lets a class defer instantiation to subclasses.
 * <p>
 * ABSTRACT FACTORY vs FACTORY METHOD
 * <p>
 * The main difference between a "factory method" and an "abstract factory" is that the factory method is
 * a single method, and an abstract factory is an object. I think a lot of people get these two terms confused,
 * and start using them interchangeably.
 * <p>
 * Because the factory method is just a method, it can be overridden in a subclass.
 * <p>
 * An object is calling its own factory method.
 * Therefore the only thing that could change the return value would be a subclass.
 * <p>
 * The abstract factory is an object that has multiple factory methods on it.
 * <p>
 * There is an object A, who wants to make a Foo object.
 * Instead of making the Foo object itself (e.g., with a factory method),
 * it's going to get a different object (the abstract factory) to create the Foo object.
 */
class FactoryMethodTest {

  private StringBuilder log;

  @BeforeEach
  void setUp() {
    log = new StringBuilder();
    log.append("FACTORY METHOD\n\n");
  }

  @AfterEach
  void tearDown() {
    Logger.INSTANCE.addToLog(log.toString());
    Logger.INSTANCE.saveLog();
  }

  @Test
  void testPizzaCreationException() {

    Assertions.assertThrows(PizzaCreationException.class,
        () -> {
          Creator creator = new PizzaCreator();
          Pizza pizza3 = creator.create("Margerita");

          log.append("Pizza3: ");
          log.append(pizza3.getName());
          log.append("\n");
        }
    );

  }

  @Test
  void test() throws PizzaCreationException {

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

  }

}