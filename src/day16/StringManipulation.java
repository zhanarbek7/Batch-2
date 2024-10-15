package day16;

public class StringManipulation {
    public static void main(String[] args) {
        String word = "Programming is a language!";
        System.out.println(word.length());
        System.out.println(word.charAt(5));
        System.out.println(word.substring(1));
        System.out.println(word.substring(0,11));
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        System.out.println(word.trim());
        System.out.println(word.replace("m","?"));
        System.out.println(word.replace("a","hello"));
        String student1 = "Zuck", student2 = "zuck";
        System.out.println(student1.equals(student2));
        System.out.println(student1.equalsIgnoreCase(student2));
        System.out.println(word.contains("ly"));
        String str = "Thank you for your chocolate!";
        System.out.println(str.charAt(7)); //
        System.out.println(str.substring(6,9));
        System.out.println(str.substring(0,6));
        System.out.println(str.indexOf("you"));



    }
}
