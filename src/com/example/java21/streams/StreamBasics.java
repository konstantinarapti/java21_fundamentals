package src.com.example.java21.streams;

import java.util.List;

public class StreamBasics {

    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Alex", "John", "Konstantina");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
