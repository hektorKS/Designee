package behavioral.observer;

class IndexIterator {
  private int index;

  IndexIterator() {
    this.index = 9999;
  }

  int getNext() {
    this.index += 1;
    return index;
  }
}
