package day12;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter value for variable a:");
        int a = reader.nextInt();
        System.out.println("Enter value for variable b:");
        int b = reader.nextInt();
        System.out.println(a + " + " + b + " = " + (b));
        System.out.println(a + " * " + b + " = " + (a * b));

    }
}
