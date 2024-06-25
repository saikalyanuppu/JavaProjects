package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Students {
    public static void main(String[] args) {
        Map<Integer, String> lHMap = new LinkedHashMap<>();

        lHMap.put(2, "karthik");
        lHMap.put(8, "Kishore");
        lHMap.put(6, "Vivek");

        System.out.println("student name: " + lHMap.get(8));
        System.out.println(lHMap.size());
        System.out.println(lHMap.containsKey(6));

        System.out.println("Students in the class:");
        for (Map.Entry<Integer, String> entry : lHMap.entrySet()) {
            System.out.println("student roll number: " + entry.getKey() + ", " + "name: " +  entry.getValue());
        }
            System.out.println("Key-Value pairs: "+lHMap.entrySet());
    }  
}

