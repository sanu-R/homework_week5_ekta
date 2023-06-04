package homework;
/**
 *Write a Java program to retrieve an element (at a specified index) from a given
 * array list.
 */

import java.util.*;

public class Programme_6_RetrieveElement {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Watermelon");
        list.add("Pear");
        list.add("Cherry");
        list.add("Strawberry");
        list.add("Blueberry");
        list.add("Orange");
        list.add("Mango");
        list.add("Apricot");
        list.add("Blackcurrant");
        list.add("Fig");
        list.add("Nectarine");
        System.out.println(list);
        String element = list.get(0);
        System.out.println("First element: " +element);
         element =list.get(4);
        System.out.println("Fourth element: " +element);
    }
}