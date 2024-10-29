package day57.bankAccount;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited successfully " + amount);
        }
        else{
            System.out.println("Amount to deposit can't be negative!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn "+ amount);
        }
        else{
            System.out.println("Failed to withdraw : " + amount);
        }
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double initialBalance) {
        if(initialBalance>0){
            this.balance = initialBalance;
            System.out.println("Initial balance is set!");
        }
        else{
            System.out.println("Initial balance is invalid!");
        }
    }
}


