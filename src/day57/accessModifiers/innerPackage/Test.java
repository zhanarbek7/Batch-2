package day57.accessModifiers.innerPackage;

import day57.accessModifiers.A;

public class Test extends A{
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.publicNumber);

        Test test = new Test();
        System.out.println(test.protectNumber);
    }
}
