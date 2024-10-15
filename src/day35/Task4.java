package day35;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1,2,4,25,4,99,23,123,7,6,15};
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 4){
                index = i;
            }
        }

        for(int i = index + 1; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


    }
}
