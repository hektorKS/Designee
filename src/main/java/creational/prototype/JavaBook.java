package creational.prototype;

public class JavaBook extends Book {

  public JavaBook(String title, String topic) {
    super(title, topic);
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public Object copy() {
    return new JavaBook(new String(super.getTitle()), new String(super.getTopic()));
  }
}
