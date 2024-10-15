package day20;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt(); // 128

        if(number % 2 == 0){
            System.out.println("result: even");
        }
        else{
            System.out.println("result: odd");
        }
    }
}
