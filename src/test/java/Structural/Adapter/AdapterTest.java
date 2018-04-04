package test.java.Structural.Adapter;

import main.java.Creational.Singleton.Logger;
import main.java.Structural.Adapter.Client;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Convert the interface of a class into
 * another interface clients expect. Lets
 * classes work together that couldn't
 * otherwise because of incompatible
 * interfaces.
 *
 * Example:
 * We want to start using new SuperLibrary with fixed some functions,
 * but whole project is using old SuperLibrary,
 * which has completely different methods names
 *
 */
public class AdapterTest {

    private StringBuilder log;

    @Before
    public void setUp() throws Exception {
        this.log = new StringBuilder();
        log.append("ADAPTER\n\n");
    }

    @After
    public void tearDown() throws Exception {
        Logger.INSTANCE.addToLog(log.toString());
        Logger.INSTANCE.saveLog();
    }

    @Test
    public void test(){
        Client client = new Client(log);
        client.doFancyThingsWithSuperLibrary();
    }

}