package main.java.Creational.DependencyInjection;

public class Session {
    private String sessionName;

    public Session(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }
}