package sets;
import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 2, 9, 1, 5, 2, 4, 7, 8};
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : arr) {
            uniqueSet.add(num);
        }
        
        System.out.println("Unique elements in the array:");
        for (int element : uniqueSet) {
            System.out.println(element);
        }
    }
}
