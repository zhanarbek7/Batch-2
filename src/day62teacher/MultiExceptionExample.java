package day62teacher;

public class MultiExceptionExample {
    public static void main(String[] args) {
        try {
            String text = null;
            // Possible NullPointerException
            System.out.println(text.length());
            // Possible NumberFormatException
            int num = Integer.parseInt("abc");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

