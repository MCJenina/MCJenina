/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

//NOTE: KUNG DI KA NAKA AUTO-IMPORT , IMPORT MO MUNA LAHAT NG TO NO?
import controller.DBConnections;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yKnows
 */
public class UserInfo extends javax.swing.JFrame {

    //STEP # 1. CREATE AN OBJECT VARIABLE OF THE CLASS CONNECTION, MAKE SURE NASA LABAS SYA NG LAHAT NG METHOD PARA MAGING ACCESSIBLE SYA SA IBANG METHOD, WAG SAKIM OKAY? NAKA- PRIVATE NAMAN YAN
    private Connection connection ;
    /**
     * Creates new form UserInfo
     */
    public UserInfo() {
        initComponents();
    // STEP # 2 CONNECT THE JFRAME FROM TO THE DATABASE, REMEMBER THE DBConnection THAT WE HAD MADE A WHILE AGO, WE NEED TO CREATE AN OBJECT FROM IT SO WE CAN CALL ITS METHODS.
        DBConnections dbConnect = DBConnections.getDBConnection(); //ONCE YOU WRITE THIS, THE CONNECTION MUST BE ALREADY ESTABLISHED
        connection = dbConnect.getConnection(); // NOW ASSIGN THE VARIABLE dbConnect AND CALL THE METHOD getConnection(), ACTUALLY ITS NO LONGER NECESSARY BECAUSE WE ALREADY DID IT ON THE CODE ABOVE
                                                // KAYA LANG SIGURISTA TAYO, PARA SURE NA NAKA-CONNECT, MAHIRAP MAWALAN NG CONNECTION BAKA MAGKALABUAN HALA SIGE KA
        
        
        //STEP #  6- PANGHULI AKO HA WAG ATAT BALIKAN MO KO MAMAYA - CONTINUED, YAN BUTI BINALIKAN MO PA, PANGWAKAS NATO, DI KASI LALABAS YUNG DATA SA TABLE DI MO TATAWAGING ANG MTHOD NA setTableInfo() sa constructor, yan tapos na, dont forget to subscribe to yknows1991 yung pinaka pogi sa lahat ng tutorial na makikita mo sa YT. no jokes yan, walang sira ang keyboard ko ha!!
        setTableInfo();
        setNames();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        names = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel1.setText("Firstname: ");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel2.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel4.setText("Lastname: ");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jLabel5.setText("Contact:");

        txtFname.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N

        txtLname.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N

        txtContact.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFname)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContact))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        infoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Email", "Adddress", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(infoTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Add Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        names.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(109, 109, 109)
                        .addComponent(names, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(names, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//NOTE: SIGURADUHIN MONG NAKA GAWA KANA NG DATABASE NA TULAD ANG FIELDS NA NASA TABLE MO OKAY? I ENSURE PATI AND DATA TYPE HA!  AT NASELECT ANG BUTTON NA GAGANAP SA GUSTO MONG OPERATION, LIKE "ADD RECORD"  
//STEP #3 SINCE CONNECTED NA ANG DATABASE NATIN, IT'S NOW TIME TO GET THE INPUTS FROM OUR TEXT FIELD AND ASSIGN THEM TO THE VARIABLES NA IPAPASA NATIN MAMAYA SA VALUE NG SQL STATEMENTS NATIN.
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fname = txtFname.getText();//GETTEXT LANG ANG METHOD NA GAMIT NATIN NA METHOD PAG STRING ANG DATA TYPE, SO PAANO PAG NUMBER??
        String lname = txtLname.getText(); // 
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String contact = txtContact.getText();
        //int age = Integer.parseInt(txtContact.getText()); ITO NAMAN PAG NUMBER ANG GAMIT MO, USE DATA PARSING MUNA BAGO MAG GETTEXT() METHOD OKIE?
       
        //STEP#4 CREATE AN SQL STATEMENT BY USING THE STATEMENT CLASS FROM SQL PACKAGE
        try {
            Statement stmt= connection.createStatement(); // CREATE AN SQL OBJECT, THEN ASSIGN THE CONNECTION VARIABLE  connection na ginawa natin kanina sa step 1, THEN CALL createStatement method()
            //PAG ADD DATA OPERATION SA DATABASE ANG GAMIT NATIN, execute() METHOD LANG GAMIT NATIN, PERO PAG SELECT OPERATION NAMAN  executeQuery  NAMAN GAGAMITIN, PAG UPDATE  executeQuery() naman 
            stmt.execute("INSERT INTO person (`fname`, `lname`, `email`, `address`, `contact`) VALUES ('"+fname+"', '"+lname+"', '"+email+"', '"+address+"', '"+contact+"')"); // DITO IPASA SA LOOB NG PARENTHESIS NG VALUES YUNG MGA VARIABLES NA MAY VALUE GALING SA TEXTBOX
            JOptionPane.showMessageDialog(this, "Record successfully added");
            
            
            clearInputs();//JUMP TO STEP #5
                    
                   
        } // TRY AND CATCH ULIT ALAM NYO NA KUNG BAKIT
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
        DefaultTableModel model = (DefaultTableModel)infoTable.getModel();
        model.setRowCount(0);
        setTableInfo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void namesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namesActionPerformed
        setNames();
    }//GEN-LAST:event_namesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
    }//GEN-LAST:event_jButton3ActionPerformed
    
    //STEP #5 WALA NAMAN TONG MASYADONG GANAP PARANG YUNG KA GRUPO MO, ALL IT DOES IS TO EMPTY THE TEXTFIELDS AFTER YOU ADD DATA TO YOUR DATABASE, ARAT NA SA NEXT STEP
    public void clearInputs(){
             txtFname.setText("");
            txtLname.setText("");
            txtEmail.setText("");
            txtAddress.setText("");
            txtContact.setText("");
    }
    
    //STEP #6 DISPLAYING THE DATA FROM YOUR DATABASE TO YOUR JTABLE
    //CREATE A VOID METHOD BELOW
    private void setTableInfo(){
        try {// THIS TRY AND CATCH WILL DETERMINE THE VALUES BEING PASSED TO THE JTABLE
            int row = 0;// VARIABLE TO HOLD THE ROW ITEMS
            int rowIndex = 0; //SINCE THE ITEMS IN THE TABLE IS IN ARRAY FORMAT SO WE NEED THE INDEX
                    
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PERSON");// SELECT QUERY TO, PWEDE NAMAN TO IMODIFY BASTA KAYO NA BAHALA, OPPS NGA PALA WE USE THE RESULTSET CLASS HERE, PARA MAGAMIT NATIN MGA METHODS NYA LIKE next(), getString()
            
            //THIS BLOCK IDENTIFIES IF THE THE ROW NEXT TO A RECORD HAVE VALUES
            if(rs.next()){
                  rs.last();
                  row = rs.getRow();
                  rs.beforeFirst();
            }
            String [][] data = new String [row][5]; // YAN 2 DIMENSIONAL ARRAY, OMG, SO WHAT IT ONLY DOES IS TO RETRIEVE DATA FRON THE DATABASE, YOU CAN CADD FOR LOOPS IF YOU WANT TO GUYS. EXPERIMENT NAMAN KAYO MAYA MAYA TAPOS NA TO
            while (rs.next()) {
                   data[rowIndex][0]=rs.getString(1);
                   data[rowIndex][1]=rs.getString(2);
                   data[rowIndex][2]=rs.getString(3);
                   data[rowIndex][3]=rs.getString(4);
                   data[rowIndex][4]=rs.getString(5);
                   rowIndex++;   
            }
            //AFTER THIS WHILE LOOP
            String[] columns = {"First name", "Lastname", "Email","Address", "Contact"}; //ACTUALLY PWEDE NAMAN TO GAWIN DUN SA PROPERTIES, OPTION LANG TONG COLUMN HEADERS
            DefaultTableModel tmodel = new DefaultTableModel(data, columns); // COLUMN HEADERS LANG TO
            infoTable.setModel(tmodel);
        }
            catch (Exception e) {
        }
    
    }
    private void setNames(){
        Connection con = null;
         Statement st = null;
         ResultSet rs=null;
     try{
     
        st = con.createStatement();
      String s = "select Contact from users";
      rs = st.executeQuery(s);
        while(rs.next())
        {
            names.addItem(rs.getString(1)+" === "+rs.getString(2));
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "ERROR");
    }finally{
        try{
            st.close();
            rs.close();
            con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR CLOSE");
        }
    }
     
     
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //JUST MAKING SURE NA CONNECTED TALAGA ANG DATABASE NYO, MAHIRAP NA MAWALAN NG CONNECTION PARA MAGHANAP NG IBA
        new DBConnections();
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
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable infoTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox names;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    // End of variables declaration//GEN-END:variables
}
