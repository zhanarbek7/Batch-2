package day33;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        int[] array3  = {array1[1], array2[1]};
        System.out.println("array3 = " + Arrays.toString(array3));
    }
}
