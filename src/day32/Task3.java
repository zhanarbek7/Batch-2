package day32;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter number for index " + i);
            numbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
