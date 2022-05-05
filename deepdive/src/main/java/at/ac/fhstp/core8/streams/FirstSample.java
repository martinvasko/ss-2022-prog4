package at.ac.fhstp.core8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class FirstSample {
    public static void main(String[] args) {
        // Stream from Array
        String[] arr = new String[] { "a", "b", "c" };
        Stream<String> arrayStream = Arrays.stream(arr);
        // Stream.of
        Stream<String> ofStream = Stream.of("a", "b", "c");
        // Stream from list
        List<String> list = new ArrayList<String>() {
            {
                add("first");
                add("second");
                add("third");
            }
        };
        Stream<String> listStream = list.stream();

        // Stream Builder
        Stream.Builder<String> streamBuilder = Stream.builder();
        streamBuilder.accept("a");
        streamBuilder.accept("b");
        streamBuilder.accept("c");
        streamBuilder.accept("d");

        Stream<String> builderStream = streamBuilder.build();
        builderStream.forEach(item -> System.out.println(item));

        
    }
}
