package multicatch;

public class MultiCatchExample1 {
    public static void main(String[] args) {
        try {
 
            String str = "Kalyan";
            System.out.println(str.length()); 
            int[] arr = new int[5];
            System.out.println(arr[10]); 
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
        	
            System.out.println("Exception caught: " + e);
        }
    }
}

