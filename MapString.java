package other;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapString {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please a Enter some text: ");
        String input = scanner.nextLine();

        Scanner wordScanner = new Scanner(input);
        while(wordScanner.hasNext()) {
            String token = wordScanner.next();

            if (map.containsKey(token)) {
                //get the current count of token from the map
                Integer count = map.get(token);
                //Increase it by 1
                count++;
                //Put count back in the map
                map.put(token, count);
            } else {
                //token is not in the map yet, so we add it to the map with a count of 1
                map.put(token, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

    }
}
