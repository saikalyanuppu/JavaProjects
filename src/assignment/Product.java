package assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Map;

public class Product {
    public static void main(String[] args) {
        Map<Integer, String> indMap = new HashMap<>();

        indMap.put(7, "Dhoni");
        indMap.put(8, "Virat");
        indMap.put(10, "Rohit");
        
        System.out.println("Iterating map using entrySet():");
        Set<Entry<Integer, String>> set = indMap.entrySet();
        for (Entry<Integer, String> entry : set) {
        	Integer key = entry.getKey();
        	String value = entry.getValue();
        	System.out.println(key + " = " +" " + value);
        }
        System.out.println("Iterating map using keySet():");
        Set<Integer> s = indMap.keySet();
        for (Integer i:s) {
        	System.out.println("Key =" +" " + i);
        }
        System.out.println("Iterating map using values():");
        Collection<String> c = indMap.values();
        for (String s1:c) {
        	System.out.println("value =" +" " + s1);
        }

    }      
        
}
