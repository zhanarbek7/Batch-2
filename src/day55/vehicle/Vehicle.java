package day55.vehicle;

public abstract class Vehicle {
    int speed;

    public abstract void accelerate();

    public void displaySpeed(){
        System.out.println(speed);
    }
}

