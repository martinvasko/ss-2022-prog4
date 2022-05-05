package at.ac.fhstp.core8.streams.functionalInterfaces;

public interface InterfaceB {
    default void doSomething() {
        System.out.println(InterfaceA.class.getSimpleName() + " : " + "doSomething");
    }
}
