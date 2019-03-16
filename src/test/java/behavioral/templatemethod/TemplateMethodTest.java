package behavioral.templatemethod;


import creational.singleton.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Define the skeleton of an algorithm in an
 * operation, deferring some steps to subclasses.
 * Lets subclasses redefine certain steps
 * of an algorithm without changing the
 * algorithm's structure.
 */
class TemplateMethodTest {


  private StringBuilder log;

  @BeforeEach
  void setUp() {
    this.log = new StringBuilder();
    log.append("TEMPLATE METHOD\n\n");
  }

  @AfterEach
  void tearDown() {
    Logger.INSTANCE.addToLog(log.toString());
    Logger.INSTANCE.saveLog();
  }

  @Test
  void test() {
    Sandwich customer1 = new Hamburger();
    log.append(customer1.makeSandwich());
    log.append("\n");

    Sandwich customer2 = new VeggieBurger();
    log.append(customer2.makeSandwich());
  }
}