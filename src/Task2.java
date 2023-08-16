import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> sortAndUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Artem", "Peter", "Alice", "Bob");
        List<String> sortedAndUpperCased = sortAndUpperCase(names);
        sortedAndUpperCased.forEach(System.out::println);
    }
}