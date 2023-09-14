package ch11exception.book.sec06;

public class InsufficiException extends Exception {
    public InsufficiException() {
    }

    public InsufficiException(String message) {
        super(message);
    }
}
