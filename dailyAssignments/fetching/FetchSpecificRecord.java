package fetching;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchSpecificRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/School"; 
        String user = "root"; 
        String password = "root"; 
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);

            int tgId = 1; 
            String sql = "SELECT * FROM Records WHERE id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, tgId);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double value = rs.getDouble("value");

                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.println(", Percentage: " + value);
            } else {
                System.out.println("No record found with ID: " + tgId);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (pstmt != null) pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
