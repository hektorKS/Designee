package test.java.Creational.Singleton;

import main.java.Creational.Singleton.EagerSingleton;
import main.java.Creational.Singleton.LazySingleton;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    /**
     * You may call any other static methods or static member variable too to load the singleton instance.
     */
    @Test
    public void eagerSingletonTest(){
        System.out.println("Before using EagerSingleton");
        EagerSingleton.message();
    }

    /**
     * Singleton INSTANCE not created.
     */
    @Test
    public void lazySingletonTest(){
        System.out.println("Before using LazySingleton");
        LazySingleton.message();
    }

}