package day40;

import java.util.Scanner;

public class Sum13 {
    public static void main(String[] args) {
        int[] array = {3, 3, 7, 2, 3, 6, 3};
        System.out.println(haveThree(array));
    }

    public static boolean haveThree(int[] nums) {
        int count = 0;
        boolean prevWasThree = false;
        if (nums.length < 5) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (prevWasThree) {
                    return false;
                }
                count++;
                prevWasThree = true;
            }
            else{
                prevWasThree = false;
            }
        }

        return count == 3;
    }
}
