package day20;

import java.util.Scanner;

public class UTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 30;
        if(number % 2 == 0){
            System.out.println("by 2");
        }
        if(number % 3 == 0){
            System.out.println("by 3");
        }
        if(number % 5 == 0){
            System.out.println("by 5");
        }
        // if this number is divisible by 2
        // print: by 2
        // if this number is divisible by 3
        // print by 3
        // if this number is divisible by 5
        // print by 5

        // Output:
        // Enter a number
        // 15
        // by 3
        // by 5
    }
}
