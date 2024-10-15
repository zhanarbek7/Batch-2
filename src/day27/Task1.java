package day27;

public class Task1 {
    public static void main(String[] args) {
//        6)
//* Declare an int number = 1234;
//* Display each digit in separate lines
//        Output:
//        4
//        3
//        2
//        1


        int number = 17423;
        int sum = 0;
        while(number>0){
            sum+=number%10;
            number=number/10;
            System.out.println(sum);
        }



    }
}
