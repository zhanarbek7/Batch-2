package day21;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        Ulan baike 2 condition, 2 condition blocks
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if(number>=-1000 && number<=-1){
            System.out.println("This is a happy number");
        }
        else{
            System.out.println("This is a regular number");
        }
    }
}
