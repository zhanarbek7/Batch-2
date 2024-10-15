package day35;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String sentence = "Laptop,Semicolon,Screen,Bottle";
        String[] words = sentence.split(",");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);
    }
}
