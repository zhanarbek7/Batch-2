package day30;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print("Random numbers: ");

        int sum1 =0;
        int sum2 =0;
        int sum3 =0;
        for(int i = 1; i <= 10; i++){
            int a = random.nextInt(1,100);
            System.out.print(a + " ");
            sum1+=a;
            if (a % 5== 0) {
                sum2 += a;
            }
            else if(a % 2 == 0){
                sum3 += a;
            }
        }
        System.out.println("\nSum is: " + sum1);
        System.out.println("Sum of numbers divisible by 5 is " + sum2);
        System.out.println("Sum of numbers divisible by 2 is " + sum3);

    }
}
