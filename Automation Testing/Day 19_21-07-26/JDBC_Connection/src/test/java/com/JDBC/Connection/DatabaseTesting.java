package com.JDBC.Connection;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTesting {

    private Connection connection;

    public void establishDatabaseConnection() throws ClassNotFoundException, SQLException {
    	// Database Connection Details
        
    	String url = "jdbc:mysql://localhost:3306/SeleniumAutomation";
        String username = "root";
        String password = "Hardik@123";
        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Connecting to Database");
        connection = DriverManager.getConnection(url, username, password);
        

        
        

        // Check Connection
        if (connection != null) {
            System.out.println("Database Connected Successfully!");
        } else {
            System.out.println("Connection Failed!");
        }
    }

   
}