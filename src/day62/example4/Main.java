package day62.example4;

public class Main {
    public static void main(String[] args) {
        System.out.println(ageVerified(59));
    }

    public static String ageVerified(int age){
        try{
            if (age > 18) {
                return "adult";
            } else {
                return "teen";
            }
        }
        finally {
            System.out.println("Hello from finally block");
        }
    }
}
