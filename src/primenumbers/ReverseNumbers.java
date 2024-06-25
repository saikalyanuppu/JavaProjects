package primenumbers;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}