package day12;


import java.util.Scanner;

public class ScannerTopic {
    public static void main(String[] args) {
//        String name1 = "John";
//        String name2 = new String("John");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age + " years old.");

    }
}
