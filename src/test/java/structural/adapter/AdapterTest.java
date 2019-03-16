package structural.adapter;


import creational.singleton.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Convert the interface of a class into
 * another interface clients expect. Lets
 * classes work together that couldn't
 * otherwise because of incompatible
 * interfaces.
 * <p>
 * Example:
 * We want to start using new SuperLibrary with fixed some functions,
 * but whole project is using old SuperLibrary,
 * which has completely different methods names
 */
class AdapterTest {

  private StringBuilder log;

  @BeforeEach
  void setUp() {
    this.log = new StringBuilder();
    log.append("ADAPTER\n\n");
  }

  @AfterEach
  void tearDown() {
    Logger.INSTANCE.addToLog(log.toString());
    Logger.INSTANCE.saveLog();
  }

  @Test
  void test() {
    Client client = new Client(log);
    client.doFancyThingsWithSuperLibrary();
  }

}