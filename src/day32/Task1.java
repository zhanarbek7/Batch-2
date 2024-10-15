package day32;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1,3,5,6,10};
        array[0] = 100;
        array[array.length-1] = 100;
        System.out.println(Arrays.toString(array));
    }
}
