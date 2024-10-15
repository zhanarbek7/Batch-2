package day25;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        // counter
        int n = scanner.nextInt();

        // condition
        while(n != 0){
            System.out.println("Try again!");
            System.out.println("Enter a number:");
            n = scanner.nextInt();
        }
        System.out.println("Program is stopped!");
    }
}
