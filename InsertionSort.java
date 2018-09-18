package other;

import java.util.Arrays;

public class InsertionSort {

    public static int[] sortArray(int[] array) {
        int key = 0;
        for (int i = 1; i < array.length ; i++) {
            key = array[i];
            int j = i - 1;
            while(j >= 0 && key < array[j]) {
                int tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
                j--;
            }
        }
        return array;
    }

    public static int[] sortArray2(int[] array) {
        // i is partition so loop starts as 1
        for (int i = 1; i < array.length; i++) {
            int numToInsert = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > numToInsert) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = numToInsert;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        sortArray2(array);
        System.out.println(Arrays.toString(array));
    }

}
