package sets;

import java.util.*;

public class LinkedHashSetStringEx {
    public static void main(String[] args) {
        Set<String> Linkhs = new LinkedHashSet<>();

        Linkhs.add("banana");
        Linkhs.add("apple");
        Linkhs.add("orange");

        System.out.println("LinkedHashSet elements:");
        for (String element : Linkhs) {
            System.out.println(element);
        }
    }
}