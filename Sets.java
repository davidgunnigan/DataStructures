package other;

import java.util.*;

public class Sets {

    public static void main(String[] args) {

        //other.Sets = A collection of things, in no specific order (no ordering) with no duplicates
        //A set is a group of unique elements

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.remove(5);

        //You can iterate the set with a for each
        for (Integer i : set) {
            System.out.println(i);
        }

        // Removing duplicates from a list/array with a set in O(n) time
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            nums.add(i);
            nums.add(i);
        }

        System.out.println(nums);

        Set<Integer> numsSet = new HashSet<>();
        for (Integer i : nums) {
            numsSet.add(i);
        }

        List<Integer> deduped = new LinkedList<>();
        for (Integer i : numsSet) {
            deduped.add(i);
        }

        System.out.println(deduped);





    }
}
