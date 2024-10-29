package day57.accessModifiers;

public class A {
    int defaultNumber;
    public int publicNumber;
    private int privateNumber;
    protected int protectNumber;

    public void someMethod(){
        System.out.println(privateNumber);
    }
}
