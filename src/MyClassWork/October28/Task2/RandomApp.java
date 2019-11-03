package MyClassWork.October28.Task2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomApp {
    public static void main(String[] args) {
        final String collect = Stream.generate(() ->((int) (Math.random() * 41) - 20))
                .limit(110)
                .map(Object::toString)
                .sorted()
                .collect(Collectors.joining(" ~ "," << "," >> "));
                 System.out.println(collect);

    }
}
