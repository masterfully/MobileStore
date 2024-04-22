package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class JDBCUtil {
	public static Connection getConnection()  {
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
			String dbUrl = "jdbc:sqlserver://localhost:1433;DatabaseName=MobileStore;encrypt=true;trustServerCertificate=true";
		    String username = "sa";
		    String password = "123";
            con = DriverManager.getConnection(dbUrl, username, password);
            System.out.println("Connection established successfully.");
            
        } catch (ClassNotFoundException e) {
        	JOptionPane.showMessageDialog(null, "Không thể kết nối đến cơ sở dữ liệu !", "Lỗi", JOptionPane.ERROR_MESSAGE);
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
