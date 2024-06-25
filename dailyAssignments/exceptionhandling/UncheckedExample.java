package exceptionhandling;

public class UncheckedExample {
    public static void main(String[] args) {
        String str = "Hi";
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
