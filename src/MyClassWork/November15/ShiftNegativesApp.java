//package MyClassWork.November15;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Random;
//
//public class ShiftNegativesApp {
//    public static void main(String[] args) {
//        LinkedList<Integer> randomList = new ArrayList<>(30);
//        generateRandomList(randomList);
//        showRandomList(randomList);
//        shiftNegatives(randomList);
//        System.out.println();
//        showRandomList(randomList);
//    }
//
//    private static void showRandomList(ArrayList<Integer> randomList) {
//        randomList.forEach(item -> System.out.print(item + "  "));
//    }
//
//    private static void generateRandomList(ArrayList<Integer> randomList) {
//        while (randomList.size() != 30) {
//            randomList.add(new Random().nextInt(21) - 10);
//        }
//    }
//
//    private static void shiftNegatives(ArrayList<Integer> randomList) {
//        for (int i = 0; i <randomList.size(); i++) {
//            if (randomList.get(i) < 0) {
//            }
//        }
//    }
//}
//
