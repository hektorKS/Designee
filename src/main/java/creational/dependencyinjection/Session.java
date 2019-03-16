package creational.dependencyinjection;

class Session {
  private String sessionName;

  Session(String sessionName) {
    this.sessionName = sessionName;
  }

  String getSessionName() {
    return sessionName;
  }

  void setSessionName(String sessionName) {
    this.sessionName = sessionName;
  }
}