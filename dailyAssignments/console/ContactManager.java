package console;

import java.sql.*;
import java.util.Scanner;

public class ContactManager {
    private static final Scanner scanner = new Scanner(System.in);

    public static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        String sql = "INSERT INTO contacts (name, phone_number) VALUES (?, ?)";

        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, phoneNumber);
            pstmt.executeUpdate();
            System.out.println("Contact added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void Contactlist() {
        String sql = "SELECT * FROM contacts";
        try (Connection conn = DatabaseUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ". " + rs.getString("name") + " - " + rs.getString("phone_number"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

