import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Amy", "Charlie");
        names.stream()
            .filter(s -> s.startsWith("A"))
            .forEach(s -> System.out.println(s));
    }
}
