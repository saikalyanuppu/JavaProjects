package sets;
import java.util.*;

public class SetInterfaceExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple"); 
        System.out.println("fruits available:");
        
        for (String fruitbunches : fruits) {
            System.out.println(fruitbunches);
        }
    }
}
