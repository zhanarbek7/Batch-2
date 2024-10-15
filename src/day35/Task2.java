package day35;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Task 2 -
        //
        //* Read from user 3 int numbers: n, lower, uppper
        //* n stands for the number of elements in the array
        //* lower stands for the minimum random number to generate
        //* upper stands for the maximum random number to generate
        //* declare an array with size n, and fill it with random numbers between(lower,upper)
        //Output:
        //Enter number n: 4
        //Enter lower bound: 100
        //Enter upper bound: 1000
        //Result: [124, 764, 334, 105]

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your number: ");
        int n = scanner.nextInt();
        System.out.println("Enter a lower range: ");
        int lower = scanner.nextInt();
        System.out.println(" Enter a upper range: ");
        int upper = scanner.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(lower,upper);

        }
        System.out.println(Arrays.toString(array));
    }
}
