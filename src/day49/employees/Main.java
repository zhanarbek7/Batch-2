package day49.employees;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(
                "M456", "Smith", 80000, "IT");
        manager.increaseSalary(10000);
        manager.calculateYearlyBonus();
        manager.scheduleMeeting("12 PM");

    }
}
