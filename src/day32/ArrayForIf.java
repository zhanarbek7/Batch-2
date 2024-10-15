package day32;

public class ArrayForIf {
    public static void main(String[] args) {
        int[] numbers = {1,22,3,122,5};
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]>10){
                System.out.println("Greater than 10");
            }
        }
    }
}
