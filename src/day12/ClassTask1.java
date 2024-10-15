package day12;

import java.util.Scanner;

public class ClassTask1 {
    public static void main(String[] args) {
        // Scanner object is created for user inputs
        Scanner scanner = new Scanner(System.in);
        // Print a prompt message
        System.out.println("Enter your name:");
        // To read text from keyboard and assign it to name object
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
