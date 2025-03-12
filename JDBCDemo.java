// JDBCDemo.java
// Topic: Connecting Java to MySQL using JDBC

/*
 * Explanation:
 * This program demonstrates how to connect to a MySQL database using JDBC.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "";

        
        try {
            // Establishing connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            // Creating statement
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users"; // Assuming a table named 'users' exists
            ResultSet rs = stmt.executeQuery(query);

            // Fetching data
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // Closing connection
            conn.close();
        } catch (Exception e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}
