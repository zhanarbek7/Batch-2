package day58.staticKeyword.cars;

public class Car {
    public static int number;
    public static String dealer;

    public String brand;
    public int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public static void method(){
        System.out.println("This is a static method");
    }

    public void displayDetails(){
        System.out.println(brand);
        System.out.println(year);
    }
}
