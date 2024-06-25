package assignment;

import java.util.Map;
import java.util.HashMap;

public class MapExample {
	public static void main(String[] args) {
	Map<Integer, String> class1 = new HashMap<>();
	class1.put(1, "Ashish");
	class1.put(2, "Keshav");
	class1.put(3, "Aarthi");
	
	Map<Integer, String> class2 = new HashMap<>();
	class2.put(10, "Ajay");
	class2.put(12, "Kalyan");
	class2.put(15, "Anusha");
	
	Map<Integer, String> studyclass = new HashMap<>();
	studyclass.putAll(class1);
	studyclass.putAll(class2);
	System.out.println(studyclass.size());
	System.out.println(studyclass.isEmpty());
	studyclass.remove(12);
	System.out.println(studyclass.containsKey(3));
	System.out.println(studyclass.containsValue("Keshav"));
	System.out.println(studyclass.get(10));
	System.out.println(studyclass.size());
	}
}
