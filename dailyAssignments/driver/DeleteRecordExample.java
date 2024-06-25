package driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecordExample {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;

        String deleteQry = "DELETE FROM students WHERE student_number = 4";
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Class loaded and Registered");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "root");
            System.out.println("Connection Established");
            
            stmt = con.createStatement();
            System.out.println("Platform Created");

            stmt.executeUpdate(deleteQry);
            System.out.println("Deleted data successfully");
            
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

