package at.ac.fhstp.gof.singleton;

public class SimpleSingleton {
    private static SimpleSingleton instance;

    private int counter;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

    public void increment(int value) {
        counter += value;
    }

    public int getCounter() {
        return counter;
    }
}
