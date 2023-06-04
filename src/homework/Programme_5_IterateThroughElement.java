package homework;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterate.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Programme_5_IterateThroughElement {
    public static void main(String[] args) {
        element();

    }

    public static void element() {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("pink");
        list_Strings.add("Green");
        list_Strings.add("Yellow");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        for (String element : list_Strings) {
            System.out.println(element);
        }
        Iterator<String> colour = list_Strings.iterator();
        while (colour.hasNext()) {
            System.out.println(colour.next());
        }


    }

}
