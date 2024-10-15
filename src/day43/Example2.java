package day43;

import java.util.ArrayList;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Enter " + (i+1) + " number");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.println("numbers: " + numbers);
    }
}
