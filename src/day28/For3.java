package day28;

public class For3 {
    public static void main(String[] args) {
        String word = "Java";
        for(int i = 0; i < word.length()-2; i++){
            System.out.println("Character at index " + i + " = " + word.charAt(i));
        }
    }
}
