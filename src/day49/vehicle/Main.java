package day49.vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // these properties are defined in the Vehicle
        car.brand = "Toyota";
        car.model = "Camry";
        car.year = 2015;
        // this method is defined in the Vehicle
        car.move();
        // this method is defined in the Car class
        car.honk();


        Vehicle vehicle = new Vehicle();
        vehicle.move();
    }
}

