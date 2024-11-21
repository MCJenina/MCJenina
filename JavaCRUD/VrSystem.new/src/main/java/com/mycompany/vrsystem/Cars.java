package com.mycompany.vrsystem; 

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cars extends javax.swing.JFrame {
    private Connection connection;
    
    public Cars() {
        initComponents();
        this.setLocationRelativeTo(null);
         connectDatabase();
        loadCarsTable();
    }

    // Method to connect to the database
        private void connectDatabase() {
    try {
        String url = "jdbc:mysql://localhost:3306/vehiclerentalsystem?useSSL=false&serverTimezone=UTC";
        String user = "admin";  // Replace with your username
        String password = "admin123";  // Replace with your password

        connection = DriverManager.getConnection(url, user, password);
        System.out.println("Database connection successful!");
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to connect to the database: " + e.getMessage());
    }
}

    

    // Method to load data from the cars table into jTable1
    private void loadCarsTable() {
    DefaultTableModel model = (DefaultTableModel) CarsTable.getModel();
    model.setRowCount(0); // Clear existing rows

    String query = "SELECT * FROM cars";  // SQL query to get all car data
    try (Statement stmt = connection.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("car_id"),  // car_id column from the table
                rs.getString("status"),   // status column from the table
                rs.getDouble("price"),    // price column from the table
                rs.getString("car_model"), // car_model column from the table
                rs.getString("car_type")  // car_type column from the table
            });
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error loading car data: " + ex.getMessage());
        ex.printStackTrace();
    }
}
    private void addCarToDatabase(String carId, String status, double price, String carModel, String carType) {
       String query = "INSERT INTO cars (car_id, status, price, car_model, car_type) VALUES (?, ?, ?, ?, ?)";
    
    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        // Set parameters in the SQL query
        pstmt.setString(1, carId);
        pstmt.setString(2, status);
        pstmt.setDouble(3, price);
        pstmt.setString(4, carModel);
        pstmt.setString(5, carType);

        // Execute the insert query
        int rowsAffected = pstmt.executeUpdate();

        // Show success message if a row was inserted
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Car added successfully.");
            loadCarsTable();  // Refresh the table after adding the new car
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add car.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ManageCustomerButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        CarsTable = new javax.swing.JTable();
        ADDbutton = new javax.swing.JButton();
        DELButton = new javax.swing.JButton();
        UPButton = new javax.swing.JButton();
        REFButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CarIdTXT = new javax.swing.JTextField();
        ModelTXT = new javax.swing.JTextField();
        CarPriceTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        StatusCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        CARTypeTXT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(200, 204, 211));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel3.setText("X");

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setText("MANAGE CAR");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        ManageCustomerButton.setBackground(new java.awt.Color(200, 204, 211));
        ManageCustomerButton.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        ManageCustomerButton.setText("MANAGE CUSTOMER");
        ManageCustomerButton.setBorder(null);
        ManageCustomerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ManageCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCustomerButtonActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ManageCustomerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 393, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ManageCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        CarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Car ID", "MODEL", "PRICE", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CarsTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(CarsTable);
        CarsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        ADDbutton.setText("ADD");
        ADDbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDbuttonActionPerformed(evt);
            }
        });

        DELButton.setText("DELETE");
        DELButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELButtonActionPerformed(evt);
            }
        });

        UPButton.setText("UPDATE");
        UPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPButtonActionPerformed(evt);
            }
        });

        REFButton.setText("REFRESH");
        REFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(93, 93, 72));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        CarIdTXT.setText("ID");
        CarIdTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarIdTXTActionPerformed(evt);
            }
        });

        ModelTXT.setText("Car Model");
        ModelTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelTXTActionPerformed(evt);
            }
        });

        CarPriceTXT.setText("Car Price");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Type");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MODEL");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRICE");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("STATUS");

        StatusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AVAILABLE", "NOT AVAILABLE", "UNDER MAINTENANCE" }));
        StatusCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusComboActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");

        CARTypeTXT.setText("Type");
        CARTypeTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARTypeTXTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CarIdTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ModelTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addComponent(CarPriceTXT)
                        .addComponent(StatusCombo, 0, 1, Short.MAX_VALUE)
                        .addComponent(CARTypeTXT)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CarIdTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CARTypeTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(StatusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModelTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CarPriceTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 10)); // NOI18N
        jLabel7.setText("Copyright - BSIT 2101(2024-2025). All Rights Reserved");

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel8.setText("VEHICLE LIST");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ADDbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UPButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DELButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(REFButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel8)
                        .addGap(192, 192, 192))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADDbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DELButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UPButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(REFButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPButtonActionPerformed
        // TODO add your handling code here:
        String carID = CarIdTXT.getText();
        String model = ModelTXT.getText();
        String carType = CARTypeTXT.getText();
        String price = CarPriceTXT.getText();
        String status = (String) StatusCombo.getSelectedItem();

        String query = "UPDATE cars SET Model = ?, CarType = ?, Price = ?, Status = ? WHERE CarID = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, model);
            pstmt.setString(2, carType);
            pstmt.setString(3, price);
            pstmt.setString(4, status);
            pstmt.setString(5, carID);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Car updated successfully.");
                loadCarsTable();  // Refresh the table after updating
            } else {
                JOptionPane.showMessageDialog(this, "Car ID not found.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to update car.");
        }
         
    }//GEN-LAST:event_UPButtonActionPerformed

    private void StatusComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusComboActionPerformed
        // TODO add your handling code here:
        String selectedStatus = (String) StatusCombo.getSelectedItem();

    // Perform actions based on the selected status
    switch (selectedStatus) {
        case "Available":
            JOptionPane.showMessageDialog(this, "The car is marked as available.");
            // Optional: Update other fields or perform additional actions if needed
            break;
        case "Reserved":
            JOptionPane.showMessageDialog(this, "The car is reserved.");
            // Optional: Perform other logic specific to reserved cars
            break;
        case "Out of Service":
            JOptionPane.showMessageDialog(this, "The car is currently out of service.");
            // Optional: Update other fields or inform the admin
            break;
        default:
            // Handle unexpected cases or perform a default action
            JOptionPane.showMessageDialog(this, "Please select a valid status.");
            break;
    }
    }//GEN-LAST:event_StatusComboActionPerformed

    private void ManageCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCustomerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageCustomerButtonActionPerformed

    private void ADDbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDbuttonActionPerformed
        // Retrieve values from text fields
        String carId = CarIdTXT.getText(); // Car ID
        String status = (String) StatusCombo.getSelectedItem(); // Status
        double price = Double.parseDouble(CarPriceTXT.getText()); // Price
        String carModel = ModelTXT.getText(); // Car Model
        String carType = CARTypeTXT.getText(); // Car Type

        // Add the car to the database
        addCarToDatabase(carId, status, price, carModel, carType);

        // Clear the input fields after insertion
        CarIdTXT.setText("");
        StatusCombo.setSelectedIndex(0);
        CarPriceTXT.setText("");
        ModelTXT.setText("");
        CARTypeTXT.setText("");

    

    }//GEN-LAST:event_ADDbuttonActionPerformed

    private void ModelTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelTXTActionPerformed

    private void CarIdTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarIdTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CarIdTXTActionPerformed

    private void DELButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELButtonActionPerformed
        // Retrieve the Car ID from the text field
        // Retrieve the Car ID from the text field
    String carID = CarIdTXT.getText();
    
    // Ensure the Car ID is not empty
    if (carID.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a Car ID.");
        return;
    }

    // SQL query to delete the car with the specified Car ID
    String query = "DELETE FROM cars WHERE car_id = ?";
    
    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
        // Set the Car ID parameter in the SQL query
        pstmt.setString(1, carID);
        
        // Execute the deletion
        int rowsAffected = pstmt.executeUpdate();
        
        // Check if any rows were affected (i.e., if a car was deleted)
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Car deleted successfully.");
            loadCarsTable();  // Refresh the table after deleting
        } else {
            JOptionPane.showMessageDialog(this, "Car ID not found.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Failed to delete car.");
    }
    
    }//GEN-LAST:event_DELButtonActionPerformed

    private void CARTypeTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARTypeTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CARTypeTXTActionPerformed

    private void REFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFButtonActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_REFButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_backButtonActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDbutton;
    private javax.swing.JTextField CARTypeTXT;
    private javax.swing.JTextField CarIdTXT;
    private javax.swing.JTextField CarPriceTXT;
    private javax.swing.JTable CarsTable;
    private javax.swing.JButton DELButton;
    private javax.swing.JButton ManageCustomerButton;
    private javax.swing.JTextField ModelTXT;
    private javax.swing.JButton REFButton;
    private javax.swing.JComboBox<String> StatusCombo;
    private javax.swing.JButton UPButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
