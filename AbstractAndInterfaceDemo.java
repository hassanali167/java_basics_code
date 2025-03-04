// AbstractAndInterfaceDemo.java
// Topic: Understanding Abstract Classes and Interfaces in Java

/*
 * Explanation:
 * This program demonstrates the use of an abstract class and an interface.
 * Abstract classes can have both abstract and concrete methods.
 * Interfaces contain only abstract methods (before Java 8).
 */

abstract class Animal {
    abstract void makeSound(); // Abstract method

    void sleep() {
        System.out.println("Sleeping...");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}

public class AbstractAndInterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.sleep();
        d.play();
    }
}
