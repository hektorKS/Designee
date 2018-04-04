package main.java.Behavioral.Observer;

import java.util.LinkedList;
import java.util.Observable;

public class News extends Observable {

    private LinkedList<String> news;

    public News() {
        this.news = new LinkedList<>();
    }

    public void updateNews(String message)
    {
        this.news.add(message);
        setChanged();
        notifyObservers(this.news.getLast());
    }
}
