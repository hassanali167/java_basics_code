// ArraysDemo.java
// Topic: Understanding Arrays in Java

/*
 * Explanation:
 * This program demonstrates the use of arrays by storing and displaying a set of integers.
 */
public class ArraysDemo {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Display array elements using a for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
