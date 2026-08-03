package jdbcapp.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

    private static final String url = "jdbc:postgresql://localhost:5432/scbmy2024";
    private static final String user = "postgres";
    private static final String password = "password";
    
    // Static method which returns object of Connection type
    public static Connection getDBConnection() {
        Connection conn = null;

        try {

             // Create DB Connection Object
            conn = DriverManager.getConnection(url, user,password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }

}
