package day28;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 1; i <= 10; i++){
            System.out.println(random.nextInt(1,100));
        }
    }
}
