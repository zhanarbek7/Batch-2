package day40;

public class Phone {
    String brand;
    double price;

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "Apple";
        phone.price = 1199.99;

        System.out.println(phone.brand);
        System.out.println(phone.price);
    }
}
