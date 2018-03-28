package com.hektorKS.Creational.Prototype;

import com.hektorKS.Creational.Singleton.Logger;



/**
 * Point p = new Point(1,2);
 * Point p2 = p.clone();
 * Point p3 = p;
 * p2.x = 5;
 * p3.y = 7;
 *
 * Point p = new Point(1,2);
 *
 * .-----.    .-----.
 * p  ----->  |  x -+--> |  1  |
 * |     |    '-----'
 * |     |    .-----.
 * |  y -+--> |  2  |
 * '-----'    '-----'
 *
 *
 * Point p2 = p.clone();
 *
 * .-----.    .-----.    .-----.
 * p  ----->  |  x -+--> |  1  | <--+- x  |  <----- p2
 * |     |    '-----'    |     |
 * |     |    .-----.    |     |
 * |  y -+--> |  2  | <--+- y  |
 * '-----'    '-----'    '-----'
 *
 * Point p3 = p;
 *
 * .-----.    .-----.    .-----.
 * p  ----->  |  x -+--> |  1  | <--+- x  |  <----- p2
 * |     |    '-----'    |     |
 * |     |    .-----.    |     |
 * p3 ----->  |  y -+--> |  2  | <--+- y  |
 * '-----'    '-----'    '-----'
 *
 *
 * p2.x = 5;
 *
 * .-----.    .-----.    .-----.    .-----.
 * p  ----->  |  x -+--> |  1  |    |  x -+--> |  5  |
 * |     |    '-----'    |     |    '-----'
 * |     |    .-----.    |     |
 * p3 ----->  |  y -+--> |  2  | <--+- y  |  <----- p2
 * '-----'    '-----'    '-----'
 *
 *
 * p3.y = 7;
 *
 * .-----.    .-----.    .-----.    .-----.
 * p  ----->  |  x -+--> |  1  |    |  x -+--> |  5  |
 * |     |    '-----'    |     |    '-----'
 * |     |    .-----.    |     |
 * p3 ----->  |  y  |    |  2  | <--+- y  |  <----- p2
 * '--+--'    '-----'    '-----'
 * |     .-----.
 * '---> |  7  |
 * '-----'-----
 *
 * Prototype design pattern can be used when there is need to create many objects having the same type.
 * Main purpose of this design pattern is optimization, because cloning BIG object is much faster then creation
 * using ''new'' operator.
 *
 * Even in my mini test there is no doubt that cloning is bit faster(not much but still always faster).
 * Objects are really small, but what if we had huge object?
 * That would do the difference, especially if many of such objects was needed.
 *
 */

public class PrototypeTester {

    private JavaBook book1;
    private JavaBook book1Clone;
    private JavaBook book1Copy;
    private PythonBook book2;
    private PythonBook book2Clone;
    private StringBuilder log;

    public PrototypeTester() {
        this.log = new StringBuilder();
        log.append("Prototype design pattern tests\n");
        log.append("-> copy vs clone and correctness checking\n");
    }

    private void addCloneSummary(){

        log.append("OBJECTS SUMMARY:\n");
        log.append("\nbook1 == book1Clone: ");
        log.append(book1 == book1Clone);
        log.append("\nbook1 == book1Copy: ");
        log.append(book1 == book1Copy);

        log.append("\nbook1.getTitle() == book1Clone.getTitle(): ");
        log.append(book1.getTitle() == book1Clone.getTitle());
        log.append("\nbook1.getTitle() == book1Copy.getTitle(): ");
        log.append(book1.getTitle() == book1Copy.getTitle());

        log.append("\nbook2 == book2Clone: ");
        log.append(book2 == book2Clone);

        log.append("\nTitle: ");
        log.append(book1.getTitle());
        log.append(", theme: ");
        log.append(book1.getTopic());
        log.append("\n");

        log.append("Title: ");
        log.append(book1Clone.getTitle());
        log.append(", theme: ");
        log.append(book1Clone.getTopic());
        log.append("\n");

        log.append("Title: ");
        log.append(book2.getTitle());
        log.append(", theme: ");
        log.append(book2.getTopic());
        log.append("\n");

        log.append("Title: ");
        log.append(book2Clone.getTitle());
        log.append(", theme: ");
        log.append(book2Clone.getTopic());
        log.append("\n");

        log.append("-----------------------------------------------------------------------------------------------\n");

    }

    public void test() throws CloneNotSupportedException {


        book1 = new JavaBook("Java book 1", "programming");

        long cloneStart = System.nanoTime();
        book1Clone = (JavaBook) book1.clone();
        long cloneTimeMillis = System.nanoTime()- cloneStart;

        long copyStart = System.nanoTime();
        book1Copy = (JavaBook) book1.copy();
        long copyTimeMillis = System.nanoTime()- copyStart;

        log.append("TIME SUMMARY: \n");

        log.append("Clone time: ");
        log.append(cloneTimeMillis);
        log.append("ns \n");

        log.append("Copy time: ");
        log.append(copyTimeMillis);
        log.append("ns \n");

        book2 = new PythonBook("Python book 1", "programming");
        book2Clone = (PythonBook) book2.clone();


        book1Clone.setTitle("Java book 2");
        book2Clone.setTitle("Python book 2");
        addCloneSummary();

        Logger.INSTANCE.addToLog(log.toString());

    }
}
