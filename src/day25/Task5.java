package day25;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int counter = 1;
        int sum = 0;
        int n = scanner.nextInt();
        while(counter <= n){
            sum += counter;
            counter++;
        }
        System.out.println("sum = " + sum);


    }
}
