package day17;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word1:");
        String word1 = scanner.nextLine();
        System.out.println("Please enter your word2:");
        String word2 = scanner.nextLine();

        String result = word1.substring(3) + word2.substring(3);
        System.out.println(result);
    }
}
