import java.util.Scanner;
import java.util.Random;
public class Homework_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char [][] a = new char [5][5];
        char target;
        Random random = new Random();
        for (int i=0;i<5;i++)
        {
            for (int j=0;j<5;j++)
            {
                a[i][j] = '-';
            }
        }
        show(a);
        int i = random.nextInt((4-0)+1);
        int j = random.nextInt((4-0)+1);
        int line;
        int column;
        target = a[i][j];
        while(true)
        {
            System.out.println("Input line");
            line = scanner.nextInt();
            if (line <1 || line >5) {
                System.out.println("Error Try again");
                continue;
            }
            System.out.println("Input column");
            column = scanner.nextInt();
            if (column <1 || column >5)
            {
                System.out.println("Error try again");
                continue;
            }
            a[line-1][column-1] = '*';
            show (a);
            if (a[line-1][column-1] == a[i][j])
            {
                System.out.println("You have won!");
                a[i][j] = 'x';
                show(a);
                break;
            }
        }
        }
        public static void show (char[][] a)
        {
            for (int i=0;i<5;i++)
            {
                for (int j=0;j<5;j++)
                {
                    System.out.printf("%c \t",a[i][j]);
                }
                System.out.println();
            }
        }

    }