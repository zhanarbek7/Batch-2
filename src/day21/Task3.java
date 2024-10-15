package day21;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        if(password.contains("!")&& password.length()>=10){
            System.out.println("This password meets both criteria");
        }
        else{
            System.out.println("This password is too weak");
        }
    }
}
