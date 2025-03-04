// ExceptionHandlingDemo.java
// Topic: Exception Handling in Java

/*
 * Explanation:
 * This program demonstrates the use of try, catch, and finally blocks 
 * to handle exceptions.
 */

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int num = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
