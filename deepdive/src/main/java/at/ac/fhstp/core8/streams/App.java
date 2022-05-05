package at.ac.fhstp.core8.streams;

import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        mapSample();
    }

    public static void mapSample() {
        Stream.Builder<Integer> sb = Stream.builder();
        sb.accept(0);
        sb.accept(1);
        sb.accept(2);
        sb.accept(3);
        sb.accept(4);
        Stream<Integer> iStream = sb.build();
        iStream.map(i -> i * 10).forEach(u -> System.out.println(u));
    }

    public static Stream<Item> buildGOTStream() {
        Stream.Builder<Item> sb = Stream.builder();
        sb.accept(new Item("Daenerys", "Targaryen", 300));
        sb.accept(new Item("Jon", "Snow", 200));
        sb.accept(new Item("Arya", "Stark", 20));
        sb.accept(new Item("Sansa", "Stark", 30));
        sb.accept(new Item("Eddard", "Stark", 50));
        sb.accept(new Item("Khal", "Drogo", 100));
        sb.accept(new Item("Cersei", "Lannister", 200));
        return sb.build();
    }
}
