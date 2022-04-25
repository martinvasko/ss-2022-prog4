package at.ac.fhstp.gof.singleton;

public class App {
    public static void main(String[] args) {
        // Simple
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        for (int i = 0; i < 5; i++) {
            simpleSingleton.increment(10);
        }
        SimpleSingleton other = SimpleSingleton.getInstance();
        System.out.println(other.getCounter());

        // Eager
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton otherInstance = EagerSingleton.getInstance();

        LazySingleton lazySingleton = LazySingleton.getInstance();
        for (int i = 0; i < 5; i++) {
            eagerSingleton.increment();
            otherInstance.increment();
            lazySingleton.increment();
        }
        EagerSingleton otheEagerSingleton = EagerSingleton.getInstance();
        System.out.println(otheEagerSingleton.getCounter());
        System.out.println(otherInstance.getCounter());

        LazySingleton otherLazySingleton = LazySingleton.getInstance();
        System.out.println(otherLazySingleton.getCounter());

    }
}
