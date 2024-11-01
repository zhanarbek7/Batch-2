package day60teacher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(3, 4, 5, 6));
        intersection(list1, list2);
    }

    public static void intersection(ArrayList<Integer> list1, ArrayList<Integer> list2){
        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> resultSet = new HashSet<>();

        for (Integer num : list2) {
            if (set1.contains(num)) {
                resultSet.add(num); // Add to result if found in set1
            }
        }

        System.out.println(resultSet);
    }
}
