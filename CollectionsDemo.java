// CollectionsDemo.java
// Topic: Java Collections Framework - ArrayList, HashSet, and HashMap

/*
 * Explanation:
 * This program demonstrates the use of ArrayList, HashSet, and HashMap in Java.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionsDemo {
    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList: " + list);

        // HashSet example (No duplicates allowed)
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate element
        System.out.println("HashSet: " + set);

        // HashMap example (Key-Value pairs)
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("HashMap: " + map);
    }
}
