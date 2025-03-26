// LambdaExpressionDemo.java
// Topic: Using Lambda Expressions in Java

/*
 * Explanation:
 * This program demonstrates lambda expressions for functional programming.
 */

 
import java.util.ArrayList;
public class LambdaExpressionDemo {
    public static void main(String[] args) {
        // Using a lambda expression to print a list of numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        
        System.out.println("Using Lambda Expression:");
        numbers.forEach(n -> System.out.println(n));
    }
}
