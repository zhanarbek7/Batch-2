package day17;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your word:");
        String word = scanner.nextLine();
        int halfLength = word.length()/2;
        System.out.println("result: " + word.substring(0,halfLength));
    }
}
