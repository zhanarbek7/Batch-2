package day58.staticKeyword;

class Calculator {
    static int add(int a, int b) { // static method
        return a + b;
    }

    static int multiply(int a, int b) { // static method
        return a * b;
    }

    public static void main(String[] args) {
        int sum = Calculator.add(10, 20);
        int product = Calculator.multiply(5, 4);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}


