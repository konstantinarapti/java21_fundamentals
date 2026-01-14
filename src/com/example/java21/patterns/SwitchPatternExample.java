package src.com.example.java21.patterns;

public class SwitchPatternExample {
    
    public static void main(String[] args) {
        Object value = "Hello";

        String result = switch (value) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case null -> "Null value";
            default -> "Unknown type";
        };

        System.out.println(result);
    }
}
