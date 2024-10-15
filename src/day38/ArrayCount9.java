package day38;

public class ArrayCount9 {
    public static void main(String[] args) {
        int[] array = {1,2,9,9,1,9};

    }

    public static int arrayCount9(int[] nums){
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 9){
                counter++;
            }
        }
        return counter;
    }
}
