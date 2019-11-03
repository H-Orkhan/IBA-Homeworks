package MyClassWork;
import java.util.ArrayList;
import java.util.Random;
public class RandomCollect {
    public static void main(String[] args) {
        Random random = new Random ();
        ArrayList<Integer>Random = new ArrayList<>();

        for (int count = 0;count<100;count++) {
            int rand = random.nextInt(100);
            Random.add(rand);
        }
         ArrayList<Integer>Odd  = new ArrayList<>();
         ArrayList<Integer>Even = new ArrayList<>();

        for (Integer integer : Random) {
            if (integer % 2 != 0) Odd.add(integer);
            else Even.add(integer);
        }

        System.out.print("ArrayList: ");
        Random.forEach(item -> { System.out.print(item + " "); });

        System.out.print("\nOdd: ");
        Odd.forEach(item -> { System.out.print(item + " "); });

        System.out.print("\nEven: ");
        Even.forEach(item -> { System.out.print(item + " "); });

    }

}
