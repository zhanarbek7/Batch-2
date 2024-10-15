package day15;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the car price: ");
        double carPrice = scanner.nextDouble();
        System.out.print("Enter the down payment: ");
        double downPayment = scanner.nextDouble();
        System.out.print("Enter the years (term): ");
        int term = scanner.nextInt();
        System.out.print("Enter the interest rate: ");
        double interest = scanner.nextDouble();

        double loan = carPrice-downPayment;
        double interestAmount = loan*(interest/100) * term;
        System.out.println("Loan amount: $" + loan);
        System.out.println("Interest amount: $" + interestAmount);
        System.out.println("Total payment: $" + (loan + interestAmount));
        System.out.println("Monthly payment: $" + (loan + interestAmount) / term / 12);
    }
}
