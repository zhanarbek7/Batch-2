package day60;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(2,9,12,7));
        twoSum3(list, 11);
    }

    public static void twoSum1(ArrayList<Integer> list, int target) {
        int index1 = -1, index2 = -1;
        for(int i = 0; i < list.size(); i++){
            int currentValue = list.get(i); // 5
            int oNumber = target - currentValue; // 7
            if(list.contains(oNumber)){
                for(int j = 0; j < list.size(); j++){
                    if (list.get(j) == oNumber){
                        index1 = i;
                        index2 = j;
                        break;
                    }
                }
                break;
            }
        }
        System.out.println(index1 + " " + index2);

    }

    // [2,5,9,12,7], target = 11
    // map {2:0, 5:1, }
    public static void twoSum2(ArrayList<Integer> list, int target) {
        int index1 = -1, index2 = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int currentValue = list.get(i); // 9
            int pNumber = target - currentValue; // 2
            if(map.containsKey(pNumber)){
                index1 = i;
                index2 = map.get(pNumber);
            }
            map.put(currentValue, i);
        }
        System.out.println(index2 + " " + index1);
    }

    public static void twoSum3(ArrayList<Integer> list, int target){
        int index1 = -1, index2 = -1;

        for (int i = 0; i < list.size(); i++) {

            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target){
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
        }
        System.out.println(index1 + " " + index2);
    }
}
