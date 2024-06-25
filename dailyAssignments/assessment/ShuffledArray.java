package assessment;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffledArray {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		arr.add(9);
		
		System.out.println("Original List: " + arr);
		
		Collections.shuffle(arr);
		
		System.out.println("After shuffling, the updated list: " + arr);
	}
}
