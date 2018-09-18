package other;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArrays {

    public static void main(String[] args) {
        int n = 1000000;
        int[] array = new int[n];
        for (int i = 0; i < n; i+=2) {
            array[i] = i;
            array[i + 1] = i;
        }

        long start = System.currentTimeMillis();
        array = removeDuplicates(array);
        long timeTaken = System.currentTimeMillis() - start;
        System.out.println("TimeTaken: " + timeTaken);
    }

    public static int[] removeDuplicatesWithSet(int[] array) {
        Set<Integer> deduped = new HashSet<>();
        for (int num : array) {
            deduped.add(num);
        }

        int[] newArray = new int[deduped.size()];
        int index = 0;
        for (Integer num : deduped) {
            newArray[index] = num;
            index++;
        }

        return newArray;
    }

    public static int[] removeDuplicates(int[] array) {
        int newLength = array.length;

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    newLength--;
                    break;
                }
            }
        }

        int[] newArray = new int[newLength];
        newArray[0] = array[0];
        int index = 1;
        boolean isDuplicate;

        for (int i = 1; i < array.length; i++) {
            isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                newArray[index] = array[i];
                index++;
            }
        }

        return newArray;
    }


}
