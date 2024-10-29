package day57teacher;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double initialBalance) {
        if(initialBalance>0){
            this.balance = initialBalance;
            System.out.println("Initial balance is deposited!");
        }
        else{
            System.out.println("Initial balance is invalid!");
        }
    }
}


