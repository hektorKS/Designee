package creational.prototype;


public class Book implements Cloneable {

  private String title;
  private String topic;

  Book(String title, String topic) {
    this.title = title;
    this.topic = topic;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  String getTitle() {
    return title;
  }

  void setTitle(String title) {
    this.title = title;
  }

  String getTopic() {
    return topic;
  }

}
