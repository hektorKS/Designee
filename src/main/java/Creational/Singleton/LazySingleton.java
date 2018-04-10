package main.java.Creational.Singleton;

public class LazySingleton {

    private static LazySingleton INSTANCE = null;

    private LazySingleton(){
        System.out.println("Lazy Singleton constructor");
    }

    public static void message(){
        System.out.println("Lazy Singleton message");
    }

    public static LazySingleton getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
