package exceptions.unchecked;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int division = 15 / 0; // Attempting to divide by zero, which will throw ArithmeticException
            System.out.println(division); // This line will not be executed due to the exception
        } catch (ArithmeticException e) { // Catching the ArithmeticException if division by zero occurs
            e.printStackTrace(); // Printing the stack trace to help debug where the exception occurred
        } finally {
            // The finally block is always executed, regardless of whether an exception is thrown
            System.out.println("Am terminat executia"); // Printing a message indicating the end of execution
        }
    }
}