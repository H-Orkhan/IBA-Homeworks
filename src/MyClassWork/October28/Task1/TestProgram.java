package MyClassWork.October28.Task1;

import java.util.stream.Stream;

public class TestProgram {
    public static void main(String[] args) {
        Stream.generate(() ->Math.random()*100)
                .limit(20)
                .forEach(System.out::println);
    }
}
