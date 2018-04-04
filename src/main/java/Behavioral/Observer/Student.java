package main.java.Behavioral.Observer;


public class Student extends Person
{
    private int index;

    public Student(IndexIterator iterator) {
        this.index = iterator.getNext();
    }

    @Override
    public String toString() {
        return "Student inf" + Integer.toString(this.index);
    }
}