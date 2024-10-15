package day24;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while(number>=1){
            System.out.println(number);
            number--;
        }
    }
}
