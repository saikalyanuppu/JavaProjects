package exceptionhandling;
import java.util.Scanner;

public class Testhrow {
    public static void validate(int age) {
        if (age < 18) {
        	
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
        	
            System.out.println("Person is eligible to vote!!");
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        try {
            validate(age);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Thank you");
    }
}
 