package at.ac.fhstp.core8.streams.functionalInterfaces;

public interface DemoInterface {
    static void doMore() {
        System.out.println(DemoInterface.class.getSimpleName() + " : " + "doMore");
      }
    
      default void doSomething() {
        System.out.println(DemoInterface.class.getSimpleName() + " : " + "doSomething");
      }
}
