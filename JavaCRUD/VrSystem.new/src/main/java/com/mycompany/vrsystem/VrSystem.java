package com.mycompany.vrsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VrSystem {

    // Database connection method
    public static Connection conn() {
        try {
            // Ensure your database URL, username, and password are correct
            String url = "jdbc:mysql://localhost:3306/vehiclerentalsystem?useSSL=false&serverTimezone=UTC";
            String user = "admin";   // Your MySQL username
            String password = "admin123";  // Your MySQL password

            // Register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection to the database
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace to the console for debugging
            return null;
        }
    }

    public static void main(String[] args) {
        
            LogIn loginForm = new LogIn(); // Create an instance of the LogIn form
            loginForm.setVisible(true); // Show the login form
            
        
    }
}
