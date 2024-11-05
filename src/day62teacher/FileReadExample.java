package day62teacher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/day62teacher/example.txt")) {
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.next());
            }
        } catch (IOException e) {
            System.out.println("File could not be read: " + e.getMessage());
        }
    }
}
