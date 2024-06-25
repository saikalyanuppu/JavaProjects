package sets;
import java.util.*;

public class TreeSetStringExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("orange");

        System.out.println("TreeSet elements:");
        for (String element : treeSet) {
            System.out.println(element);
        }
    }
}
