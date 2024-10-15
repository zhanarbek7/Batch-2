package day24;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int counter = 1;
        while(counter<=10){
            System.out.println(counter + " * " + number + " = " + (counter * number));
            counter++;
        }
    }
}
