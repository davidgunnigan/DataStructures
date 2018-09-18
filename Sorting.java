package other;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(sortArray(array)));
    }

    public static int[] sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int numToInsert = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > numToInsert) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = numToInsert;
        }
        return array;
    }
}
