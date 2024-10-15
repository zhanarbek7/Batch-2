package day20;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean hasMembership = scanner.nextBoolean();

        if(age >= 18 && hasMembership){
            System.out.println("Access Granted.");
        }
        else {
            System.out.println("Access denied");
        }
    }
}
