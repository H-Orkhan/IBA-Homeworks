package MyClassWork.October30;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class StringApp {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>(30);
        generateList(strings);
        showList(strings);
        writeToText(strings);
        readText();
        sortList(strings);
        writeToText(strings);
        readText();
    }

    private static void sortList(ArrayList<String> strings) {
        strings.stream().sorted();
    }

    private static void readText() {
        try (FileReader reader = new FileReader("StringApp.txt")) {
            int c;
            while((c=reader.read())!=-1) {
                System.out.print((char) c);
            }
        }
        catch(IOException ex) {
            System.out.println("Smth is wrong");
        }
    }

    private static void writeToText(ArrayList<String> strings) {
        try(FileWriter writer = new FileWriter("StringApp.txt", false)) {
            writer.write(String.valueOf(strings));
        }
        catch(IOException ex){
            System.out.println("Smth is wrong");
        } }

    private static void showList(ArrayList<String> strings) {
        strings.forEach(System.out::println);
    }

    private static void generateList(ArrayList<String> strings) {
        while (strings.size()<30){
            strings.add(generateString());
        }
    }

    private static String generateString() {
        Random random = new Random();
        int length = random.nextInt(30-10+1)+10;
        String str = "";
        while(str.length()<=length) {
            str = str + (char) (random.nextInt(90- 65 + 1)+65);
        }
        return str;
    }
}
