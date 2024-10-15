package day47;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Set.of(1,2,3,4,5));
        set.add(1);

        set.remove(1); // size  4
        System.out.println(set);
        for (Integer i : set) {
            System.out.println(i);
        }

    }
}
