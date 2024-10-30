package day58.switchCases;

import java.util.Scanner;

public class MenuDrivenExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Interactive Menu ---");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Deposit!");
                case 2 -> System.out.println("Withdraw!");
                case 3 -> System.out.println("Display balance!");
                case 4 -> {
                    System.out.println("Exiting the program...");
                    running = false;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }

    }
}
