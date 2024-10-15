package day20;

import java.util.Scanner;

public class MultipleConditions {
    public static void main(String[] args) {
        // If it is Tuesday and your amount is more than 200
        // you get a discount 10% discount
        //
        Scanner scanner = new Scanner(System.in);
        String day = "tuesday";
        double amountToPay = 158;
        if(day.equals("tuesday") && amountToPay > 120){
            double dAmount = amountToPay - amountToPay * 0.1;
            System.out.println("Amount to pay after dicount: " + dAmount);
        }
        else{
            System.out.println("No discount: " + amountToPay);
        }
    }
}
