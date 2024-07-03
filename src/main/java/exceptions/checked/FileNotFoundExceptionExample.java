package exceptions.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        File file = new File("bunaseara.txt"); // Creating a File object for the file "bunaseara.txt"

        try {
            FileReader fr = new FileReader(file); // Attempting to create a FileReader object to read the file
        } catch (FileNotFoundException e) { // Catching the FileNotFoundException if the file does not exist
            e.printStackTrace(); // Printing the stack trace to help debug where the exception occurred
        }

    }
}