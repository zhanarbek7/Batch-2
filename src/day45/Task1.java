package day45;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 23, 5, 5, 5, 1, 98, 18, 5, 34, 1));
        System.out.println(nums);

        for (int i = nums.size()-1; i >= 0; i--) {
            if(nums.get(i) == 1 || nums.get(i) == 5){
                nums.remove(i);
            }
        }
        System.out.println(nums);

    }
}
