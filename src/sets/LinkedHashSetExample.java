package sets;
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(1);
        linkedHashSet.add(7);
        linkedHashSet.add(5);

        System.out.println("LinkedHashSet elements:");
        
        for (int num : linkedHashSet) {
            System.out.println(num);
        }
    }
}