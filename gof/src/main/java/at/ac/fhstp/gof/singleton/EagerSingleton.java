package at.ac.fhstp.gof.singleton;

public class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();

    private int counter;
 
    // private constructor
    private EagerSingleton() {
    }
 
    public static EagerSingleton getInstance() {
        return instance;
    }

    public void increment() {
        counter += 1;
    }

    public int getCounter() {
        return counter;
    }
}
