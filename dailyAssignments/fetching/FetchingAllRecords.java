package fetching;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingAllRecords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/School"; 
        String user = "root"; 
        String password = "root";

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            con = DriverManager.getConnection(url, user, password);

            stmt = con.createStatement();
            String sql = "SELECT * FROM Records";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double value = rs.getDouble("value");

                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.println(", Percentage: " + value);
            }
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		} finally {
        	
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

