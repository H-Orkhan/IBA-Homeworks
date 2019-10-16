import java.util.Scanner;
public class Homework_3 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner (System.in);
        String change = new String ();
        String [][] scedule = new String [7][2];
        generate_scedule(scedule);
        while (true) {
            change = generate_change();
                switch (change) {
                    case "monday":
                        System.out.printf("Your tasks for %s is : %s",scedule [1][0],scedule [1][1]);break;
                    case "tuesday":
                        System.out.printf("Your tasks for %s is : %s",scedule [2][0],scedule [2][1]);break;
                    case "wednesday":
                        System.out.printf("Your tasks for %s is : %s",scedule [3][0],scedule [3][1]);break;
                    case "thursday":
                        System.out.printf("Your tasks for %s is : %s",scedule [4][0],scedule [4][1]);break;
                    case "friday":
                        System.out.printf("Your tasks for %s is : %s",scedule [5][0],scedule [5][1]);break;
                    case "saturday":
                        System.out.printf("Your tasks for %s is : %s",scedule [6][0],scedule [6][1]);break;
                    case "sunday":
                        System.out.printf("Your tasks for %s is : %s",scedule [0][0],scedule [0][1]);break;
                    case "exit":
                    System.exit(0);break;
                    default:
                        System.out.println("Sorry, I don't understand you, please try again");
                } } }

    private static String generate_change() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\nPlease, input the day of the week:");
        String change = scanner.nextLine();
        change = change.toLowerCase();
        change = change.replace(" ","");
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
    }}