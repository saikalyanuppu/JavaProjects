package technoczars;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String n = scanner.nextLine();
		scanner.close();
		
		String reverse = new StringBuilder(n).reverse().toString();
		
		if(n.equals(reverse)) {
			System.out.println("The string is a palindrome. ");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}

}
