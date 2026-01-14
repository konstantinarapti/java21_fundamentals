package src.com.example.java21.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {

    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Alex", "John", "Konstantina", "Maria", "Mark");

        Map<Character, List<String>> grouped =
                names.stream()
                        .collect(Collectors.groupingBy(name -> name.charAt(0)));

        grouped.forEach((key, value) ->
                System.out.println(key + " -> " + value));
    }
}