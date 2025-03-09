// LoopsDemo.java
// Topic: Demonstrating Loops in Java

/*
 * Explanation:
 * This program demonstrates the usage of for, while, and do-while loops in Java.
 */


public class LoopsDemo {
    public static void main(String[] args) {
        // For loop: Prints numbers from 1 to 5
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While loop: Prints numbers from 1 to 5
        System.out.println("While loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // Do-while loop: Prints numbers from 1 to 5
        System.out.println("Do-While loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}
