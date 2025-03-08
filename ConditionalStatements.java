// ConditionalStatements.java
// Topic: Using Conditional Statements in Java

/*
 * Explanation:
 * Demonstrates the use of if-else and switch statements for decision-making.
 */

public class ConditionalStatements {
    public static void main(String[] args) {
        int number = 10;
        
        // if-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
        
        // switch statement
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }
}
