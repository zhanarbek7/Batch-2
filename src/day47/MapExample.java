package day47;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        map.put(1,2);
        map.put(2,1);
        map.put(3,1);
        System.out.println(map);


        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){

            }
        }
    }
}
