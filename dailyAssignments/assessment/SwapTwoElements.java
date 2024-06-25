package assessment;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		System.out.println("Given List: " + arr);
		
		int index1 = 2;
		int index2 = 3;
		
		if(index1 < 0 && index1 >= arr.size() && index2 < 0 && index2 >=arr.size()){
			System.out.println("Invalid");
		}else {
			Collections.swap(arr, index1, index2);
			System.out.println("Elements at index" + index1 + "and" + index2 + "Swaped");
		}
		System.out.println("after modification: " + arr);
	}
}
