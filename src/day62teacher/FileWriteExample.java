package day62teacher;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, world!");
        } catch (IOException e) {
            System.out.println("Failed to write to file: " + e.getMessage());
        }
    }
}