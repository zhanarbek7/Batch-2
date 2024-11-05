package day62.example3;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
            try{
                String text = null;
                System.out.println(text.length());

                int[] numbers = {1, 2, 3};
                // Possible ArrayIndexOutOfBoundsException and ArithmeticException
                int result = numbers[3] / 0;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index is out of bounds");
            }
            catch(Exception e){
                System.out.println("Exception is detected");
                System.out.println(e.getClass().getSimpleName());
                System.out.println(e.getMessage());
            }




    }
}
