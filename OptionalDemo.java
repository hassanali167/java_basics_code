// OptionalDemo.java
// Topic: Using Optional in Java to Avoid NullPointerException

/*
 * Explanation:
 * This program demonstrates how to use the Optional class to handle null values safely.
 */


import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        // Creating an Optional object
        Optional<String> optionalValue = Optional.ofNullable(null);

        // Checking if value is present and providing a default
        String result = optionalValue.orElse("Default Value");
        System.out.println("Result: " + result);

        // Using Optional with lambda
        optionalValue.ifPresent(value -> System.out.println("Value: " + value));
    }
}
