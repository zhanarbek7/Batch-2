package test;

public class Test {
    public static void main(String[] args) {
        String str = "abckayakgoogracecarabc";
        findLP(str);
    }

    public static void findLP(String str){
        String p = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length()+1; j++){
                String sub = str.substring(i,j);
                System.out.println(sub);
            }
        }
        System.out.println(p);
    }

    public static boolean isPalindrome(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse+=str.charAt(i);
        }
        return reverse.equals(str);
    }
}
