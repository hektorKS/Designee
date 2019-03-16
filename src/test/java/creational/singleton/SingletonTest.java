package creational.singleton;

import org.junit.jupiter.api.Test;

class SingletonTest {

  /**
   * You may call any other static methods or static member variable too to load the singleton instance.
   */
  @Test
  void eagerSingletonTest() {
    System.out.println("Before using EagerSingleton");
    EagerSingleton.message();
  }

  /**
   * Singleton INSTANCE not created.
   */
  @Test
  void lazySingletonTest() {
    System.out.println("Before using LazySingleton");
    LazySingleton.message();
  }

}