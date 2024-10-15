package day21;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your command: ");
        String command = scanner.nextLine();

        if (command.equals("turn off")) {
            System.out.println("TV is turned off");
        }
        else if (command.equals("turn on")) {
            System.out.println("TV is turned on");
        }
        else if (command.equals("volume up")) {
            System.out.println("Now volume is up");
        }
        else if (command.equals("volume down")) {
            System.out.println("Now volume is down");
        }
        else if (command.equals("settings")) {
            System.out.println("Now you're in the setting menu");
        }
        else {
            System.out.println("YOU PRESSED WRONG BUTTON!!!");
        }
    }
}
