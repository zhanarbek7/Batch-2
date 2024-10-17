package day48;

public class Dog {
    String name;
    int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Dog: {" + "name:"+ name + "} {age="+age+"}";
    }
}
