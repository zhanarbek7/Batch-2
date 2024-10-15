package day21;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        if (score > 90) {
            System.out.println("Excellent score");
        }
        if (score >= 75) {  // This overlaps with the previous condition
            System.out.println("Good score");
        }
        if (score >= 50) {  // This overlaps with both previous conditions
            System.out.println("Pass score");
        }
        if (score < 50) {
            System.out.println("Failed");
        }

    }
}
