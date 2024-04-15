import java.util.Scanner;

public class MetroTicketingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stations = {"Secunderabad", "Madhura Nagar", "Kukatpally", "Punjagutta", "Dilsukhnagar"};
        double[] ticketPrices = {30, 25, 45, 10, 55};

        System.out.println("Available Stations:");
        for (int i = 0; i < stations.length; i++) {
            System.out.println((i + 1) + ". " + stations[i] + " - Rs " + ticketPrices[i]);
        }

        int j;   //From Station
        while (true) {
            System.out.print("Choose your starting station (1-" + stations.length + "): ");
            if (scanner.hasNextInt()) {
                j = scanner.nextInt();
                scanner.nextLine();
                if (j >= 1 && j <= stations.length) {
                    break;
                } else {
                    System.out.println("Invalid station choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        int k;  //To Station
        while (true) {
            System.out.print("Choose your destination station (1-" + stations.length + "): ");
            if (scanner.hasNextInt()) {
                k = scanner.nextInt();
                scanner.nextLine();
                if (k >= 1 && k <= stations.length && k != j) {
                    break;
                } else {
                    System.out.println("Invalid station choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        double ticketPrice = Math.abs(ticketPrices[j - 1] - ticketPrices[k - 1]);
        System.out.println("Ticket price: Rs " + ticketPrice);

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

        if (amountPaid < ticketPrice) {
            System.out.println("Insufficient funds. Please provide enough money for the ticket.");
        } else {
            double change = amountPaid - ticketPrice;
            System.out.println("Ticket purchased, Thank you for using the Metro Services. ");
            System.out.println("Your change is: Rs " + change);
        }
        scanner.close();
    }
}
