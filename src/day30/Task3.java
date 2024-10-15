package day30;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(1,10);
        System.out.println("Secret number is created! : " + secretNumber);
        int jackpot = 10000;
        for(int i = 1; i <= 5; i++){
            System.out.print("Enter a number, attempt " + i + " : ");
            int number = scanner.nextInt();
            if(number == secretNumber){
                System.out.println("You won " + jackpot +"$!");
                break;
            }
            else {
                jackpot/=2;
                System.out.println("Try again!");
            }
        }
    }
}
