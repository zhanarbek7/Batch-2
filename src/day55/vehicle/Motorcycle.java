package day55.vehicle;

public class Motorcycle extends Vehicle{
    @Override
    public void accelerate() {
        speed+=20;
        System.out.println("Motorcycle is accelerating");
    }
}
