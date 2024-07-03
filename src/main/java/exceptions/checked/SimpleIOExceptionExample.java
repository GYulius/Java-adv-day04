package exceptions.checked;

import java.io.*;

public class SimpleIOExceptionExample {
    public static void main(String[] args) {
        File file = new File("bunaseara.txt"); // Creating a File object for the file "bunaseara.txt"

        try {
            FileReader fr = new FileReader(file); // Attempting to create a FileReader object to read the file
            int currentChar; // Variable to store the current character read from the file

            // Reading the file character by character until the end of the file is reached
            while ((currentChar = fr.read()) != -1) {
                System.out.print((char)currentChar); // Printing the current character to the console
            }
        } catch (IOException e) { // Catching any IOException that might occur during file reading
            e.printStackTrace(); // Printing the stack trace to help debug where the exception occurred
        }
    }
}