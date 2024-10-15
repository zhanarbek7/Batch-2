package day42.task1;

public class Laptop {
    String brand;
    String processor;

    public Laptop(String brand, String processor){
        this.brand = brand;
        this.processor = processor;
    }

    public void start(){
        System.out.println(brand + " laptop with " + processor + " is starting");
    }

    public void shutDown(){
        System.out.println(brand + " laptop with " + processor + " is shutting down");
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("HP", "Intel Core I12");
        Laptop laptop2 = new Laptop("Acer", "Intel Core I11");
        laptop1.start();
        laptop2.start();
    }

}
