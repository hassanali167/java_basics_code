import java.util.Scanner; // Import Scanner for user input

public class UserInputDemo {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Taking floating-point input
        System.out.print("Enter a number to double: ");
        double number = scanner.nextDouble();

        // Processing input
        double doubledNumber = number * 2;

        // Displaying the output
        System.out.println("\nHello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your number doubled is: " + doubledNumber);

        // Closing the scanner
        scanner.close();
    }
}

