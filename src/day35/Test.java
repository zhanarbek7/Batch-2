package day35;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String word1 = "heart";
        String word2 = "earth";
        char[] charArray1 = word1.toCharArray();
        // [h,e,a,r,t]
        char[] charArray2 = word2.toCharArray();
        // [e,a,r,t,h]
        Arrays.sort(charArray1); // [a,e,h,r,t]
        Arrays.sort(charArray2); // [a,e,h,r,h]
        if(Arrays.equals(charArray1, charArray2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not anagrams");
        }




    }
}
