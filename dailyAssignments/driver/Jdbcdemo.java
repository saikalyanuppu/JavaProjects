package driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcdemo {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        
        String qry = "INSERT INTO students (student_number, student_name, percentage) VALUES (1, 'Mahesh', 85.00)";
        String qry1 = "INSERT INTO students (student_number, student_name, percentage) VALUES (2, 'Pavan', 93.00)";
        String qry2 = "INSERT INTO students (student_number, student_name, percentage) VALUES (3, 'Kalyan', 96.00)";
        String qry3 = "INSERT INTO students (student_number, student_name, percentage) VALUES (4, 'Hemanth', 88.00)";

        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Class loaded and Registered");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "root");
            System.out.println("Connection Established");

            stmt = con.createStatement();
            System.out.println("Platform Created");
 

            stmt.executeUpdate(qry);
            stmt.executeUpdate(qry1);
            stmt.executeUpdate(qry2);
            stmt.executeUpdate(qry3);
            
            System.out.println("Data inserted successfully");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {

            if(stmt != null) {
                try {
                    stmt.close();
                } catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

