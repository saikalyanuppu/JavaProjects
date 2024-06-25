package map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> sMap = new HashMap<>();

        sMap.put(11, "kalyan");
        sMap.put(12, "srikanth");
        sMap.put(13, "pavan");
        System.out.println("Name of student with ID 12: " + sMap.get(12));

        int idCheck = 11;
        if (sMap.containsKey(idCheck)) {
            System.out.println("Student with ID " + idCheck + " exists.");
        } else {
            System.out.println("Student with ID " + idCheck + " does not exist.");
        }

        sMap.remove(11);
        System.out.println("All students:");
        
        for (Map.Entry<Integer, String> entry : sMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
