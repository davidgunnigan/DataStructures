package other;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dupes {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(removeDuplicates(array)));
        System.out.println(Arrays.toString(removeDuplicatesWithSet(array)));
    }

    public static int[] removeDuplicates(int[] array) {
        int newLength = array.length;

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; i < i; j++) {
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

    public static int[] removeDuplicatesWithSet(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        int[] newArray = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            newArray[index] = num;
            index++;
        }
        return newArray;
    }
}
