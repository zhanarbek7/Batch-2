package day24;

import java.util.Random;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(1, 11);

        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int attempts = 2;
        boolean status = false;

        while (attempts > 0) {
            if (number == randomNumber) {
                status = true;
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Try again: " + attempts + " left");
                    number = scanner.nextInt();
                }
            }
        }

        if (status) {
            System.out.println("You won!");
        } else {
            System.out.println("You lose.");
        }

        System.out.println("Random number was: " + randomNumber);

    }
}
