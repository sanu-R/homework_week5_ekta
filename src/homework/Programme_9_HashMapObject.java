package homework;

import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer Value and use for each
 * loop to iterate the value from Map.
 */

public class Programme_9_HashMapObject {

    public static void main(String[] args) {

        m1();
    }

    public static void m1() {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Pual", 32);
        people.put("Devid", 45);
        people.put("Mary", 55);
        people.put("Edam", 23);
        people.put("Garry", 35);
        people.put("Matin", 78);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + "  value: " + people.get(i));

        }

    }


}
