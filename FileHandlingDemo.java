// FileHandlingDemo.java
// Topic: Reading and Writing Files in Java

/*
 * Explanation:
 * This program demonstrates how to write and read a file using 
 * FileWriter and FileReader in Java.
 */

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        String filename = "sample.txt";
        
        // Writing to a file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a test file.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
        }

        // Reading from a file
        try (FileReader reader = new FileReader(filename)) {
            int ch;
            System.out.println("Reading file contents:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
