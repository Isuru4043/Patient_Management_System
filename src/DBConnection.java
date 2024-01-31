import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/hospital";
    private static final String USER = "root";
    private static final String PASSWORD = "80589915";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void closeConnection(Connection connection) throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
    
}
