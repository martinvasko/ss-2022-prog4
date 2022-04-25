package at.ac.fhstp.gof.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {
    public ExpensiveObjectImpl() {
        setup();
    }

    @Override
    public void process() {
        System.out.println("Processing complete");
    }

    private void setup() {
        System.out.println("Some long-running, complex setup routine...");
    }
}
