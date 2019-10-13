import java.util.Scanner;
import java.util.Random;
public class Homework_1 {
    public static void main(String[] args) {
        Random  random  = new Random();
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Input your name: ");
        name = scanner.nextLine();
        System.out.println("Let the game begins!");
        int number = random.nextInt((100) + 1);
        int[] a = new int[101];
        int count = 0;
        for (int i = 0;;i++)
        {
            System.out.println("Input your number");
            a[i] = scanner.nextInt();
            if (a[i] < number) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (a[i] > number) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.printf("Congratulations,%s\n", name);
                count = i+1;
                break; }}}}
