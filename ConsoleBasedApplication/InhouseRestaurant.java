import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InhouseRestaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] menuItems = {"Chicken Biryani", "Mutton Biryani", "Pulav", "Chicken Curry", "Mutton fry" , "Fruit Salad" , "Frenchfries"};
        double[] itemPrices = {150.00, 189.00, 128.00, 219.00, 269.00, 50.00, 99.00};
        
        System.out.println("Menu:"); // Display menu items and prices
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i] + " - Rs " + itemPrices[i]);
        }

        List<String> cartItems = new ArrayList<>();
        double totalBill = 0;

        while (true) {   // cart
            System.out.print("Choose an item to add to cart (1-" + menuItems.length + ") or enter 0 to proceed to checkout: ");
            if (scanner.hasNextInt()) {
                int chooseitems = scanner.nextInt();
                scanner.nextLine();
                if (chooseitems == 0) {
                    break;
                } else if (chooseitems >= 1 && chooseitems <= menuItems.length) {
                	
                    cartItems.add(menuItems[chooseitems - 1]);
                    totalBill += itemPrices[chooseitems - 1];
                    System.out.println(menuItems[chooseitems - 1] + " added to cart.");
                    
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        System.out.println("Items in Cart:");
        for (String item : cartItems) {
            System.out.println("- " + item);
        }

        System.out.println("Total Bill: Rs " + totalBill);
        
        double amountPaid;
        while (true) {
            System.out.print("Enter the amount of money: Rs ");
            if (scanner.hasNextDouble()) {
                amountPaid = scanner.nextDouble();
                scanner.nextLine(); 
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        if (amountPaid < totalBill) {
            System.out.println("Insufficient funds. Please provide enough money for the bill.");
        } else {
            
            double change = amountPaid - totalBill;

           
            System.out.println("Thank you for your purchase!");
            System.out.println("Your change is: Rs " + change);
            System.out.println("Revisit the Inhouse again");
        }
        
        scanner.close();
    }
}


