package test.java.Behavioral.Visitor.FruitsExample;

import main.java.Behavioral.Visitor.FruitsExample.*;
import main.java.Creational.Singleton.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *  Each time you want to add an operation you must modify the interface to every single class of the hierarchy.
 *  Now, suppose instead that you are satisfied with the original interface,
 *  and that you want to make the fewest possible modifications to it.
 *
 *  The Visitor pattern allows you to move each new operation in a suitable class,
 *  and you need to extend the hierarchy's interface only once.
 *
 *  So Fruit interface(abstract class) is fine i don't want to change it.
 *  If i want to add new operations on fruits i just add new Visitor class.
 *  e.g. FruitPricer who counts prices of all fruits.
 *
 */
public class VisitorTest {

    private StringBuilder log;

    @Before
    public void setUp() throws Exception {
        this.log = new StringBuilder();
        log.append("VISITOR\n\n");
    }

    @After
    public void tearDown() throws Exception {
        Logger.INSTANCE.addToLog(log.toString());
        Logger.INSTANCE.saveLog();
    }

    @Test
    public void test(){
        Fruit[] fruits = new Fruit[] { new Banana(), new Apple(), new Apple(), new Orange(), new Banana(),
             new Banana(), new Banana(), new Apple(), new Apple()};
        log.append("Input data: ");
        for(int i = 0; i< fruits.length; i++){
            log.append(fruits[i]);
            if( i != fruits.length - 1){
                log.append(", ");
            }
            else {
                log.append("\n\n");
            }
        }

        FruitSorter fruitSorter = new FruitSorter();
        for(Fruit fruit : fruits){
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
        FruitPricer fruitPricer =  new FruitPricer();
        for(Fruit fruit : fruits){
            fruit.accept(fruitPricer);
        }

        for(Fruit fruit : fruits){
            log.append(fruit);
            log.append(" price: ");
            log.append(fruit.getPrice());
            log.append("\n");
        }
    }

}