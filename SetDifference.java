package other;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetDifference {

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        Random r = new Random();

        for (int i = 0; i <=5; i++) {
            s1.add(r.nextInt(10));
        }
        System.out.println(s1);

        for (int i = 0; i <= 5; i++) {
            s2.add(r.nextInt(10));
        }
        System.out.println(s2);

        s2.removeAll(s1);

        System.out.println(s2);
    }
}
