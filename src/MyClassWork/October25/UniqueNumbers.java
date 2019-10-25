package MyClassWork.October25;

import java.util.*;
import java.util.Random;

public class UniqueNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> unique = new HashSet<>();

        while (unique.size()<20) {
        unique.add(random.nextInt(20+1)-10);
        }
        unique.forEach(System.out::println);
    }
}
