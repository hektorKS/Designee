package test.java.Behavioral.Command;

import main.java.Behavioral.Command.*;
import main.java.Creational.Singleton.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Encapsulate a request as an object,
 * thereby letting you parameterize clients
 * with different requests, queue or log
 * requests, and support undoable operations.
 *
 * Real life example:
 * requirement:
 * 1. Create a record in DB.
 * 2. Call a service to update a related record.
 * 3.  Call another service to log a ticket.
 * To perform this in a transactional manner, each operation is implemented as a command with undo operation.
 * At the end of each step, the command is pushed onto a stack.
 * If the operation fails at some step, then we pop the commands from the stack and call undo operation
 * on each of the command popped out. The undo operation of each step is defined in that command
 * implementation to reverse the earlier command.execute().
 *
 * To add a new Customer and discount type I add new class.
 * I can add new functions to CashRegister by adding new Command subtype,
 * which will have some functions inside
 *
 *
 */
public class CommandTest {

    private StringBuilder log;

    @Before
    public void setUp() throws Exception {
        log = new StringBuilder();
        log.append("COMMAND\n\n");
    }

    @After
    public void tearDown() throws Exception {
        Logger.INSTANCE.addToLog(log.toString());
        Logger.INSTANCE.saveLog();
    }

    @Test
    public void test(){

        // Receiver
        BillPayer client1 = CustomerTypePicker.getStudent();

        // Command to execute
        Command waiter = new Waiter(client1);

        // Method invoker
        CashRegister cashRegister = new CashRegister(waiter);

        log.append("Student's final bill amount: ");
        log.append(cashRegister.returnFinalBill(150.0));
        log.append("\n");

    }


}