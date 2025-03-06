// VariablesAndDataTypes.java
// Topic: Understanding Variables and Data Types in Java

/*
 * Explanation:
 * This program demonstrates the use of different data types in Java, 
 * including primitive types like int, float, char, boolean, and reference types like String.
 */

public class VariablesAndDataTypes {
    public static void main(String[] args) {
        // Primitive data types
        int number = 10;             // Integer data type
        float decimal = 5.5f;        // Floating point data type
        char letter = 'A';           // Character data type
        boolean isJavaFun = true;    // Boolean data type
        
        // Reference data type
        String message = "Hello, Java!";  // String is an object
        
        // Displaying the values of variables
        System.out.println("Integer: " + number);
        System.out.println("Float: " + decimal);
        System.out.println("Character: " + letter);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("String: " + message);
    }
}
