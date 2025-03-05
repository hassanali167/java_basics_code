// InheritanceDemo.java
// Topic: Understanding Inheritance in Java

/*
 * Explanation:
 * This program demonstrates single inheritance in Java.
 */

class Animal {
    void sound() {
        System.out.println("Animals make sound.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}
