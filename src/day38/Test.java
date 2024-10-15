package day38;

public class Test {
    public static void main(String[] args) {
        System.out.println(sumDouble(10,10));
    }

    public static int sumDouble(int a, int b) {
        if(a==b){
            return (a+b) * 2;
        }
        else{
            return a + b;
        }
    }


}
