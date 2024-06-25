package multithreading;

public class ThreadExam {
    public static void main(String[] args) {
        
        Thread thread = new Thread(new RunnableEx());

        thread.setPriority(Thread.MAX_PRIORITY);

        int priority = thread.getPriority();
        System.out.println("Thread Priority: " + priority);

        thread.setName("kalyan");

        String name = thread.getName();
        System.out.println("Thread Name: " + name);

        thread.start();
    }
}