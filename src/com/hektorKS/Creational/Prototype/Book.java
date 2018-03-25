package com.hektorKS.Creational.Prototype;


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
