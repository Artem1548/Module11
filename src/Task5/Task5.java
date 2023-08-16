package Task5;

import java.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        Spliterator<T> spliterator = new Spliterator<T>() {
            @Override
            public boolean tryAdvance(Consumer<? super T> action) {
                if (firstIterator.hasNext() && secondIterator.hasNext()) {
                    action.accept(firstIterator.next());
                    action.accept(secondIterator.next());
                    return true;
                }
                return false;
            }

            @Override
            public Spliterator<T> trySplit() {
                return null;
            }

            @Override
            public long estimateSize() {
                return Long.MAX_VALUE; // Unknown size
            }

            @Override
            public int characteristics() {
                return ORDERED | IMMUTABLE | NONNULL;
            }
        };

        return StreamSupport.stream(spliterator, false);
    }
}
