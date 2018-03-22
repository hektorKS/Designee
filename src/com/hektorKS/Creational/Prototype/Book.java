package com.hektorKS.Creational.Prototype;

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
 * Wzorzec Prototype można stosować w sytuacjach, gdy tworzona jest duża liczba obiektów tego samego typu.
 * Stosuje się go głównie w celach optymalizacji, gdyż klonowanie obiektu jest szybsze niż jego stworzenie.
 *
 * Cza wychodzi porównywalny
 * Wyniki mogą być niemiarodajne, ponieważ są to bardzo małe obiekty???
 *
 */
public class Book implements Cloneable {

    private String title;
    private String topic;

    public Book(String title, String topic) {
        this.title = title;
        this.topic = topic;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

}
