package day35;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,1,1,4,4,4};
        int count1 = 0, count4 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                count1++;
            }
            else if(array[i] == 4){
                count4++;
            }
        }
        if(count1>count4){
            System.out.println("HI");
        }
        else if(count1<count4){
            System.out.println("BYE");
        }
        else{
            System.out.println("OK");
        }

    }
}
