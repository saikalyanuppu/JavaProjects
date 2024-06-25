package multithreading;

public class SleepEx {
    public static void main(String[] args) {
        
    	System.out.println("Thread is sleeping...");
        
    	try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
           
        	System.out.println(e);
        }
        
    	System.out.println("Thread woke up!");
    }
}

