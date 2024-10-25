package day55.vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        car.accelerate();
        car.displaySpeed();

        motorcycle.accelerate();
        motorcycle.accelerate();
        motorcycle.accelerate();
        motorcycle.displaySpeed();
    }
}
