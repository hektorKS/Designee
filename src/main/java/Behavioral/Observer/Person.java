package main.java.Behavioral.Observer;

import main.java.Creational.Singleton.Logger;

import java.util.Observable;
import java.util.Observer;

public abstract class Person implements Observer {

    @Override
    public void update(Observable o, Object arg)
    {
        String news = String.valueOf(arg);
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.toString());
        stringBuilder.append(" was notified\n");
        stringBuilder.append(news);
        stringBuilder.append("\n\n");
        Logger.INSTANCE.addToLog(stringBuilder.toString());
    }
}
