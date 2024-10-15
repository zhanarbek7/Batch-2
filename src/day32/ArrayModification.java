package day32;

public class ArrayModification {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        numbers[0] = 25;

        numbers[numbers.length-1] = 99;

        int firstElement = numbers[0];
        int element = numbers[numbers.length-1];
        System.out.println(firstElement);
        System.out.println(element);


    }
}
