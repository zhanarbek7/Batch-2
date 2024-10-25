package day55teacher;

// Interface Drivable
public interface Drivable {
    void start();
    void stop();
}

// Regular class Bike implementing Drivable interface
class Bike implements Drivable {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping.");
    }
}

// Main class
class MainDrive {
    public static void main(String[] args) {
        Drivable myBike = new Bike();
        myBike.start();
        myBike.stop();
    }
}

