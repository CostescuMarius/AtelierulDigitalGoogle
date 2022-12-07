package exceptions.calculator;

public class FatalException extends RuntimeException{
    public FatalException() {
        super("Fatal Exception");
    }
}
