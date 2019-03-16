package creational.dependencyinjection;

public class User {
  private Session session;

  User(Session session) {
    this.session = session;
  }

  public String getName() {
    return this.session.getSessionName();
  }

  void setName(String sessionName) {
    this.session.setSessionName(sessionName);
  }
}
