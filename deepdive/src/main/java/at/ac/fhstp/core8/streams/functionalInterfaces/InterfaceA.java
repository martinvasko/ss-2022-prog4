package at.ac.fhstp.core8.streams.functionalInterfaces;

public interface InterfaceA extends DemoInterface {
    default void doSomething() {
      System.out.println(InterfaceA.class.getSimpleName() + " : " + "doSomething");
    }
  }
