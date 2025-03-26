// EncapsulationDemo.java
// Topic: Understanding Encapsulation in Java

/*
 * Explanation:
 * This program demonstrates encapsulation by using private variables and public getter/setter methods.
 */
class Student {
    private int age;

    // Setter method
    public void setAge(int age) {
        this.age = age;
    }

    
    // Getter method
    public int getAge() {
        return age;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        System.out.println("Student age: " + s.getAge());
    }
}
