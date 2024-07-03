package exceptions.unchecked;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] array = new int[5]; // Creating an array of integers with a size of 5

        try {
            array[7] = 3; // Attempting to access the 8th element (index 7) of the array, which does not exist
            //System.out.println(array[0]); // This line is commented out and will not be executed
        } catch (ArrayIndexOutOfBoundsException e) { // Catching the ArrayIndexOutOfBoundsException if an invalid index is accessed
            e.printStackTrace(); // Printing the stack trace to help debug where the exception occurred
        }
    }
}