package test.java.Behavioral.Strategy;

import main.java.Behavioral.Strategy.*;
import main.java.Creational.Singleton.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Strategy design pattern
 *The strategy pattern is used to solve problems that might (or is foreseen they might) be implemented or
 * solved by different strategies and that possess a clearly defined interface for such cases.
 * Each strategy is perfectly valid on its own with some of the strategies being preferable in certain situations
 * that allow the application to switch between them during runtime.
 *
 */
public class StrategyTest {

    private Tax tax;
    private StringBuilder log;


    @Before
    public void setUp() throws Exception {
        this.log = new StringBuilder();
        log.append("STRATEGY\n\n");
        log.append("Counting taxes in different countries using common interface: \"Tax\"\n");
    }

    @After
    public void tearDown() throws Exception {
        Logger.INSTANCE.addToLog(log.toString());
        Logger.INSTANCE.saveLog();
    }

    @Test
    public void test(){

        this.tax = new TaxPL();
        double value = tax.count(100);
        log.append("Tax in Poland: ");
        log.append(value);
        log.append("\n");
        assertEquals(23, value, 0.1);

        this.tax = new TaxFR();
        value = tax.count(100);
        log.append("Tax in France: ");
        log.append(value);
        log.append("\n");
        assertEquals(20, value, 0.1);

        this.tax = new TaxDE();
        value = tax.count(100);
        log.append("Tax in Germany: ");
        log.append(value);
        log.append("\n");
        assertEquals(30, value, 0.1);

        this.tax = new TaxEN();
        value = tax.count(100);
        log.append("Tax in United Kingdom: ");
        log.append(value);
        log.append("\n");
        assertEquals(20, value, 0.1);
    }

}