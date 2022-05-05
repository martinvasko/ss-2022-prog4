package at.ac.fhstp.core8.streams.functionalInterfaces;

public class Main {

    @FunctionalInterface
    public static interface Service {
        public Integer doWork(String value);
    }

    public static class ServiceImpl implements Service {
        @Override
        public Integer doWork(String value) {
            return Integer.valueOf(value);
        }
    }

    public static void main(String[] args) {
        Integer integer = new ServiceImpl().doWork("1");
        Service serviceA = (value) -> {
            return Integer.valueOf(value);
        };
        Service serviceB = Integer::valueOf;
        serviceA.doWork("1");
        serviceB.doWork("1");
    }
}
