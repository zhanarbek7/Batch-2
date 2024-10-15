package day47;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,2,3,1,4,4,4));
        System.out.println(frequency(list));
    }

    public static HashMap<Integer, Integer> frequency(ArrayList<Integer> list){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer i : list){
            if(map.containsKey(i)){
                int value = map.get(i);
               map.replace(i, value+1);
            }
            else{
                map.put(i,1);
            }
        }

        return map;
    }

}
