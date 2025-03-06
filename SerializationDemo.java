// SerializationDemo.java
// Topic: Serialization and Deserialization in Java

/*
 * Explanation:
 * This program demonstrates how to serialize (save) and deserialize (load) an object using Java's ObjectOutputStream and ObjectInputStream.
 */

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        String filename = "person.ser";

        // Serialization: Saving object to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            Person p = new Person("Alice", 30);
            out.writeObject(p);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Serialization failed.");
        }

        // Deserialization: Loading object from a file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Person p = (Person) in.readObject();
            System.out.println("Object deserialized successfully.");
            p.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization failed.");
        }
    }
}
