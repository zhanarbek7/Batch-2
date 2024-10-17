package day48;

import java.util.ArrayList;
import java.util.List;

public class ToStringExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog1", 2);
        Dog dog2 = new Dog("Dog2",3);
        ArrayList<Dog> dogs = new ArrayList<>(List.of(dog1, dog2));
        System.out.println(dogs);
    }
}
