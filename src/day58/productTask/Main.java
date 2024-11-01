package day58.productTask;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1200, 10);
        Product headphone = new Product("Headphone", 50, 30);
        Product smartphone = new Product("Smartphone", 800, 15);

        laptop.setPrice(1000);
        headphone.setQuantity(5);
        smartphone.setName("");


    }
}
