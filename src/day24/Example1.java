package day24;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number n:");
        int n = scanner.nextInt();

        int counter = 0;
        while(counter <= n){
            System.out.println("n = " + counter);
            counter++;
        }
    }
}
