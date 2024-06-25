package multithreading;

public class RunnableEx implements Runnable {
   
	@Override
    public void run() {
        
        Thread currentThread = Thread.currentThread();

        String name = currentThread.getName();
        System.out.println("Current Thread Name: " + name);

        currentThread.setName("Saikalyan");

        String updatedName = currentThread.getName();
        System.out.println("Updated Thread Name: " + updatedName);
    }
}


