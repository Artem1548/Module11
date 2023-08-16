package Task5;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1, 2, 3);
        Stream<Integer> secondStream = Stream.of(4, 5, 6);

        Task5 StreamUtils = null;
        Stream<Integer> zippedStream = Task5.zip(firstStream, secondStream);

        zippedStream.forEach(System.out::println);
    }
}
