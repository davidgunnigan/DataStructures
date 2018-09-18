package other;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapString2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Scanner wordScanner = new Scanner(input);

        while(wordScanner.hasNext()) {
            String token = wordScanner.next();

            if (map.containsKey(token)) {
                Integer counter = map.get(token);
                counter++;
                map.put(token, counter);
            } else {
                map.put(token, 1);
            }
        }
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
