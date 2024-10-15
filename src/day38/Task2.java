package day38;

public class Task2 {
    public static void main(String[] args) {

        // {"Mahabat", "Ziada", "Temirlan", "Jolchubek", "Ulan"} -> Jolchubek
        // {"Mahabat", "Ziada"} -> Mahabat


        String[] names = {"Mahabat", "Ziada", "Temirlan", "Jolchubek", "Ulan"};
        System.out.println(longestString(names));
    }

    public static String longestString(String[] names){
        String longest = "";
        for (int i = 0; i < names.length; i++) {
            if(names[i].length() > longest.length()){
                longest = names[i];
            }
        }
        return longest;
    }
}
