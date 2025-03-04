// GenericsDemo.java
// Topic: Understanding Generics in Java

/*
 * Explanation:
 * This program demonstrates the use of generics to create a type-safe class.
 * Generics allow the definition of classes and methods with type parameters.
 */

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        // Using generics with Integer
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("Integer Value: " + intBox.getValue());

        // Using generics with String
        Box<String> strBox = new Box<>();
        strBox.setValue("Hello, Generics!");
        System.out.println("String Value: " + strBox.getValue());
    }
}
