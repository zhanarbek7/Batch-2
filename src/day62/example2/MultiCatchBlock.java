package day62.example2;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try{
            String text = null;
            // Possible NullPointerException
            System.out.println(text.length());

            // Possible NumberFormatException
            int num = Integer.parseInt("abc");
            System.out.println("Hello World!");
        }
        catch(NullPointerException | NumberFormatException e){
            System.out.println("Exception is detected");
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
}
