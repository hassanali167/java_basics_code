// ConstructorsDemo.java
// Topic: Understanding Constructors in Java

/*
 * Explanation:
 * This program demonstrates the use of constructors in Java.
 */

class Person {
    String name;

    // Constructor
    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        person1.display();
    }
}
