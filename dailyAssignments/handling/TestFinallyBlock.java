package handling;

import java.util.Scanner;

public class TestFinallyBlock {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter dividend: ");
            int dividend = scanner.nextInt();
            System.out.print("Enter divisor: ");
            int divisor = scanner.nextInt();

            int result = dividend / divisor;
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
 
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
 
            System.out.println("Finally block is always executed");

            scanner.close();
        }

        System.out.println("The value got executed");
    }
}
