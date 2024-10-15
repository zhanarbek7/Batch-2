package day28;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println(rand.nextInt(1,15));
        System.out.println(rand.nextInt(-200,-100));
        System.out.println(rand.nextInt(5000,10000));
    }
}
