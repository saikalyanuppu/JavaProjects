package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MultipleData {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
        String inqry = "INSERT INTO `Records` (`id`, `name`, `value`) VALUES (?, ?, ?)";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver class loaded and register");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root","root");
			System.out.println("connection established");
			pstmt=con.prepareStatement(inqry);
			System.out.println("platform created");
			
			
			pstmt.setInt(1, 1);
			pstmt.setString(2, "Pavan");
			pstmt.setDouble(3, 93.00);
			pstmt.executeUpdate();
			

			pstmt.setInt(1, 2);
			pstmt.setString(2, "Mahesh");
			pstmt.setDouble(3, 89.05);
			pstmt.executeUpdate();
			

			pstmt.setInt(1, 3);
			pstmt.setString(2, "Hemanth");
			pstmt.setDouble(3, 85.00);
			pstmt.executeUpdate();
			
			
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
