package day37;

public class Task4 {
    public static void main(String[] args) {
        int sum = displayNumbers(5);
        System.out.println("The sum of numbers from 1 to " + 8 + " = " + sum);
    }

    public static int displayNumbers(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum+=i;
        }
        return sum;
    }
}
