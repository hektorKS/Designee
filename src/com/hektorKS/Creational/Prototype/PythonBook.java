package com.hektorKS.Creational.Prototype;

public class PythonBook extends Book {

    public PythonBook(String title, String topic) {
        super(title, topic);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object copy(){
        return new JavaBook(new String(super.getTitle()), new String(super.getTopic()));
    }

}

