package config;

import java.sql.Connection;
import java.sql.SQLException;

public class testDB {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Get connection
            connection = JDBCUtil.getConnection();

            if (connection != null) {
                System.out.println("Connection successful!");
                // Now you can perform any database operations using this connection
                // For example, you can execute SQL queries here
            } else {
                System.out.println("Failed to establish connection.");
            }
        } finally {
            // Close connection
            JDBCUtil.closeConnection(connection);
        }
    }
}
