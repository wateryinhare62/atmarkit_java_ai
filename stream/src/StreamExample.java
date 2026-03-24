import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Amy", "Charlie");
        System.out.println("Filter (startsWith A):");
        names.stream()
            .filter(s -> s.startsWith("A"))
            .forEach(s -> System.out.println(s));

        System.out.println("\nMap (to uppercase):");
        names.stream()
            .map(s -> s.toUpperCase())
            .forEach(s -> System.out.println(s));

        System.out.println("\nMap -> Reduce (sum of lengths):");
        int totalLength = names.stream()
            .map(s -> s.length())
            .reduce(0, (a, b) -> a + b);
        System.out.println("Total length: " + totalLength);
    }
}
