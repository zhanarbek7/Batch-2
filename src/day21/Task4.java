package day21;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the farenheit degrees outside:");
        double temperature = scanner.nextDouble();
        // cold - below 50
        // warm - between 50 and 75 inclusive
        // hot - above 75
        if (temperature < 50){
            System.out.println("It's cold! Wear a coat, sweater, and warm pants.");
        }
        if(temperature >= 50 && temperature <= 75){
            System.out.println("It's warm! Wear a light jacket or long sleeves");
        }
        if(temperature > 75){
            System.out.println("It's hot! Wear a t-shirt and shorts");
        }
    }
}
