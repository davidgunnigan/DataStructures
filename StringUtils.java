package other;

public class StringUtils {
    public static boolean doesStringContain(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return true;
            }
        } return false;
    }

    public static int countNumOccurences(String s, char c) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                counter++;
            }
        }
        return counter;
    }
}
