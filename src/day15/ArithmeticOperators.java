package day15;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // +, -, *, /, %
        int a = 100;
        int b = 23;
        System.out.println(a + b + a * b - a * b);
        System.out.println(a - b / b);
        // 100 / 23 = 4 (remainder 8)
        // 100 % 500 = (remainder 100)
        // 500 % 23 = 21 (remainder 17)
        System.out.println(100 % 23);
        System.out.println(100 % 100);
        System.out.println(5 % 2);
        System.out.println(5 * a % b);
    }
}
