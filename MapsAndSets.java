package other;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MapsAndSets {
    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
        System.out.println(Arrays.toString(removeDuplicates(array)));
    }
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> removeDupes = new HashSet<>();
        for (int num : array) {
            removeDupes.add(num);
        }
        int[] newArray = new int[removeDupes.size()];
        int index = 0;
        for (Integer num : removeDupes) {
            newArray[index] = num;
            index++;
        }
        return newArray;
    }
}
