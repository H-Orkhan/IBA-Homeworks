package MyClassWork;
import java.util.Random;
public class RandomArrayApp {
    public static void main(String[] args) {
        int []array = new int [20];
        Random random = new Random ();

        for (int i = 0; i <20 ; i++) {
            array[i] = random.nextInt(11);
        }

        for (int i = 0; i <20 ; i++) {

            if (array[i] %2  == 0) {
                if (array[i]%3 == 0) {
                    System.out.println("fizzbuzz");
                }
                System.out.println("fizz");
            }
            else if (array[i]%3 == 0){
                System.out.println("buzz");
            }
            else {
                System.out.println();
            }

        }
    }
}
