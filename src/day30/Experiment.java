package day30;

public class Experiment {


    public static void main(String[] args) {
        String word = "laptop123water5429912game";
        for(int i = 0; i<word.length(); i++){
            System.out.println(Character.isLetter(word.charAt(i)));
        }
        System.out.println();
    }
}
