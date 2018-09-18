package other;

import java.util.LinkedList;
import java.util.List;


public class Lists {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println(reverseList(list));

        System.out.println(isListSorted(list));

        List<String> l = new LinkedList<>();
        l.add("dave");
        l.add("emma");
        l.add("arsenal");

        System.out.println(doesListContainString(l, "not"));
    }

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reverse = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0 ; i--) {
            reverse.add(list.get(i));
        }
        return reverse;
    }

    public static boolean isListSorted(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i-1)) {
                return false;
            }
        } return true;
    }

    public static boolean doesListContainString(List<String> list, String s) {
        for (int i = 0; i < list.size(); i++) {
            if (s.equals(list.get(i))) {
                return true;
            }

        } return false;
    }
}
