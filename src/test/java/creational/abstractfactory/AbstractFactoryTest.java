package creational.abstractfactory;


import creational.singleton.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * ---------------------------------------------------------------------------------------------------------------------
 * Abstract factory design pattern provides an interface for creating FAMILIES of related or dependent
 * objects without specifying their concrete class.
 * <p>
 * Usage:
 * When your system has to create multiple families of products or you want to provide
 * a library of products without exposing the implementation details.
 * <p>
 * ---------------------------------------------------------------------------------------------------------------------
 * The client code has no knowledge whatsoever of the concrete type, not needing to include any header files
 * or class declarations related to it. The client code deals only with the abstract type.
 * Objects of a concrete type are indeed created by the factory, but the client code accesses such objects only
 * through their abstract interface.
 * <p>
 * ---------------------------------------------------------------------------------------------------------------------
 * A real life example for the use of the Abstract Factory pattern is providing data access to two different data
 * sources (e.g. a SQL Database and a XML file). You have two different data access classes
 * (a gateway to the datastore). Both inherit from a base class that defines the common methods to be implemented
 * (e.g. Load, Save, Delete).
 * <p>
 * Which data source shall be used shouldn't change the way client code retrieves it's data access class.
 * Your Abstract Factory knows which data source shall be used and returns an appropriate instance on request.
 * The factory returns this instance as the base class type.
 * <p>
 * ---------------------------------------------------------------------------------------------------------------------
 * Abstract factory is normally used for things like dependency injection/strategy,
 * when you want to be able to create a whole family of objects that need to be of "the same kind",
 * and have some common base classes. Here's a vaguely fruit-related example. The use case here is that we want
 * to make sure that we don't accidentally use an OrangePicker on an Apple. As long at we get our Fruit and Picker
 * from the same factory, they will match.
 */
class AbstractFactoryTest {

  private StringBuilder log;

  @BeforeEach
  void setUp() {
    this.log = new StringBuilder();
    log.append("ABSTRACT FACTORY\n\n");
  }

  @AfterEach
  void tearDown() {
    Logger.INSTANCE.addToLog(log.toString());
    Logger.INSTANCE.saveLog();
  }

  private void getOrderFromFactory(PlantFactory factory) {

//      We create factory that creates whole families of products -> Plant and Picker.
//      E.g. Orange and OrangePicker or Apple and ApplePicker
    Plant plant = factory.makePlant();
    Picker picker = factory.makePicker();
    log.append(picker.getName());
    log.append(" picks ");
    log.append(plant.getName());
    log.append(" in ");
    log.append(plant.getCropsTime());
    log.append("\n");
  }

  @Test
  void test() {

    AppleFactory factory1 = new AppleFactory();
    getOrderFromFactory(factory1);

    OrangeFactory factory2 = new OrangeFactory();
    getOrderFromFactory(factory2);
  }

}