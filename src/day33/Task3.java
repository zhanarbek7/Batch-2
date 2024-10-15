package day33;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,2,3,6,100};
        for(int i = 0; i < array.length; i++){
            if(array[i]==2 && array[i+1] == 3){
                array[i+1] = 99;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
