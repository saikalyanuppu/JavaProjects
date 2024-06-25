package map;

import java.util.Map;
import java.util.TreeMap;

public class AnimalZoo {
    public static void main(String[] args) {
        Map<Integer, String> animals = new TreeMap<>();

        animals.put(25, "Tiger");
        animals.put(28, "Elephant");
        animals.put(22, "kangaroo");

        System.out.println("Animal in cell 28 - " + animals.get(28));

        System.out.println("Animals in Zoo park: ");
        for (Map.Entry<Integer, String> entry : animals.entrySet()) {
            System.out.println("Cell : " + entry.getKey() + ", " + "Animal: " +  entry.getValue());
        }
        	System.out.println(animals.size());
    }
}

