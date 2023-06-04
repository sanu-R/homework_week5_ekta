package homework;
/**
 *Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;
import java.util.List;

public class Programme_4_ColourArrayList {
    public static void main(String[] args) {

       arrayList();


    }
    public static void arrayList(){
        List<String> list = new ArrayList<>();
        list.add("Green");
        list.add("White");
        list.add("Pink");
        list.add("Blue");
        list.add("Red");
        list.add("yellow");
        list.add("White");
        list.add("Gray");
        list.add("Orange");
        for (String colour : list) {
            System.out.println(colour);
        }

    }
}