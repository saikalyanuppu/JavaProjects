package multithreading;

public class JoinExample {
    public static void main(String[] args) {
        
    	Thread t1 = new Thread(() -> {
            
    		System.out.println("Thread 1 is running...");
           
    		try {
               
    			Thread.sleep(2000);
          
    		} catch (InterruptedException e) {
                
    			System.out.println(e);
            }
           
    		System.out.println("Thread 1 finished.");
        });

        Thread t2 = new Thread(() -> {
            
        	System.out.println("Thread 2 is running...");
            
        	try {
                
        		
        		Thread.sleep(2000);
            } catch (InterruptedException e) {
              
            	System.out.println(e);
            }
            System.out.println("Thread 2 finished.");
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join(); 
        } catch (InterruptedException e) {
          
        	System.out.println(e);
        }

        System.out.println("All threads finished.");
    }
}

