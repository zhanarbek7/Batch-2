package day60teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(2,5,7,12,10));
        twoSum(list, 9);
    }

    public static void twoSum(ArrayList<Integer> list, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < list.size(); i++) {
            int currentValue = list.get(i);
            int complement = target - currentValue;

            if (map.containsKey(complement)) {
                result[0] = i;
                result[1] = map.get(complement);
                break;  // Exit loop once a match is found
            }

            map.put(currentValue, i);
        }

        System.out.println(Arrays.toString(result));
    }

}
