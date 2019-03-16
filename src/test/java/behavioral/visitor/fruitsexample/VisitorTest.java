package behavioral.visitor.fruitsexample;


import creational.singleton.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Each time you want to add an operation you must modify the interface to every single class of the hierarchy.
 * Now, suppose instead that you are satisfied with the original interface,
 * and that you want to make the fewest possible modifications to it.
 * <p>
 * The Visitor pattern allows you to move each new operation in a suitable class,
 * and you need to extend the hierarchy's interface only once.
 * <p>
 * So Fruit interface(abstract class) is fine i don't want to change it.
 * If i want to add new operations on fruits i just add new Visitor class.
 * e.g. FruitPricer who counts prices of all fruits.
 */
class VisitorTest {

  private StringBuilder log;

  @BeforeEach
  void setUp() {
    this.log = new StringBuilder();
    log.append("VISITOR\n\n");
  }

  @AfterEach
  void tearDown() {
    Logger.INSTANCE.addToLog(log.toString());
    Logger.INSTANCE.saveLog();
  }

  @Test
  void test() {
    Fruit[] fruits = new Fruit[]{new Banana(), new Apple(), new Apple(), new Orange(), new Banana(),
        new Banana(), new Banana(), new Apple(), new Apple()};
    log.append("Input data: ");
    for (int i = 0; i < fruits.length; i++) {
      log.append(fruits[i]);
      if (i != fruits.length - 1) {
        log.append(", ");
      } else {
        log.append("\n\n");
      }
    }

    FruitSorter fruitSorter = new FruitSorter();
    for (Fruit fruit : fruits) {
      fruit.accept(fruitSorter);
    }
    log.append("Sorted fruits: \n");
    log.append("Apples: ");
    log.append(fruitSorter.getApples());
    log.append("\nOranges: ");
    log.append(fruitSorter.getOranges());
    log.append("\nBananas: ");
    log.append(fruitSorter.getBananas());
    log.append("\n\n");

    //New functionality - counting prices
    FruitPricer fruitPricer = new FruitPricer();
    for (Fruit fruit : fruits) {
      fruit.accept(fruitPricer);
    }

    for (Fruit fruit : fruits) {
      log.append(fruit);
      log.append(" price: ");
      log.append(fruit.getPrice());
      log.append("\n");
    }
  }

}