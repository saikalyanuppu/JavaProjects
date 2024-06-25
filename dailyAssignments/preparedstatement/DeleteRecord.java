package preparedstatement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteRecord {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        String delQry = "DELETE FROM `Records` WHERE `id` = ?";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver class loaded and registered");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "root");
            System.out.println("Connection established");

            pstmt = con.prepareStatement(delQry);
            System.out.println("Platform created");

            pstmt.setInt(1, 3);  

            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Record deleted successfully. Rows affected: " + rowsAffected);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
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

