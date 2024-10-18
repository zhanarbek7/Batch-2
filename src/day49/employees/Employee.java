package day49.employees;

import java.sql.SQLOutput;

public class Employee {
    String employeeId;
    String name;
    double salary;

    public Employee(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double amount){
        salary+=amount;
        System.out.println("New Salary: " + salary);
    }

    public void calculateYearlyBonus(){
        System.out.println("Early Bonus: " + salary/10);
    }
}
