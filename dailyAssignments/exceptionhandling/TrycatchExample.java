package exceptionhandling;

public class TrycatchExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
