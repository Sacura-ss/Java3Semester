package ForMe;

public class BadFileNameException extends Exception{
    public BadFileNameException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
