package day40;

import java.util.Arrays;

public class ArrayObjects2 {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new Car();
        cars[0].model = "Ford";
        cars[0].year = 2015;

        cars[1] = new Car();
        cars[1].model = "Tesla";
        cars[1].year = 2019;

        System.out.println(cars[0].model);
        System.out.println(cars[0].year);

        System.out.println(cars[1].model);
        System.out.println(cars[1].year);
    }
}
