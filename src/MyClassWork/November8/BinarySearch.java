/*package MyClassWork.November8;

public class BinarySearch {
    public static void main(String[] args) {
       int [] array = new int [100];
        generateRandomList(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ "  ");
        }
        System.out.println();
        sortRandomList(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+ "  ");
        }
        System.out.println();
        System.out.println(findElementInArray(301,array));

    }

    private static boolean findElementInArray(int number, int[] array) {
        int right = array.length-1;
        int left = 0;
        while(left<right) {
            int middle = ( right + right) / 2;
            if (number < array[middle]) {right = middle-1;}
            if (number > array[middle]) {left = middle + 1;}
            return number == array[middle];
        }
    }
//        int middle = array.length / 2;
//        if (i == middle) return true;
//        else if (i < middle) {
//            int [] newarray = new int[middle+1];
//            System.arraycopy(array,0,newarray,0,middle-1);
//            return findElementInArray(i,newarray);
//        }
//        else if (i > middle) {
//            int [] newarray = new int[middle+1];
//            System.arraycopy(array,0,newarray,middle+1,array.length-1);
//            return findElementInArray(i,newarray);
//        }
//        else return false;
//    }
//
    private static void sortRandomList(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i]>array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }


    private static int[] generateRandomList(int [] array) {
        for (int i = 0; i <array.length ; i++) {
            array[i] = (int)(Math.random()*100 + 256);
        }
        return array;
    }
}
*/