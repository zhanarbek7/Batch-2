package day21;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month");
        int month = scanner.nextInt();
        // between 3 and 5 -> spring
        // between 6 and 8 -> summer
        // between 9 and 11 -> fall
        // between 1 and 2 or 12 -> winter
        if(month>=3 && month<= 5){
            System.out.println("Spring");
        }
        else if(month>=6 && month<=8){
            System.out.println("Summer");
        }
        else if(month>=9 && month<=11){
            System.out.println("Fall");
        }
        else if(month>=1){
            System.out.println("Winter");
        }
        else{
            System.out.println("Invalid month");
        }
    }
}
