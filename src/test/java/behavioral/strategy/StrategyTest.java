package behavioral.strategy;

import creational.singleton.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Strategy design pattern
 * The strategy pattern is used to solve problems that might (or is foreseen they might) be implemented or
 * solved by different strategies and that possess a clearly defined interface for such cases.
 * Each strategy is perfectly valid on its own with some of the strategies being preferable in certain situations
 * that allow the application to switch between them during runtime.
 */
class StrategyTest {

  private StringBuilder log;


  @BeforeEach
  void setUp() {
    this.log = new StringBuilder();
    log.append("STRATEGY\n\n");
    log.append("Counting taxes in different countries using common interface: \"Tax\"\n");
  }

  @AfterEach
  void tearDown() {
    Logger.INSTANCE.addToLog(log.toString());
    Logger.INSTANCE.saveLog();
  }

  @Test
  void test() {

    Tax tax = new TaxPL();
    double value = tax.count(100);
    log.append("Tax in Poland: ");
    log.append(value);
    log.append("\n");
    Assertions.assertEquals(23, value, 0.1);

    tax = new TaxFR();
    value = tax.count(100);
    log.append("Tax in France: ");
    log.append(value);
    log.append("\n");
    Assertions.assertEquals(20, value, 0.1);

    tax = new TaxDE();
    value = tax.count(100);
    log.append("Tax in Germany: ");
    log.append(value);
    log.append("\n");
    Assertions.assertEquals(30, value, 0.1);

    tax = new TaxEN();
    value = tax.count(100);
    log.append("Tax in United Kingdom: ");
    log.append(value);
    log.append("\n");
    Assertions.assertEquals(20, value, 0.1);
  }

}