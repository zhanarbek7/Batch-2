package day20;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >= 0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}
