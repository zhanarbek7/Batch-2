package day49.employees;

public class Manager extends Employee{

    String department;

    public Manager(String employeeId, String name,
                   double salary, String department){
        super(employeeId, name, salary);
        this.department = department;
    }

    public void scheduleMeeting(String time){
        System.out.println("Scheduled a meeting at " + time);
    }

}
