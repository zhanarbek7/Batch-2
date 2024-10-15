package day17;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Enter your special word: ");
        String specialWord = scanner.nextLine();

        System.out.println("Result: " + sentence.contains(specialWord));
    }
}
