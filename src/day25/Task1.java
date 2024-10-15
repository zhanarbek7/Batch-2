package day25;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("The length is "+ word.length());
        int length = word.length();

        int c = 1;
        while(c <= length){
            System.out.println(c);
            c++;
        }
    }
}
