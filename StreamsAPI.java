// StreamsAPI.java
// Topic: Introduction to Java Streams API

/*
 * Explanation:
 * This program demonstrates Java Streams API for filtering, mapping, and reducing collections.
 * Streams allow for functional-style operations on collections.
 */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // Filtering even numbers using Streams
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);

        // Mapping numbers to their squares
        List<Integer> squaredNumbers = numbers.stream()
                                              .map(n -> n * n)
                                              .collect(Collectors.toList());

        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
