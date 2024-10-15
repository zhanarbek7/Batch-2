package day28;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter number n:");
        int n = scanner.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            int randomNumber = random.nextInt(1,11);
            System.out.println(randomNumber);
            sum+= randomNumber;
        }
        System.out.println("sum = " + sum);

    }
}
