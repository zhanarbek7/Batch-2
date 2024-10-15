package day42.task2;

public class Smartphone {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Apple", "IPhone 16 pro");
        smartphone.openInstagram();
        smartphone.openWhatsapp();
        smartphone.openYoutube();
        smartphone.charge();
        smartphone.charge();
    }

    String brand;
    String model;
    int batteryPercentage;

    public Smartphone(String brand, String model){
        this.brand = brand;
        this.model = model;
        this.batteryPercentage = 100;
    }

    public void openInstagram(){
        batteryPercentage-=20;
        System.out.println("Opened Instagram, battery percentage = " + batteryPercentage);
    }
    public void openYoutube(){
        batteryPercentage-=30;
        System.out.println("Opened Youtube, battery percentage = " + batteryPercentage);
    }
    public void openWhatsapp(){
        batteryPercentage-=10;
        System.out.println("Opened Whatsapp, battery percentage = " + batteryPercentage);
    }

    public void charge(){
        batteryPercentage+=15;
        System.out.println("Charged, battery percentage = " + batteryPercentage);
    }




}
