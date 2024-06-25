package driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecordExample {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        
        String updateQry = "UPDATE students SET percentage = 90.00 WHERE student_number = 1";
        
        try {
 
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Class loaded and Registered");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "root");
            System.out.println("Connection Established");

            stmt = con.createStatement();
            System.out.println("Platform Created");

            stmt.executeUpdate(updateQry);
            System.out.println("data Updated successfully");
            
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


