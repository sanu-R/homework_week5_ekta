package homework;
/**
 * Write a java program to reverse an array of integer values.
 */

import java.util.Arrays;

public class Programme_3_ReverseArray {
    public static void main(String[] args) {
        reverse();

    }

    public static void reverse() {
        int[] my_array1 = {32,43,87,96,77,54};
        System.out.println("Original array : "+ Arrays.toString(my_array1));
        for(int i = 0; i < my_array1.length / 2; i++)
        {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(my_array1));

    }

    }













