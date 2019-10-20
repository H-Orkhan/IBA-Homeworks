import java.util.Scanner;
import java.util.Random;
public class Homework_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char [][] a = new char [5][5];
        generateArea (a);
        show(a);
        int i = random.nextInt(5);
        int j = random.nextInt(5);
        char target = a[i][j];
        while(true) {
            int line = generateLine();
            if (check(line))   continue;

            int column = generateColumn();
            if (check (column))  continue;

            a[line-1][column-1] = '*';
            show (a);
            if (a[line-1][column-1] == a[i][j]) {
                System.out.println("You have won!");
                a[i][j] = 'x';
                show(a);
                break;
            } } }

    private static boolean check(int temp) {
        if (temp <1 || temp >5) {
            System.out.println("Error");
            return true;   }
        return false;
    }

    private static int generateColumn() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input column");
        return scanner.nextInt();
    }

    private static int generateLine() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input line");
        return scanner.nextInt();
    }

    private static void generateArea(char[][] a) {
        for (int i=0;i<5;i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = '-';
            }}}

    public static void show (char[][] a) {
        for (int i=0;i<5;i++) {
            for (int j=0;j<5;j++) {
                System.out.printf("%c \t",a[i][j]);
            }
            System.out.println();
        }}}