// OperatorsDemo.java
// Topic: Demonstrating Various Operators in Java

/*
 * Explanation:
 * This code demonstrates the usage of arithmetic, relational, logical, 
 * and assignment operators in Java.
 */

 public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        
        // Relational Operators
        System.out.println("a is greater than b: " + (a > b));
        
        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y));
        
        // Assignment Operator
        int c = a + b;
        System.out.println("Assigned value: " + c);
    }
}
