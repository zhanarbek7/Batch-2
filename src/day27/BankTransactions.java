package day27;

import java.util.Scanner;

public class BankTransactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your balance:");
        double balance = scanner.nextDouble();
        String choice = "Y";

        while(!choice.equals("N")){
            System.out.println("1) Withdraw");
            System.out.println("2) Deposit");
            System.out.println("Please choose an operation: ");
            int option = scanner.nextInt();
            if(option==1){
                System.out.println("How much would you like to withdraw:");
                int amount = scanner.nextInt();
                balance-=amount;
                System.out.println("Successfully withdrawn!");
            }
            else{
                System.out.println("How much would you like to deposit:");
                int amount = scanner.nextInt();
                balance+=amount;
                System.out.println("Successfully made a deposit!");
            }
            System.out.println("Balance: " + balance);
            System.out.println("Would you like to continue Y/N:");
            scanner.nextLine();
            choice = scanner.nextLine();
        }
        System.out.println("Thank you!");

    }
}
