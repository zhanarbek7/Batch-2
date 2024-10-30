package day58.typeCasting;

import day12.Calculator;

import java.util.ArrayList;

public class TypeCasting {
    public static void main(String[] args) {
        double d = 5.8;
        int number = (int)d;
        System.out.println(number);


        // Type Animal, object of Dog class
        // we can't call hunt()
        Animal dog1 = new Dog();
        // Type Dog, object of Dog class
        // we can call all methods()
        Dog dog2 = new Dog();

        // Changing type from Animal to Dog
        ((Dog)dog1).hunt();
    }
}

abstract class Animal{
    String name;
    int age;
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    public void hunt(){
        System.out.println("Dog hunts");
    }
}
