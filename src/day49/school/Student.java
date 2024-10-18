package day49.school;

public class Student extends Person{
    double gpa;
    String schoolName;
    public Student(String name, int age, double gpa, String schoolName){
        super(name,age);
        this.gpa = gpa;
        this.schoolName = schoolName;
    }


}
