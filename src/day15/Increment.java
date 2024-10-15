package day15;

public class Increment {

    public static void main(String[] args) {
        // ++ Increment
        // a++ will increase the value of a by 1
        int a = 50;
        System.out.println(a); // a = 50
//      a = a + 1; is equal to a++;
        a++; // a = 51
        a+=5; // a = 51 + 5
        a+=29; // a = 56 + 29
        a*=2; // a = a * 2
        a/=10; // a = a / 10
        a-=7; // a = a - 7
        System.out.println(a);

        // Output
        // 50
        // 56

    }

}
