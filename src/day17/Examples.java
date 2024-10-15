package day17;

import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int lIndex = word.length()-1;
        // Example 1
//        System.out.print(word.charAt(lIndex-1));
//        System.out.print(word.charAt(lIndex));
        // Example 2
//        System.out.print(word.charAt(0));
//        System.out.print(word.charAt(1));
//        System.out.print(word.charAt(lIndex-1));
//        System.out.print(word.charAt(lIndex));
        System.out.println(word.charAt(lIndex));
        System.out.println(word);
        System.out.println(word.charAt(0));

    }
}
