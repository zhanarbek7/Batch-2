package day21;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        while (n <= 10) {
            System.out.println(n);
            n++;
        }
    }
}
