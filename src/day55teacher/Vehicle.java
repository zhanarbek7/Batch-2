package day55teacher;
// Abstract class Vehicle
abstract class Vehicle {
    int speed;
    // Abstract method (to be implemented by subclasses)
    abstract void accelerate();
    // Regular method
    void displaySpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }
}
// Subclass Car extending abstract class Vehicle
class Car extends Vehicle {
    @Override
    void accelerate() {
        speed += 10;
        System.out.println("Car is accelerating.");
    }
}

class MotorCycle extends Vehicle{
    @Override
    void accelerate() {
        speed+=20;
        System.out.println("Motorcycle is accelerating");
    }
}
// Main class
class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.accelerate();
        myCar.displaySpeed();
        MotorCycle myMotorCycle = new MotorCycle();
        myMotorCycle.accelerate();
        myMotorCycle.displaySpeed();
    }
}

