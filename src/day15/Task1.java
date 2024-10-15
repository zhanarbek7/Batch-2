package day15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mon = scanner.nextDouble();
        double tue = scanner.nextDouble();
        double wed = scanner.nextDouble();
        double thu = scanner.nextDouble();
        double fri = scanner.nextDouble();
        double sat = scanner.nextDouble();
        double sun = scanner.nextDouble();
        double average = (mon+tue+wed+thu+fri+ sat + sun)/7;
        System.out.println("( " + mon + " + " + tue + " + " + wed + " + " + thu
        + " + " + fri + " + " + sat + " + " + sun + " ) / 7 = " + average);
    }
}
