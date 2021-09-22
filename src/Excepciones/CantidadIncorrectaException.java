package Excepciones;

public class CantidadIncorrectaException extends Exception {
    public CantidadIncorrectaException() {
    }

    public CantidadIncorrectaException(String message) {
        super(message);
    }

    public CantidadIncorrectaException(String message, Throwable cause) {
        super(message, cause);
    }

    public CantidadIncorrectaException(Throwable cause) {
        super(cause);
    }

    public CantidadIncorrectaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
