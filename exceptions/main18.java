import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main18 {
    public static void main(String[] args) {
        // JDBC URL to an invalid database
        String url = "jdbc:mysql://localhost:3306/nonexistent_db"; // Example for MySQL
        String user = "invalid_user"; // Invalid username
        String password = "invalid_password"; // Invalid password

        try {
            // Attempt to establish a database connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully.");
        } catch (SQLException e) {
            // Catch the SQLException and print a message
            System.out.println("SQLException caught: " + e.getMessage());
            // Optionally, you can print the error code and SQL state
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("SQL State: " + e.getSQLState());
        }

        // Inform the user that the program has completed
        System.out.println("Program completed.");
    }
}

