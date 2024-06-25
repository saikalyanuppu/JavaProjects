package technoczars;

import java.util.Scanner;

public class Swaptwonumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first = sc.nextInt();
		System.out.println("Enter the second number: ");
		int second = sc.nextInt();
		sc.close();
		
		System.out.println("Before swap one: " + first + " two: " + second);
		
		first = first + second;
		second= first - second; // These without using third variable, swapping numbers
		first = first - second;
		
		System.out.println("After swap one: " + first + " two: " + second);
	}
}
