package day58.productTask;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1200, 10);
        Product headphone = new Product("Headphone", 50, 30);
        Product smartphone = new Product("Smartphone", 800, 15);


        laptop.setPrice(-500);
        laptop.setQuantity(0);
        laptop.restock(20);
        laptop.purchase(15);

        headphone.purchase(30);

        smartphone.restock(-50);


    }
}
