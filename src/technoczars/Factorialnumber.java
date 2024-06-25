package technoczars;

import java.util.Scanner;

public class Factorialnumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scanner.nextInt();
		scanner.close();
		
		int factorialnumber = 1;
		
		for(int i=1; i<=n; i++) {
			factorialnumber *= i;
		}
		
		System.out.println("factorial of " + n + " is: " + factorialnumber);
	}
}
