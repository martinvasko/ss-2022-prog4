package at.ac.fhstp.gof.singleton;

public final class LazySingleton {
    private static volatile LazySingleton instance = null;

    private int counter;
 
    // private constructor
    private LazySingleton() {
    }
 
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }

    public void increment() {
        counter += 1;
    }

    public int getCounter() {
        return counter;
    }
}
