package main.java.Creational.DependencyInjection;

public class User {
    private Session session;

    public User(Session session) {
        this.session = session;
    }

    public String getName(){
        return this.session.getSessionName();
    }

    public void setName(String sessionName){
        this.session.setSessionName(sessionName);
    }
}
