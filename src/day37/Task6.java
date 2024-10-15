package day37;

public class Task6 {
    public static void main(String[] args) {
        countVowels1("laptop");
    }

    public static void countVowels1(String word){
        int counter = 0;
        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'A'
            || ch == 'i' || ch == 'I'
            || ch == 'o' || ch == 'O'
            || ch == 'u' || ch == 'U'
            || ch == 'e' || ch == 'E'){
                counter++;
            }
        }
        System.out.println("There are " + counter + " vowels");
    }



}
