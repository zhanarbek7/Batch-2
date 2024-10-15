package day28;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(random.nextInt(1,100));
        }
    }
}
