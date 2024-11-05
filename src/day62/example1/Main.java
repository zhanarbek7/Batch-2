package day62.example1;

import day40.Car;
import day48.Dog;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        try{
            // Unchecked exception
            int a = 10, b = 0;
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("a can't be divided by 0");
        }

        try{
            Car car = new Car();
            // Unchecked exception
            System.out.println(car.model.length());
        }
        catch (NullPointerException e){
            System.out.println("model property is not initialized");
        }

            // Checked exception might be thrown
        try {
            FileReader fileReader = new FileReader("output.txt");
        } catch (FileNotFoundException e) {

        }

        readFile("output1.txt");

    }

    public static void readFile(String filePath) throws FileNotFoundException{
        FileReader fileReader = new FileReader(filePath);
    }

}
