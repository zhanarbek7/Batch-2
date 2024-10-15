package day17;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word:");
        String word = scanner.nextLine(); // screen

        int lIndex1 = word.length() - 1; // n
        int lIndex2 = lIndex1-1; // e

        String result = word.charAt(lIndex2) + "" + word.charAt(lIndex1);
        System.out.println("result: " + result + result + result);
    }
}
