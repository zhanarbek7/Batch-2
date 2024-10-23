package day53.task1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        ArrayList<Animal> animals = new ArrayList<>(
                List.of(dog, cat));
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
