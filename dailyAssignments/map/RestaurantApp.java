package map;

import java.util.Scanner;

public class RestaurantApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ordering = true;
        
        System.out.println("Welcome to Our Restaurant!");
        
        while (ordering) {
            System.out.println("\nMenu:");
            System.out.println("1. Burger - $5.00");
            System.out.println("2. Pizza - $8.00");
            System.out.println("3. Salad - $6.00");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            double totalPrice = 0.0;
            
            switch (choice) {
                case 1:
                    totalPrice += 5.00;
                    System.out.println("You ordered a Burger. Enjoy!");
                    break;
                case 2:
                    totalPrice += 8.00;
                    System.out.println("You ordered a Pizza. Enjoy!");
                    break;
                case 3:
                    totalPrice += 6.00;
                    System.out.println("You ordered a Salad. Enjoy!");
                    break;
                case 4:
                    ordering = false;
                    System.out.println("Thank you for visiting our restaurant!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
            
            if (ordering) {
                System.out.println("Total Price: $" + totalPrice);
                System.out.print("Do you want to order anything else? (yes/no): ");
                String continueOrder = scanner.next().toLowerCase();
                if (!continueOrder.equals("yes")) {
                    ordering = false;
                    System.out.println("Thank you for visiting our restaurant!");
                }
            }
        }
        scanner.close();
    }
}

