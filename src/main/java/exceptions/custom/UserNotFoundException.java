package exceptions.custom;

public class UserNotFoundException extends Exception { // Custom exception class extending Exception

    // Constructor accepting a message parameter
    public UserNotFoundException(String message) {
        super(message); // Calling the superclass (Exception) constructor with the message
    }
}