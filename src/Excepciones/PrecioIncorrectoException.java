package Excepciones;

public class PrecioIncorrectoException  extends  Exception{
    public PrecioIncorrectoException() {
    }

    public PrecioIncorrectoException(String message) {
        super(message);
    }

    public PrecioIncorrectoException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrecioIncorrectoException(Throwable cause) {
        super(cause);
    }

    public PrecioIncorrectoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
