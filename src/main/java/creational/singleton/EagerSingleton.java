package creational.singleton;

public class EagerSingleton {

  private static EagerSingleton INSTANCE = new EagerSingleton();

  private EagerSingleton() {
    System.out.println("Eager Singleton constructor");
  }

  static void message() {
    System.out.println("Eager Singleton message");
  }

  public static EagerSingleton getINSTANCE() {
    return INSTANCE;
  }
}
