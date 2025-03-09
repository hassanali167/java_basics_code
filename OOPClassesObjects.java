// OOPClassesObjects.java
// Topic: Classes and Objects in Java

/*
 * Explanation:
 * This program defines a class `Car` and creates objects of it to demonstrate object-oriented programming.
 */


class Car {
    String brand;
    
    // Constructor
    Car(String brand) {
        this.brand = brand;
    }
    
    // Method to display car brand
    void display() {
        System.out.println("Car brand: " + brand);
    }
}

public class OOPClassesObjects {
    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1 = new Car("Toyota");
        car1.display();
    }
}
