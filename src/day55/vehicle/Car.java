package day55.vehicle;

public class Car extends Vehicle{
    @Override
    public void accelerate() {
        speed+=10;
        System.out.println("Car is accelerating");
    }
}
