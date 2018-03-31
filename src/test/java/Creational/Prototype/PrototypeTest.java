package test.java.Creational.Prototype;

import main.java.Creational.Prototype.JavaBook;
import main.java.Creational.Singleton.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;


/**
 *
 * Prototype design pattern can be used when there is need to create many objects having the same type.
 * Main purpose of this design pattern is optimization, because cloning big object is much faster then creation
 * using ''new'' operator.
 *
 * Even in my mini test there is no doubt that cloning is bit faster(not much but still always faster).
 * Objects are really small, but what if we had huge object?
 * That would do the difference, especially if many of such objects was needed.
 *
 */
public class PrototypeTest {

    private JavaBook book;
    private JavaBook bookClone;
    private JavaBook bookCopy;
    private StringBuilder log;

    @Before
    public void setUp() throws Exception {
        this.log = new StringBuilder();
        log.append("PROTOTYPE\n\n");
        log.append("Copy vs clone timing and correctness checking\n");
    }

    @After
    public void tearDown() throws Exception {
        Logger.INSTANCE.addToLog(log.toString());
        Logger.INSTANCE.saveLog();
    }


    private void testCorrectness() {

        bookClone.setTitle("Java book 2");

        log.append("\nOBJECTS SUMMARY:");
        log.append("\nbook == bookClone: ");
        log.append(book == bookClone);
        assertFalse(book == bookClone);
        log.append("\nbook == bookCopy: ");
        log.append(book == bookCopy);
        log.append("\n");
        assertFalse(book == bookCopy);

        log.append("\nbook.getTitle() == bookClone.getTitle(): ");
        log.append(book.getTitle() == bookClone.getTitle());
        assertFalse(book.getTitle() == bookClone.getTitle());
        log.append("\nbook.getTitle() == bookCopy.getTitle(): ");
        log.append(book.getTitle() == bookCopy.getTitle());
        log.append("\n");
        assertFalse(book.getTitle() == bookCopy.getTitle());


        log.append("\nBook title: ");
        log.append(book.getTitle());
        log.append(", book theme: ");
        log.append(book.getTopic());
        log.append("\n");

        log.append("Clone title: ");
        log.append(bookClone.getTitle());
        log.append(", clone theme: ");
        log.append(bookClone.getTopic());
        log.append("\n");

        log.append("Copy title: ");
        log.append(bookCopy.getTitle());
        log.append(", copy theme: ");
        log.append(bookCopy.getTopic());
        log.append("\n");

    }

    private void testTiming() throws CloneNotSupportedException {


        book = new JavaBook("Java book 1", "programming");

        long cloneStart = System.nanoTime();
        bookClone = (JavaBook) book.clone();
        long cloneTimeMillis = System.nanoTime() - cloneStart;

        long copyStart = System.nanoTime();
        bookCopy = (JavaBook) book.copy();
        long copyTimeMillis = System.nanoTime() - copyStart;

        log.append("TIME SUMMARY: \n");

        log.append("Clone time: ");
        log.append(cloneTimeMillis);
        log.append("ns \n");

        log.append("Copy time: ");
        log.append(copyTimeMillis);
        log.append("ns \n");

    }

    @Test
    public void test() throws CloneNotSupportedException {
        testTiming();
        testCorrectness();
    }

}