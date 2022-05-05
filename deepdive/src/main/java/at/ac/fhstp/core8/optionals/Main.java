package at.ac.fhstp.core8.optionals;

import java.util.Optional;

public class Main {
    @FunctionalInterface
    public static interface Service {
        public Optional<Integer> doWork(String value);
    }

    public static class ServiceImpl implements Service {
        @Override
        public Optional<Integer> doWork(String value) {
            try {
                return Optional.of(Integer.valueOf(value));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        Optional<Integer> integer = new ServiceImpl().doWork("1");

        Service serviceA = (value) -> {
            try {
                return Optional.of(Integer.valueOf(value));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            return Optional.empty();
        };
    }
}
