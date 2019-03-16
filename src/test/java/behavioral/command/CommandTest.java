package behavioral.command;

import creational.singleton.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Encapsulate a request as an object,
 * thereby letting you parameterize clients
 * with different requests, queue or log
 * requests, and support undoable operations.
 * <p>
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
 * <p>
 * To add a new Customer and discount type I add new class.
 * I can add new functions to CashRegister by adding new Command subtype,
 * which will have some functions inside
 */
class CommandTest {

  private StringBuilder log;

  @BeforeEach
  void setUp() {
    log = new StringBuilder();
    log.append("COMMAND\n\n");
  }

  @AfterEach
  void tearDown() {
    Logger.INSTANCE.addToLog(log.toString());
    Logger.INSTANCE.saveLog();
  }

  @Test
  void test() {

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