package day35;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {1,45,69,123,9,3532,4};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(max<numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
