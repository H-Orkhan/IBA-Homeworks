package MyClassWork.November8;

import java.util.ArrayList;
import java.util.List;

public class VowelsApp {
    public static void main(String[] args) {
        String origin = "abcdefghijklmnopqrstuvwxyz";
        String newString  = filter(origin);
        System.out.println(newString);

        String string = "abCD";
        //System.out.println(convert(string));
        int number = 3;
        System.out.println(check(number));

        int number2 = 10;
        System.out.println(check(number2));

       System.out.println(gen_prime(15000));

    }


   /* private static boolean max_palindrom() {
        for (int i = 10000; i <100000 ; i++) {
            if (String.valueOf(i).equals(String.valueOf(i)))
        }
    }*/

//    public static String convert (String origin) {
//        for (int i = 0; i <origin.length() ; i++) {
//
//            for (;origin.charAt(i) >= 'A' && origin.charAt(i) <= 'Z';) {
//                origin.toLowerCase().charAt(i);
//                break;
//            }
//            for (;origin.charAt(i) >='a' && origin.charAt(i) <='z';) {
//                origin.toUpperCase().charAt(i);
//                break;
//            }
//        }
//        return origin;
//    }

    private static String filter(String origin ) {
        String temp = new String ();

        for (int i = 0; i <origin.length() ; i++) {
            if (origin.charAt(i) != 'a' && origin.charAt(i) != 'o' && origin.charAt(i) != 'u' && origin.charAt(i) != 'e'
                    && origin.charAt(i) != 'i' )
            temp += origin.charAt(i);
        }
        return  temp;
    }


    public static boolean check(int origin) {
        if (origin == 2) return true;
        for (int i = 2; i < Math.sqrt(origin)+1 ; i++) {
            if (origin % i == 0) {
                return false;
            }
        }
        return  true;
    }


    public static List<Integer> gen_prime (int count) {
        ArrayList<Integer> prime = new ArrayList<Integer>();

        for (int number = 2;prime.size()<count;number++) {
            if (check(number)) {
                prime.add(number);
            }
        }
        return prime;
    }




}
