package sets;
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(6);

        System.out.println("TreeSet elements:");
        for (int element : treeSet) {
            System.out.println(element);
        }
    }
}

