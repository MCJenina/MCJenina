package com.mycompany.vrsystem;

 //@author baldo
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class FillUpFromClass {
    private String pickupDate;
    private String returnDate;
    private String destination;
    private String paymentMethod;
    private double additionalFees;
    private String status;
    private int car_Id;
    private String car_name;
    
    // Constructor
    public FillUpFromClass(String pickupDate, String returnDate, String destination, String paymentMethod, double additionalFees, String status, int car_Id, String car_name) {
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.destination = destination;
        this.paymentMethod = paymentMethod;
        this.additionalFees = additionalFees;
        this.status = status;
        this.car_Id = car_Id;
        this.car_name = car_name;
    }
    public void saveToDatabase() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/reservations";
        String username = "root";
        String password = "";

        String sql = "INSERT INTO reservations (pickup_date, return_date, destination, payment_method, " +
                     "additional_fees, status, car_id, car_name) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, this.pickupDate);
            stmt.setString(2, this.returnDate);
            stmt.setString(3, this.destination);
            stmt.setString(4, this.paymentMethod);
            stmt.setDouble(5, this.additionalFees);
            stmt.setString(6, this.status);
            stmt.setInt(7, this.car_Id);
            stmt.setString(8, this.car_name);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Form submitted successfully!");
            }
        }   
    }
}
