//program to demonstrage addiction and delection of elements in dequee . 2, write a program to compare 2 hash set
import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements to the rear
        deque.addLast("Apple");
        deque.addLast("Banana");
        deque.addLast("Cherry");

        // Adding elements to the front
        deque.addFirst("Grapes");
        deque.addFirst("Orange");

        System.out.println("Deque contents: " + deque);

        // Removing elements from the front
        String removedFront = deque.removeFirst();
        System.out.println("Removed from front: " + removedFront);

        // Removing elements from the rear
        String removedRear = deque.removeLast();
        System.out.println("Removed from rear: " + removedRear);

        System.out.println("Updated deque: " + deque);
    }
}

/*
import java.util.HashSet;

public class HashSetComparison {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Red");
        set1.add("Green");
        set1.add("Black");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Red");
        set2.add("Pink");
        set2.add("Black");

        for (String element : set1) {
            System.out.println(set2.contains(element) ? "Yes" : "No");
        }
    }
}




comment

A HashSet in Java is a collection that implements the Set interface and offers a quick way to store distinct elements. Let’s explore the key points about Java HashSet:

Storage Mechanism:
A HashSet constructs a collection using a hash table for storing elements.
It stores and retrieves items based on their hash codes.
The hash table provides constant-time performance for basic operations.
Characteristics:
HashSet contains unique elements only (no duplicates).
It allows null values.
The class is non-synchronized, meaning it is not thread-safe.
Elements are not maintained in insertion order; they are inserted based on their hashcodes.
Initial Default Capacity and Load Factor:
The initial default capacity of a HashSet is 16.
The load factor (a measure of how full the hash table is allowed to get) is 0.75.
Common Methods:
add(E e): Adds the specified element to the set if it’s not already present.
remove(Object o): Removes the specified element from the set if it’s present.
contains(Object o): Checks if the set contains the specified element.
size(): Returns the number of elements in the set.
…and more!
Example Usage:

*/
