import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static String extractAndSortNumbers(String[] array) {
        return Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String sortedNumbers = extractAndSortNumbers(array);
        System.out.println(sortedNumbers);
    }
}

