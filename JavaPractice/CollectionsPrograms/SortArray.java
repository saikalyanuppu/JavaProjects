import java.util.ArrayList;
import java.util.Collections;

public class SortArray {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(3);
		arr.add(7);
		arr.add(1);
		arr.add(9);
		arr.add(2);
		
		System.out.println("Original Arraylist: " + arr);
		
		Collections.sort(arr);
		
		System.out.println("Sorted Arraylist: " + arr);
	}
}
