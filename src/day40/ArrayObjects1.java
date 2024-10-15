package day40;

import java.util.Arrays;

public class ArrayObjects1 {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        Car car1 = new Car();
        car1.model = "Ford";
        car1.year = 2015;

        Car car2 = new Car();
        car2.model = "Tesla";
        car2.year = 2019;

        cars[0] = car1;
        cars[1] = car2;

        for (int i = 0; i < cars.length; i++) {
            cars[i].displayCarInfo();
        }
    }
}
