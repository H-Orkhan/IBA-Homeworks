package HomeWork3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        String change;
        String[][] schedule = new String[7][2];
        generate_scedule(schedule);
        while (true) {
            change = generateChange();
            switch (change) {
                case "monday":
                    System.out.printf("Your tasks for %s is : %s", schedule[1][0], schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.printf("Your tasks for %s is : %s", schedule[2][0], schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.printf("Your tasks for %s is : %s", schedule[3][0], schedule[3][1]);
                    break;
                case "thursday":
                    System.out.printf("Your tasks for %s is : %s", schedule[4][0], schedule[4][1]);
                    break;
                case "friday":
                    System.out.printf("Your tasks for %s is : %s", schedule[5][0], schedule[5][1]);
                    break;
                case "saturday":
                    System.out.printf("Your tasks for %s is : %s", schedule[6][0], schedule[6][1]);
                    break;
                case "sunday":
                    System.out.printf("Your tasks for %s is : %s", schedule[0][0], schedule[0][1]);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again");
            }
        }
    }

    private static String generateChange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease, input the day of the week:");
        String change = scanner.nextLine();
        change = change.toLowerCase();
        change = change.replace(" ", "");
        return change;
    }

    private static void generate_scedule(String[][] scedule) {
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "go to university; have a rest";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "go to courses;listen music";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "go to university; have a rest";
        scedule[5][0] = "Friday";
        scedule[5][1] = "go to courses;read a book";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "have a rest; watch TV;play Playstation";
    }
}