package day62.customException;

public class InvalidPasswordException extends Exception{

    public InvalidPasswordException(String message) {
        super(message);
    }
}
