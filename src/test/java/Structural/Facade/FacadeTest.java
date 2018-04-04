package test.java.Structural.Facade;

import main.java.Creational.Singleton.Logger;
import main.java.Structural.Facade.API;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A design pattern is a common way of solving a recurring problem.
 * Classes in all design patterns are just normal classes.
 * What is important is how they are structured and how they
 * work together to solve a given problem in the best possible way.
 *
 * The Facade design pattern simplifies the interface to a complex system;
 * because it is usually composed of all the classes which make up the subsystems of the complex system.
 *
 * A Facade shields the user from the complex details of the system and provides
 * them with a simplified view of it which is easy to use. It also decouples
 * the code that uses the system from the details of the subsystems,
 * making it easier to modify the system later.
 */
public class FacadeTest {

    private StringBuilder log;

    @Before
    public void setUp() throws Exception {
        this.log = new StringBuilder();
        log.append("FACADE\n\n");
    }

    @After
    public void tearDown() throws Exception {
        Logger.INSTANCE.addToLog(log.toString());
        Logger.INSTANCE.saveLog();
    }

    @Test
    public void test(){
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