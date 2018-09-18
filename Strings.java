package other;

public class Strings {

    public static void main(String[] args) {
        System.out.println(reverseString("dave"));
        System.out.println(isPalindrome1("daadaad"));
        System.out.println(isPalindrome1("ddaad"));
        System.out.println(isPalindrome2("daadaad"));
        System.out.println(isPalindrome2("ddaad"));
        System.out.println(isPalindrome3("daadaad"));
        System.out.println(isPalindrome3("ddaad"));
    }
    public static String reverseString(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome1(String s) {
        int n = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                 return false;
            }
        } return true;
    }
    public static boolean isPalindrome2(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }
    public static boolean isPalindrome3(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
