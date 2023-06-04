package homework;
/**
 *Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Programme_7_ArrayListIsEmptyOrNot {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("Daffodil");
        list.add("Rose");
        list.add("Dahlia");
        list.add("Lily");
        list.add("Tulip");
        list.add("Lavender");
        list.add("Daisy");
        list.add("Orchid");
        list.add("Magnolia");
        System.out.println("Original array list: " + list);
        System.out.println("Checking the above array list is empty or not " + list.isEmpty());
        list.removeAll(list);
        System.out.println("Array list after remove all elements " + list);
        System.out.println("Checking the above array list is empty or not " + list.isEmpty());


    }


}
