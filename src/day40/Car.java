package day40;

public class Car {
    public String model;
    int year;

    public void displayCarInfo(){
        System.out.println(model);
        System.out.println(year);
    }

    public void startCar(){
        System.out.println("Car has started!");
    }

    public void stopCar(){
        System.out.println("Engine is off!");
    }

    public void openTrunk(){
        System.out.println("Trunk is open!");
    }

    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.model = "Toyota";
//        car1.year = 2014;
//        System.out.println(car1.model);
//        System.out.println(car1.year);
//
//        Car car2 = new Car();
//        car2.model = "Ford";
//        car2.year = 2020;
//        System.out.println(car2.model);
//        System.out.println(car2.year);

        Car car1 = new Car();
        Car car2 = new Car();
        car1.model = "Honda";
        car2.model = "Toyota";
        if(car1.model.equals(car2.model)){
            System.out.println("Same model");
        }
        else{
            System.out.println("Different model");
        }


    }


}
