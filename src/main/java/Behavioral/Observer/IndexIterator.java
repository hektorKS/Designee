package main.java.Behavioral.Observer;

public class IndexIterator {
    private int index;

    public IndexIterator() {
        this.index = 9999;
    }

    public int getNext(){
        this.index += 1;
        return index;
    }
}
