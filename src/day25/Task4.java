package day25;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scanner.nextLine();
        int index = word.length()-1;

        System.out.print("Result: ");
        while(index >= 0){
            System.out.print(word.charAt(index));
            index--;
        }



    }
}
