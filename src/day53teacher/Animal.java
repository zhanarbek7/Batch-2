package day53teacher;

public class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }

    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();  // Output: Dog barks
    }


}


class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{

}

