package map;

import java.util.HashMap;
import java.util.Map;

public class Products {
    public static void main(String[] args) {
        Map<String, Integer> things = new HashMap<>();
        
        things.put("Soap", 2);
        things.put("Powder", 6);
        things.put("Room Freshners", 10);

        System.out.println("Soap rack num " + things.get("Soap"));

        System.out.println("Highly sale Products in the shop:");
        for (Map.Entry<String, Integer> entry : things.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
