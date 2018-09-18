package other;

import java.util.Stack;

public class Stacks2 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(21);
        stack.push(40);
        stack.push(31);
        stack.push(43);
        stack.push(5);
        System.out.println(stack);
        System.out.println(reverseStack1(stack));
        System.out.println(reverseStack2(stack));
    }

    public static Stack<Integer> reverseStack1(Stack<Integer> stack) {
        Stack<Integer> reverse = new Stack<>();
        for (int i = stack.size() - 1; i >= 0; i--) {
            reverse.add(stack.get(i));
        } return reverse;
    }
    public static Stack<Integer> reverseStack2(Stack<Integer> stack) {
        Stack<Integer> reverse = new Stack<>();
        while(!stack.isEmpty()) {
            reverse.push(stack.pop());
        } return reverse;
    }
}
