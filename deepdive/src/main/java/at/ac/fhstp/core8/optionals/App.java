package at.ac.fhstp.core8.optionals;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        if(empty.isPresent()) {
            String value = empty.get();
            System.out.println(value);
        }

        String value = "FH St. Pölten";
        Optional<String> optional = Optional.of(value);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        optional.ifPresent(v -> System.out.println(v));
    }
}
