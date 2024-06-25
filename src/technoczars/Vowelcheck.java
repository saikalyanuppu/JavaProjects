package technoczars;

import java.util.Scanner;

public class Vowelcheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String:" );
		String input = scanner.nextLine().toLowerCase();
		scanner.close();
		
		boolean Vowel=input.matches("[a,e,i,o,u]");
		
		if(Vowel) {
			System.out.println("The string contains vowel");
		}else {
			System.out.println("the string doesnot contain vowel");
		}
		
	}
}
