package other;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<Integer, User> map = new HashMap<>();

        //To insert something into the map, use put
        map.put(1, new User("tom", "tom@google.com"));
        map.put(2, new User("ted", "ted@google.com"));
        map.put(3, new User("fred", "fred@google.com"));
        map.put(4, new User("bob", "bob@google.com"));
        map.put(5, new User("sam", "sam@google.com"));

        //To retrieve something from the map, you use get - but you must have a key
        User u = map.get(1); //tom
        System.out.println(u);

        for (int i = 1; i <= 5; ++i) {
            System.out.println(map.get(i));
        }
    }

}
