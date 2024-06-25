package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqlexample {
    public static void main(String[] args) {
        Connection connection = null;
        try {

            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "username";
            String password = "password";
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
        	
            System.out.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
