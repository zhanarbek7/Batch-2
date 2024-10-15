package day25;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int counter = 0;
        // 0 <= 6
        while(counter < word.length()){
            System.out.println(word.charAt(counter));
            counter++;
        }


    }
}
