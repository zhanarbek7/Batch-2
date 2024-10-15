package day43;

import java.util.ArrayList;

public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + " " +  numbers.get(i));
        }
    }
}
