package day58teacher;

public class BankAccount {
    static double interestRate = 0.05; // static variable
    double balance;
    BankAccount(double balance) {
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);
        // Access without instance
        System.out.println("Interest Rate: " + BankAccount.interestRate);
        account1.displayBalance();
        account2.displayBalance();
    }
}

