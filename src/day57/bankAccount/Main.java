package day57.bankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(500);
        bankAccount.deposit(-500);
        bankAccount.deposit(5000);
        bankAccount.withdraw(10000);
    }
}
