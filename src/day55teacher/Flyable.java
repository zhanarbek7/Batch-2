package day55teacher;

// Interface Flyable
public interface Flyable {
    void takeOff();
    void land();
}
// Regular class Plane implementing Flyable
class Plane implements Flyable {
    @Override
    public void takeOff() {
        System.out.println("Plane is taking off.");
    }
    @Override
    public void land() {
        System.out.println("Plane is landing.");
    }
}

// Regular class Bird implementing Flyable
class Bird implements Flyable {
    @Override
    public void takeOff() {
        System.out.println("Bird is taking off.");
    }
    @Override
    public void land() {
        System.out.println("Bird is landing.");
    }
}

// Main class
class FlyMain {
    public static void main(String[] args) {
        Flyable plane = new Plane();
        Flyable bird = new Bird();

        plane.takeOff();
        plane.land();

        bird.takeOff();
        bird.land();
    }
}

