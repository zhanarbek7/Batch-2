package day42.task3;

import java.util.Scanner;

public class BankAccount {
    Scanner scanner = new Scanner(System.in);
    String bankName;
    String fullName;
    int balance;

    public BankAccount(String bankName, String fullName){
        this.bankName = bankName;
        this.fullName = fullName;
        this.balance = 0;
    }

    public void withdraw(){
        System.out.println("Enter amount to withdraw: ");
        int amount = scanner.nextInt();
        balance-=amount;
        System.out.println("Balance: " + balance);
    }

    public void deposit(){
        System.out.println("Enter amount to deposit: ");
        int amount = scanner.nextInt();
        balance+=amount;
        System.out.println("Balance: " + balance);
    }

    public void showBalance(){
        System.out.println(fullName + " has " + balance + "$");
    }

    public void convertToKGS(){
        System.out.println("USD to KGS " + balance * 84 + " KGS");
    }

    public void transfer(BankAccount to){
        System.out.println("Enter amount to transfer: ");
        int amount = scanner.nextInt();
        balance-=amount;
        to.balance+=amount;
        System.out.println("BankAccount1 balance: " + balance);
        System.out.println("BankAccount2 balance: " + to.balance);
    }



    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Chase", "Alan Joe");
        BankAccount bankAccount2 = new BankAccount("BOFA", "John Alex");

        bankAccount1.deposit();
        bankAccount1.withdraw();
        bankAccount1.showBalance();
        bankAccount1.convertToKGS();
        bankAccount1.transfer(bankAccount2);
    }
}
