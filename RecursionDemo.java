// RecursionDemo.java
// Topic: Understanding Recursion in Java

/*
 * Explanation:
 * This program demonstrates recursion by calculating the factorial of a number.
 */

public class RecursionDemo {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}
