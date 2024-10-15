package day45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        int[] array1 = {1, 22, 99, 4, 77, 45, 4, 123};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 4) {
                for (int j = i + 1; j < array1.length; j++) {
                    System.out.print(array1[j] + " ");
                }
            }
        }




    }
}
