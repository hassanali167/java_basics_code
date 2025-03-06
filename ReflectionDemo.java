// ReflectionDemo.java
// Topic: Java Reflection API

/*
 * Explanation:
 * This program demonstrates the use of Java Reflection to inspect and invoke methods of a class at runtime.
 */

import java.lang.reflect.Method;

class SampleClass {
    public void display() {
        System.out.println("Hello from SampleClass!");
    }
}

public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            // Getting the class object
            Class<?> cls = Class.forName("SampleClass");

            // Creating an instance
            Object obj = cls.getDeclaredConstructor().newInstance();

            // Getting and invoking the method
            Method method = cls.getMethod("display");
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
