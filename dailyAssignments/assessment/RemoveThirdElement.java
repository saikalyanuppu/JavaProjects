package assessment;

import java.util.ArrayList;


public class RemoveThirdElement {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(7);
		arr.add(5);
		arr.add(9);
		arr.add(6);
		
		System.out.println("Original ArrayList: " + arr);
		
		
		if(arr.size() >= 3) {
			arr.remove(2);
			System.out.println("Third Element removed successfully");
		}else {
			System.out.println("Arraylist does not contain element");
		}
		System.out.println("After removal, modified list: " + arr);
	}
}
