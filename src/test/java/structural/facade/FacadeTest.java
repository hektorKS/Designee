package structural.facade;


import creational.singleton.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A design pattern is a common way of solving a recurring problem.
 * Classes in all design patterns are just normal classes.
 * What is important is how they are structured and how they
 * work together to solve a given problem in the best possible way.
 * <p>
 * The Facade design pattern simplifies the interface to a complex system;
 * because it is usually composed of all the classes which make up the subsystems of the complex system.
 * <p>
 * A Facade shields the user from the complex details of the system and provides
 * them with a simplified view of it which is easy to use. It also decouples
 * the code that uses the system from the details of the subsystems,
 * making it easier to modify the system later.
 */
class FacadeTest {

  private StringBuilder log;

  @BeforeEach
  void setUp() {
    this.log = new StringBuilder();
    log.append("FACADE\n\n");
  }

  @AfterEach
  void tearDown() {
    Logger.INSTANCE.addToLog(log.toString());
    Logger.INSTANCE.saveLog();
  }

  @Test
  void test() {
    API client = new API();

    log.append(client.register());
    log.append("\n");

    log.append(client.login());
    log.append("\n");

    log.append(client.getItems());
    log.append("\n");

    log.append(client.getAll());
    log.append("\n");

    log.append(client.getProduct(1000));
    log.append("\n");
  }

}