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
 * Prototype design pattern can be used when there is need to create many objects having the same type.
 * Main purpose of this design pattern is optimization, because cloning BIG object is much faster then creation
 * using ''new'' operator.
 *
 * Even in my mini test there is no doubt that cloning is bit faster(not much but still always faster).
 * Objects are really small, but what if we had huge object?
 * That would do the difference, especially if many of such objects was needed.
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
