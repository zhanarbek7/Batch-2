package day57.accessModifiers;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.defaultNumber);
        System.out.println(a.protectNumber);
        System.out.println(a.publicNumber);
        a.someMethod();
    }
}
