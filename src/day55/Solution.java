package day55;

import java.util.*;
import java.util.Map.Entry;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                List.of(1,2,3,3,3,2,4,5,3));
        findMostFrequent(list);
    }
    // map[],     list[1,2,3,3,3,2,4,5]
    public static void findMostFrequent(ArrayList<Integer> list){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            if(map.containsKey(i)){
                map.replace(i, map.get(i) + 1);
            }
            else{
                map.put(i, 1);
            }
        }
        int keyMax = -1, valueMax = -1;
        for(Entry<Integer, Integer> e: map.entrySet()){
            if(valueMax < e.getValue()){
                keyMax = e.getKey();
                valueMax = e.getValue();
            }
        }
        System.out.println(keyMax);
    }


}
