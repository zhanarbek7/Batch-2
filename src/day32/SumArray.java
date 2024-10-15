package day32;

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,10,11};
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum+=numbers[i];
        }

        System.out.println("Sum = " + sum);
    }
}
