package day21;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 2digit number:");
        int number = scanner.nextInt();
        // Mahabat eje - 2 conditional blocks, 2 conditions

        int firstDigit = number / 10;
        int lastDigit = number % 10;
        if(firstDigit % 2 == 0 && lastDigit % 2 == 0){
            System.out.println("Super even number");
        }
        else{
            System.out.println("Regular number");
        }

    }
}
