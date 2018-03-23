package com.hektorKS.Creational.Prototype;

import com.hektorKS.Creational.Singleton.Logger;

public class PrototypeTester {

    private JavaBook book1;
    private JavaBook book1Clone;
    private JavaBook book1Copy;
    private PythonBook book2;
    private PythonBook book2Clone;
    private PythonBook book2Copy;
    private StringBuilder log;

    public PrototypeTester() {
        this.log = new StringBuilder();
        log.append("Prototype design pattern tests\n");
        log.append("-> making copy and editing some fields\n");
    }

    private StringBuilder addCloneSummary(){

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

        log.append("\nTytuł: ");
        log.append(book1.getTitle());
        log.append(", temat: ");
        log.append(book1.getTopic());
        log.append("\n");

        log.append("Tytuł: ");
        log.append(book1Clone.getTitle());
        log.append(", temat: ");
        log.append(book1Clone.getTopic());
        log.append("\n");

        log.append("Tytuł: ");
        log.append(book2.getTitle());
        log.append(", temat: ");
        log.append(book2.getTopic());
        log.append("\n");

        log.append("Tytuł: ");
        log.append(book2Clone.getTitle());
        log.append(", temat: ");
        log.append(book2Clone.getTopic());
        log.append("\n");

        log.append("-----------------------------------------------------------------------------------------------\n");

        return log;
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

        Logger.INSTANCE.AddToLog(log.toString());

    }
}
