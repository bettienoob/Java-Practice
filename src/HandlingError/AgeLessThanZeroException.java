package HandlingError;

public class AgeLessThanZeroException extends IllegalArgumentException{
    public AgeLessThanZeroException(){}

    public AgeLessThanZeroException(String message){
        super(message);
    }

    public AgeLessThanZeroException(String message, Throwable cause){
        super(message, cause);
    }
}
