package day43;

import java.util.ArrayList;
import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i <= 10; i++){
            numbers.add(rand.nextInt(100)+1);
        }

        System.out.println("Random numbers: " + numbers);
    }
}
