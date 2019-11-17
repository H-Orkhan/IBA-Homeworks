package MyClassWork.November13;

import java.util.ArrayList;
import java.util.Collections;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(generatePrimeNumbers(500000).toString());

        System.out.println(maxPalindrome());
    }

    private static long maxPalindrome() {
        ArrayList<Long> palindromes = new ArrayList<>();
        long temp1;
        long temp2 = 0;
        long temp3;
        long count = 10000;

        for (long number = 10000;number < 1000000;number++) {
            while(number!=0) {
               temp1 = number % 10;
               temp2 += temp1*count;

               number /= 10;
               count /=10;
            }
            System.out.println(number);

            if (number == temp2 && (checkPrime(number)))
                palindromes.add(temp2);
        }

        return Collections.max(palindromes);
    }

    private static ArrayList<Long> generatePrimeNumbers(long count) {

        ArrayList<Long> numbers = new ArrayList<>();
        for (long number = 2; number <= count; number++) {
            if (checkPrime(number) ) {
                numbers.add(number);
            }
        }
        return numbers;
    }

    private static boolean checkPrime(long number) {
        for (int i = 2; i  < Math.sqrt(number) + 1 ; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    }
