package config;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCUtil {
	public static Connection getConnection() {
		Connection con = null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url = "jdbc:mysql://localhost:3306/mobilestore"; // Corrected URL
			String username = "root";
			String password = "";
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established successfully.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}


	public static void closeConnection(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
}
