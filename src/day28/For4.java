package day28;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of values you want to sum: ");
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++){
            System.out.print("Enter your number " + i + ": ");
            int num = sc.nextInt();
            sum+=num;
        }
        System.out.println("The sum of the entered numbers is : " + sum);
    }
}
