package day49.school;

public class Person {
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showPersonInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}
