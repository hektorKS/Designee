package test.java.Behavioral.TemplateMethod;

import main.java.Behavioral.TemplateMethod.Hamburger;
import main.java.Behavioral.TemplateMethod.Sandwich;
import main.java.Behavioral.TemplateMethod.VeggieBurger;
import main.java.Creational.Singleton.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Define the skeleton of an algorithm in an
 * operation, deferring some steps to subclasses.
 * Lets subclasses redefine certain steps
 * of an algorithm without changing the
 * algorithm's structure.
 */
public class TemplateMethodTest {


    private StringBuilder log;

    @Before
    public void setUp() throws Exception {
        this.log = new StringBuilder();
        log.append("TEMPLATE METHOD\n\n");
    }

    @After
    public void tearDown() throws Exception {
        Logger.INSTANCE.addToLog(log.toString());
        Logger.INSTANCE.saveLog();
    }

    @Test
    public void test(){
        Sandwich customer1 = new Hamburger();
        log.append(customer1.makeSandwich());
        log.append("\n");

        Sandwich customer2 = new VeggieBurger();
        log.append(customer2.makeSandwich());
    }
}