// MethodsDemo.java
// Topic: Defining and Calling Methods in Java

/*
 * Explanation:
 * This program demonstrates the use of methods in Java by defining a method 
 * that adds two numbers and returns the result.
 */

public class MethodsDemo {
    // Method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the method and displaying the result
        int sum = addNumbers(10, 5);
        System.out.println("Sum: " + sum);
    }
}
