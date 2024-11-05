package day62.customException;

public class Main {
    public static void main(String[] args) {
        try{
            throw new InvalidEmailException("Email is invalid");
        }
        catch (InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }
}
