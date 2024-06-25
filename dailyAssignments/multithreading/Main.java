package multithreading;

public class Main {

    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        Thread thread = new Thread(t1); 
        thread.start(); 
    }

}
