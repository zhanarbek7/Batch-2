package day43;

import java.util.ArrayList;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find: ");
        int target = scanner.nextInt();

        if(numbers.contains(target)){
            System.out.println(target + " is found in the ArrayList");
        }
        else{
            System.out.println(target + " is not found in the ArrayList");
        }
    }
}
