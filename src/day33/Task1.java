package day33;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    // Task1 -
    //
    //* Create an array with the size n, entered from the console.
    //* Fill this array with random numbers between (1,11)
    //* Display array's elements
    //
    //Output:
    //Enter the size n: 5
    //Random elements: [5,2,3,9,8]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the size n:");
        int n =  scanner.nextInt();
        int[] array = new int [n];
        for ( int i = 0; i < array.length;i++){
            array[i]= random.nextInt(1,11);
        }
        System.out.println(Arrays.toString(array));
    }
}
