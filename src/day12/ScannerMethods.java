package day12;


import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter boolean value:");
        boolean bValue = scanner.nextBoolean(); // Reads a boolean value from console

        scanner.nextLine();
        System.out.println("Enter your name: ");
        String name  = scanner.nextLine();


        System.out.println(bValue);
        System.out.println(name);

    }
}
