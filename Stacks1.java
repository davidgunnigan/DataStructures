package other;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Stacks1 {
    public static void main(String[] args) {
        /*Stack<String> s = new Stack<>();
        s.push("first");
        printStack(s);
        s.push("second");
        printStack(s);
        s.push("third");
        printStack(s);
        s.pop();
        printStack(s);
        s.pop();
        printStack(s);
        s.pop();
        printStack(s);*/

       String str = "reverse";

       System.out.println(reverseStack(str));

       List<String> list = new LinkedList<>();
       list.add("dave");
       list.add("emma");
       list.add("michel");
       System.out.println(doesListContainString(list, "random"));
    }

    public static void printStack(Stack<String> stack) {
        if (stack.isEmpty())
            System.out.println("stack is empty");
        else
            System.out.printf("%s TOP\n", stack);
    }

    public static String reverseStack(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static boolean doesListContainString(List<String> list, String s) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == s) {
                return true;
            }
        } return false;
    }
}
