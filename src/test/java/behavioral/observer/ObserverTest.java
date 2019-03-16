package behavioral.observer;

import creational.singleton.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObserverTest {

  @BeforeEach
  void setUp() {
    Logger.INSTANCE.addToLog("OBSERVER\n\n");
  }

  @AfterEach
  void tearDown() {
    Logger.INSTANCE.saveLog();
  }

  @Test
  void test() {
    IndexIterator iterator = new IndexIterator();
    Person student1 = new Student(iterator);
    Person student2 = new Student(iterator);
    Person teacher = new Teacher();

    News news = new News();

    news.updateNews("The weather is nice today!");

    news.addObserver(student1);
    news.addObserver(student2);

    news.updateNews("News only for Students!");

    news.addObserver(teacher);

    news.updateNews("Important news for all!");

  }

}