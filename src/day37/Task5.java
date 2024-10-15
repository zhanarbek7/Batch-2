package day37;

public class Task5 {
    public static void main(String[] args) {
        String word  = "laptop";
    }
    public static boolean isPalindrome(String word){
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverse+=word.charAt(i);
        }
        return word.equals(reverse);
    }
}
