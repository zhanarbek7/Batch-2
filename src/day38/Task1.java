package day38;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        double[] numbers = {1, 28, 3, 4};
        average(numbers);
    }

    public static void average(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("The average = "+ sum/array.length);
    }


}
