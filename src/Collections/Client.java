package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Client {
    public static void main(String[] args) {
        // Set - HashSet, LinkedHashSet, TreeSet
        // It doesn't allow duplicate elements
        // Unordered Random ordered - Uses HashMap
        Set<Integer> set1 = new HashSet<>();
        // Ordered - Insertion order
        // LinkedList + HashMap
        Set<Integer> set2 = new LinkedHashSet<>();
        // Ordered - Natural order - Reverse using comparator/comparable
        // Balanced BinaryTree - Red Black Tree
        Set<Integer> set3 = new TreeSet<>();

        set1.add(19);
        set1.add(10);
        set1.add(21);
        set1.add(5);
        set1.add(15);

        set2.add(19);
        set2.add(10);
        set2.add(21);
        set2.add(5);
        set2.add(15);

        set3.add(19);
        set3.add(10);
        set3.add(21);
        set3.add(5);
        set3.add(15);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        // HashMaps work exactly the same - The key being the decisive element in ordering
        
    }
}

// Break till :8:30
