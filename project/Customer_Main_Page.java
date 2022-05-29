/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Ruchi Patel
 */
public class Customer_Main_Page extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Main_Page
     * 
     */
    public Customer_Main_Page(String n,String em) {
        initComponents();
        Customer_Name = n;
        Customer_Email = em;
        Heading.setText("Welcome  "+Customer_Name);
        
        setDefaultCloseOperation(Customer_Main_Page.DISPOSE_ON_CLOSE);
        dispose();
        
        try
        {
            Flag = 0;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/se_project?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from cylinder_information ORDER BY Cost");
            DefaultTableModel model = new DefaultTableModel();
            String[] columnName = {"Supplier_Email","Quantity","No_of_Cylinders","Cost"};
            model.setColumnIdentifiers(columnName);
            jTable1.setModel(model);
            
            while(rs.next())
            {
                Flag = 1;
                String Supplier_Email = rs.getString(1);
                int Quantity = rs.getInt(2);
                String No_of_Cylinders = rs.getString(3);
                int Cost = rs.getInt(7);
                
                model.addRow(new Object[]{Supplier_Email,Quantity,No_of_Cylinders,Cost});
            }
            
            if(Flag == 0)
            {
                JOptionPane.showMessageDialog(rootPane," No Data Found ...");
            }
            
            cn.close();
            
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(rootPane, " Error in Viewing Data ...");
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Heading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        City_Textfield = new javax.swing.JTextField();
        Search_by_City = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        High_to_Low = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Low_to_High = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Main Page");

        Heading.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Supplier Email", "Quantity", "No_of_Cylinders", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your Data");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        City_Textfield.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        City_Textfield.setForeground(new java.awt.Color(204, 204, 204));
        City_Textfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        City_Textfield.setText("Enter Your City");
        City_Textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                City_TextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                City_TextfieldFocusLost(evt);
            }
        });
        City_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                City_TextfieldActionPerformed(evt);
            }
        });

        Search_by_City.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Search_by_City.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search.png"))); // NOI18N
        Search_by_City.setText("Search");
        Search_by_City.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_by_CityActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Note : Click On any row for Cylinder information");

        buttonGroup1.add(High_to_Low);
        High_to_Low.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        High_to_Low.setText("Cost : High to Low");
        High_to_Low.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                High_to_LowActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sort Data according to Cost");

        buttonGroup1.add(Low_to_High);
        Low_to_High.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Low_to_High.setText("Cost : Low to High");
        Low_to_High.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Low_to_HighActionPerformed(evt);
            }
        });

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view order.png"))); // NOI18N
        jMenuItem1.setText("View Account");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-male-edit-icon.png"))); // NOI18N
        jMenuItem2.setText("Update Account");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close-2-icon.png"))); // NOI18N
        jMenuItem3.setText("Delete Account");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(null);
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view-icon.png"))); // NOI18N
        jMenu2.setText("View Cart");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view-icon.png"))); // NOI18N
        jMenu3.setText("View Order");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(High_to_Low)
                                .addGap(65, 65, 65)
                                .addComponent(Low_to_High, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(City_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search_by_City, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(City_Textfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_by_City, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(High_to_Low)
                    .addComponent(Low_to_High))
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void City_TextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_City_TextfieldFocusGained
        // TODO add your handling code here:
        if(City_Textfield.getText().equals("Enter Your City"))
        {
            City_Textfield.setText("");
            City_Textfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_City_TextfieldFocusGained

    private void City_TextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_City_TextfieldFocusLost
        // TODO add your handling code here:
         if(City_Textfield.getText().equals(""))
        {
            City_Textfield.setText("Enter Your City");
            City_Textfield.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_City_TextfieldFocusLost

    private void Search_by_CityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_by_CityActionPerformed
        // TODO add your handling code here:
        City = City_Textfield.getText();
        
        if(City.equals("Enter Your City"))
        {
            JOptionPane.showMessageDialog(rootPane," Please Enter City Name First ");
        }
        else
        {
            try
            {
                count = 1;
                Flag = 0;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/se_project?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
                Statement st = cn.createStatement();
                ResultSet rs = null;
                
                if(low_to_high == 1)
                {
                    rs = st.executeQuery("select * from cylinder_information where city = '"+City+"' Order By cost");
                }
                else if(high_to_low == 1)
                {
                    rs = st.executeQuery("select * from cylinder_information where city = '"+City+"' Order By cost DESC");
                }
                else
                {
                    rs = st.executeQuery("select * from cylinder_information where city = '"+City+"'");
                }
                DefaultTableModel model = new DefaultTableModel();
                String[] columnName = {"Supplier_Email","Quantity","No_of_Cylinders","Cost"};
                model.setColumnIdentifiers(columnName);
                jTable1.setModel(model);
            
                while(rs.next())
                {
                    Flag = 1;
                    String Supplier_Email = rs.getString(1);
                    int Quantity = rs.getInt(2);
                    String No_of_Cylinders = rs.getString(3);
                    int Cost = rs.getInt(7);
                
                    model.addRow(new Object[]{Supplier_Email,Quantity,No_of_Cylinders,Cost});
                }
            
                if(Flag == 0)
                {
                    JOptionPane.showMessageDialog(rootPane," No Data Found ...");
                }

                cn.close();   
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, " Error in Viewing Data ...");
            }
        }
    }//GEN-LAST:event_Search_by_CityActionPerformed

    private void High_to_LowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_High_to_LowActionPerformed
        // TODO add your handling code here:
        if(High_to_Low.getModel().isSelected())
        {
            high_to_low = 1;
            low_to_high = 0;
            
            try
            {
                Flag = 0;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/se_project?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
                Statement st = cn.createStatement();
                ResultSet rs = null;
                
                if(count == 1)
                {
                    rs = st.executeQuery("select * from cylinder_information where city = '"+City+"' Order By cost DESC");
                }
                else
                {
                    rs = st.executeQuery("select * from cylinder_information Order By cost DESC");
                }
                DefaultTableModel model = new DefaultTableModel();
                String[] columnName = {"Supplier_Email","Quantity","No_of_Cylinders","Cost"};
                model.setColumnIdentifiers(columnName);
                jTable1.setModel(model);
            
                while(rs.next())
                {
                    Flag = 1;
                    String Supplier_Email = rs.getString(1);
                    int Quantity = rs.getInt(2);
                    String No_of_Cylinders = rs.getString(3);
                    int Cost = rs.getInt(7);
                
                    model.addRow(new Object[]{Supplier_Email,Quantity,No_of_Cylinders,Cost});
                }
            
                if(Flag == 0)
                {
                    JOptionPane.showMessageDialog(rootPane," No Data Found ...");
                }

                cn.close();   
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, " Error in Viewing Data ...");
            }
        }
    }//GEN-LAST:event_High_to_LowActionPerformed

    private void Low_to_HighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Low_to_HighActionPerformed
        // TODO add your handling code here:
        if(Low_to_High.getModel().isSelected())
        {
            high_to_low = 0;
            low_to_high = 1;
            
            try
            {
                Flag = 0;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/se_project?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
                Statement st = cn.createStatement();
                ResultSet rs = null;
                
                if(count == 1)
                {
                    rs = st.executeQuery("select * from cylinder_information where city = '"+City+"' Order By cost");
                }
                else
                {
                    rs = st.executeQuery("select * from cylinder_information Order By cost");
                }
                DefaultTableModel model = new DefaultTableModel();
                String[] columnName = {"Supplier_Email","Quantity","No_of_Cylinders","Cost"};
                model.setColumnIdentifiers(columnName);
                jTable1.setModel(model);
            
                while(rs.next())
                {
                    Flag = 1;
                    String Supplier_Email = rs.getString(1);
                    int Quantity = rs.getInt(2);
                    String No_of_Cylinders = rs.getString(3);
                    int Cost = rs.getInt(7);
                
                    model.addRow(new Object[]{Supplier_Email,Quantity,No_of_Cylinders,Cost});
                }
            
                if(Flag == 0)
                {
                    JOptionPane.showMessageDialog(rootPane," No Data Found ...");
                }

                cn.close();   
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, " Error in Viewing Data ...");
            }
        }
    }//GEN-LAST:event_Low_to_HighActionPerformed

    private void City_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_City_TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_City_TextfieldActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        String Supplier_Email = source.getModel().getValueAt(row,0)+"";
        String Quantity = source.getModel().getValueAt(row, 1)+"";
        View_Cylinder_Details o = new View_Cylinder_Details(Supplier_Email,Quantity,Customer_Email);
        o.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new View_Customer_Account(Customer_Name,Customer_Email).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new Update_Customer_Account(Customer_Name,Customer_Email).setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new Delete_Customer_Account(Customer_Name,Customer_Email).setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        new View_Add_to_Cart(Customer_Email,Customer_Name).setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        new View_order(Customer_Email,Customer_Name).setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

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
            java.util.logging.Logger.getLogger(Customer_Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Main_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Customer_Main_Page().setVisible(true);
            }
        });
    }
    
    private int i;
    private String Customer_Name;
    private String Customer_Email;
    private int low_to_high = 0,high_to_low = 0,count = 0,Flag = 0;
    private String City;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField City_Textfield;
    private javax.swing.JLabel Heading;
    private javax.swing.JRadioButton High_to_Low;
    private javax.swing.JRadioButton Low_to_High;
    private javax.swing.JButton Search_by_City;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
