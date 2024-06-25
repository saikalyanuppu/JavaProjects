package assessment;
import java.util.Arrays;

public class UpdateArray {
	public static void main(String[] args){
		int[] array = {1, 2, 3, 4, 5};
		
		int indexupdate = 2;
		int newValue = 10;
		
		if(indexupdate < 0 && indexupdate >= array.length) {
			System.out.println("Invalid index provide");
			return;
		}
	
	array[indexupdate] = newValue;
	System.out.println("Updated array: " + Arrays.toString(array));
  }
}
