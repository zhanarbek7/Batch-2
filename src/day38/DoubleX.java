package day38;

public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("aaaax"));
    }
//    Given a string, return true if the first instance of "x" in the
//    string is immediately followed by another "x".
//    doubleX("axxbb") → true
//    doubleX("axaxax") → false
//    doubleX("xxxxx") → true

    // aaaax
    public static boolean doubleX(String str){
        boolean result = false;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == 'x'){
                if(str.charAt(i+1) == 'x'){
                    result = true;
                }
                break;
            }
        }
        return result;
    }
}
