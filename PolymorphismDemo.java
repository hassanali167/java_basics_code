// PolymorphismDemo.java
// Topic: Understanding Polymorphism in Java

/*
 * Explanation:
 * This program demonstrates method overloading and overriding.
 */

class MathOperations {
    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        MathOperations mo = new MathOperations();
        System.out.println("Sum: " + mo.add(5, 10));
        System.out.println("Sum: " + mo.add(5, 10, 15));

        Animal a = new Cat();
        a.sound(); // Method Overriding
    }
}
