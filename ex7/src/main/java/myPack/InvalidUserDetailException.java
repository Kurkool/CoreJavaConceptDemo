package myPack;

public class InvalidUserDetailException extends Exception {
    private static final long serialVersionUID = 1L;
    public InvalidUserDetailException(String message) {
        super(message);
    }
}
