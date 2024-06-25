package sets;
import java.util.*;

public class IterExample {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        li.add("apple");
        li.add("banana");
        li.add("orange");

        Iterator<String> ir = li.iterator();

        while (ir.hasNext()) {
            String element = ir.next();
            System.out.println(element);
        }
    }
}

