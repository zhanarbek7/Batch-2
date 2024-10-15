package day25;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.nextLine();

        int index = 0;
        int length = word.length()-1;

        while(index <= length){
            System.out.print(word.charAt(index) + ",");
            index++;
        }
    }
}
