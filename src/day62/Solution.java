package day62;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 9;
        fizzBuzz(n);
    }

    public static void fizzBuzz(int n){
        String[] array = new String[n];
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            if(k%3==0 && k%5==0){
                array[i] = "FizzBuzz";
            }
            else if(k % 3 == 0){
                array[i] = "Fizz";
            }
            else if(k % 5 == 0){
                array[i] = "Buzz";
            }
            else {
                array[i] = String.valueOf(k);
            }
            k++;

        }
        System.out.println(Arrays.toString(array));
    }
}
