package day53teacher;

import java.util.ArrayList;
import java.util.List;

public class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animals.add(dog);
        animals.add(cat);

        for (Animal animal : animals) {
            animal.sound();  // Calls the overridden method of the actual object type.
        }
    }
}



