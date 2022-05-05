package at.ac.fhstp.core8.streams;

import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        Stream.Builder<Integer> sb = Stream.builder();
        sb.accept(0);
        sb.accept(1);
        sb.accept(2);
        sb.accept(3);
        Stream<Integer> sInt = sb.build();
        Stream<Integer> filteredStream = sInt.filter(i -> i > 2);
        filteredStream.forEach(i -> System.out.println(i));
    }
}
