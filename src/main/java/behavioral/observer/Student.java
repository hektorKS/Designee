package behavioral.observer;


public class Student extends Person {
  private int index;

  Student(IndexIterator iterator) {
    this.index = iterator.getNext();
  }

  @Override
  public String toString() {
    return "Student inf" + Integer.toString(this.index);
  }
}