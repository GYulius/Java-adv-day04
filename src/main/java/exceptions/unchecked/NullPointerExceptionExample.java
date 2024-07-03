package exceptions.unchecked;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null; // Initializing a String variable with null value

        try {
            System.out.println(str.length()); // Attempting to call the length() method on a null object, which will throw a NullPointerException
        } catch (NullPointerException e) { // Catching the NullPointerException if it occurs
            System.out.println("Caught NullPointerException where str is null"); // Printing a custom message indicating that the exception was caught
            e.printStackTrace(); // Printing the stack trace to help debug where the exception occurred
        }
    }
}