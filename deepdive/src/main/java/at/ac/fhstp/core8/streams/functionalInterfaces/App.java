package at.ac.fhstp.core8.streams.functionalInterfaces;

public class App {
    public static void main(String[] args) {
        DemoInterface.doMore();
        new ImplA().doSomething();
        // ImplA.doMore();
        new ImplB().doSomething();
    }
}
