package console;

import java.sql.*;
import java.util.Scanner;

public class CallManager {
    private static final Scanner scanner = new Scanner(System.in);

    public static void Dial() {
        System.out.print("Enter name of the contact to call: ");
        String contactName = scanner.nextLine();

        String sqlSelect = "SELECT id FROM contacts WHERE name = ?";
        String sqlInsert = "INSERT INTO call_logs (contact_id) VALUES (?)";

        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect);
             PreparedStatement pstmtInsert = conn.prepareStatement(sqlInsert)) {

            pstmtSelect.setString(1, contactName);
            ResultSet rs = pstmtSelect.executeQuery();

            if (rs.next()) {
                int contactId = rs.getInt("id");

                pstmtInsert.setInt(1, contactId);
                int rowsAffected = pstmtInsert.executeUpdate(); 

                if (rowsAffected > 0) {
                    System.out.println("Call logged successfully.");
                } else {
                    System.out.println("Failed to log the call.");
                }
            } else {
                System.out.println("Contact not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }


    public static void CallLogs() {
        String sql = "SELECT c.name, c.phone_number, l.call_time " +
                     "FROM call_logs l " +
                     "JOIN contacts c ON l.contact_id = c.id";

        try (Connection conn = DatabaseUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("Called " + rs.getString("name") + " (" + rs.getString("phone_number") + ") at " + rs.getTimestamp("call_time"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

