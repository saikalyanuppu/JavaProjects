package console;

import java.util.Scanner;

public class PhoneApplication {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Contact List");
            System.out.println("3. Dial");
            System.out.println("4. Call Logs");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    ContactManager.addContact();
                    break;
                case 2:
                    ContactManager.Contactlist();
                    break;
                case 3:
                    CallManager.Dial();
                    break;
                case 4:
                    CallManager.CallLogs();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
