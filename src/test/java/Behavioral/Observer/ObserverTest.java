package test.java.Behavioral.Observer;

import main.java.Behavioral.Observer.*;
import main.java.Creational.Singleton.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ObserverTest{

    private StringBuilder log;

    @Before
    public void setUp() throws Exception {
        this.log = new StringBuilder();
        log.append("OBSERVER\n\n");
        Logger.INSTANCE.addToLog(log.toString());
    }

    @After
    public void tearDown() throws Exception {
        Logger.INSTANCE.saveLog();
    }

    @Test
    public void test(){
        IndexIterator iterator = new IndexIterator();
        Person student1 = new Student(iterator);
        Person student2 =  new Student(iterator);
        Person teacher =  new Teacher();

        News news = new News();

        news.updateNews("The weather is nice today!");

        news.addObserver(student1);
        news.addObserver(student2);

        news.updateNews("News only for Students!");

        news.addObserver(teacher);

        news.updateNews("Important news for all!");

    }

}