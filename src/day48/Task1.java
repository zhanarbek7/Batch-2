package day48;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,2,3,45,7,5,5));
        System.out.println(findUnique(list));
    }
    public static int findUnique(ArrayList<Integer> list){
        HashSet<Integer> uniqueElements = new HashSet<>(list);
        return uniqueElements.size();
    }
}
