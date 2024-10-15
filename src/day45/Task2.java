package day45;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 4, 6, 7, 9));
        System.out.println(nums);
        int s = nums.getFirst();
        int g = nums.getLast();

        ArrayList<Integer> missing = new ArrayList<>();
        for (int i = s; i <= g; i++) {
            if (!nums.contains(i)) {
                missing.add(i);
            }
        }
        System.out.println(missing);
    }
}
