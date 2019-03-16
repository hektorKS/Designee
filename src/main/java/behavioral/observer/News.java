package behavioral.observer;

import java.util.LinkedList;
import java.util.Observable;

class News extends Observable {

  private LinkedList<String> news;

  News() {
    this.news = new LinkedList<>();
  }

  void updateNews(String message) {
    this.news.add(message);
    setChanged();
    notifyObservers(this.news.getLast());
  }
}
	