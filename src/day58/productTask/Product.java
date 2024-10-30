package day58.productTask;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }
        else{
            System.out.println("Name can't be empty");
        }
    }

    public void setPrice(double price) {
        if(price>0){
            this.price = price;
        }
        else{
            System.out.println("Price can't be zero");
        }
    }

    public void setQuantity(int quantity) {
        if(quantity>0){
            this.quantity = quantity;
        }
        else{
            System.out.println("Quantity can't be zero");
        }
    }

    public void purchase(int qty){
        if(quantity>=qty){
            quantity-=qty;
        }
        else{
            System.out.println("Not enough in stock");
        }
    }

    public void restock(int qty){
        if(qty>0){
            quantity+=qty;
        }
        else{
            System.out.println("qty can't be zero or negative");
        }
    }
}
