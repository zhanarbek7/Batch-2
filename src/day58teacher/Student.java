package day58teacher;

public class Student {
    String name;
    static double moneyBox = 0; // Shared moneyBox for all students
    public Student(String name) {
        this.name = name;
    }

    public void contributeToMoneyBox(double amount) {
        moneyBox += amount;
        System.out.println(name + " contributed $" + amount + " to the moneyBox.");
    }

    static void checkTotalMoney() {
        System.out.println("Total amount collected: $" + moneyBox);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

        student1.contributeToMoneyBox(10);
        student2.contributeToMoneyBox(15);
        student3.contributeToMoneyBox(20);

        // Check the total money collected
        Student.checkTotalMoney();
    }
}
