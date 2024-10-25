package day55teacher.animals2;

// Abstract class Animal
public abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
    // Abstract method
    abstract void sound();

    // Regular method
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
// Subclass Dog
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    void sound() {
        System.out.println(name + " says: Woof!");
    }
}


// Subclass Cat
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }
    @Override
    void sound() {
        System.out.println(name + " says: Meow!");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Kitty");

        dog.sound();
        dog.sleep();

        cat.sound();
        cat.sleep();
    }
}


