package day33;

public class Task4 {
    public static void main(String[] args) {
        String result = "lucky";
        int[] array = {1,3,4,5,6,1,0};
        for(int i = 0; i < array.length; i++){
            if(array[i]==1 && array[i+1]==3){
                result = "unlucky";
            }
        }
        System.out.println(result);
    }
}
