package MyClassWork.November1;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        int [] Array = new int [20];
        int [] SortedArray = new int [20];
        generate(Array);
        System.arraycopy(Array,0,SortedArray,0,20);
        sort(SortedArray);
        print("Original",Array);
        print("Sorted  ",SortedArray);
    }



    private static void print(String str,int[] array) {
        System.out.print(str + ": [ ");
        for (int value : array) {
            System.out.print(value + "  ");
        }
        System.out.print("] \n");
    }

    private static void sort(int[] array) {
        int temp = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length-1 ; j++) {
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    private static void generate(int[] Array) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            Array[i] = random.nextInt(120);
        }
    }
}
