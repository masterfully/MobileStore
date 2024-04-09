package mobilestore;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectToSQLServer {
    public static void main(String[] args) {
        var server = "DaoThanhTu\\SQLEXPRESS";
        var user = "sa";
        var password = "123";
        var db = "MobileStore";
        var port = 1433;
        
        // Create a SQLServerDataSource object
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        ds.setTrustServerCertificate(true);
        // Attempt to establish a connection
        try (Connection conn = ds.getConnection()) {
            System.out.println("Connected to SQL Server successfully!");
            System.out.println("Connected to database: " + conn.getCatalog());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
