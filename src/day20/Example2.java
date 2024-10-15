package day20;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {


        // you qualify for discount only if you are older than 65 and younger than 123
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if(age >= 65 && age <= 123){
            System.out.println("You qualify for a senior discount");
        }
        else{
            System.out.println("You don't qualify for a senior discount");
        }
    }
}
