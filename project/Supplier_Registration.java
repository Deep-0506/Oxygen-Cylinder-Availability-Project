/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.sql.*;
import java.awt.HeadlessException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruchi Patel
 */
public class Supplier_Registration extends javax.swing.JFrame {

    /**
     * Creates new form Supplier_Registration
     */
    public Supplier_Registration() {
        initComponents();
        setDefaultCloseOperation(Supplier_Registration.DISPOSE_ON_CLOSE);
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        LUsername = new javax.swing.JLabel();
        UserName_Textfield = new javax.swing.JTextField();
        LPassword = new javax.swing.JLabel();
        Password_Textfield = new javax.swing.JTextField();
        LConfirm_Password = new javax.swing.JLabel();
        Confirm_Password_Textfield = new javax.swing.JTextField();
        Lemail = new javax.swing.JLabel();
        Email_Textfield = new javax.swing.JTextField();
        Lcity = new javax.swing.JLabel();
        City_Textfield = new javax.swing.JTextField();
        Lpincode = new javax.swing.JLabel();
        Pincode_Textfield = new javax.swing.JTextField();
        LContact_no = new javax.swing.JLabel();
        Contact_No_Textfield = new javax.swing.JTextField();
        Register = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supplier Registration");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Supplier Registration");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        LUsername.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LUsername.setText("Username:");

        UserName_Textfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        UserName_Textfield.setForeground(new java.awt.Color(204, 204, 204));
        UserName_Textfield.setText("Enter Username");
        UserName_Textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UserName_TextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UserName_TextfieldFocusLost(evt);
            }
        });
        UserName_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserName_TextfieldActionPerformed(evt);
            }
        });

        LPassword.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LPassword.setText("Password:");

        Password_Textfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Password_Textfield.setForeground(new java.awt.Color(204, 204, 204));
        Password_Textfield.setText("Enter Password");
        Password_Textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Password_TextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Password_TextfieldFocusLost(evt);
            }
        });
        Password_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Password_TextfieldActionPerformed(evt);
            }
        });

        LConfirm_Password.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LConfirm_Password.setText("Confirm Password:");

        Confirm_Password_Textfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Confirm_Password_Textfield.setForeground(new java.awt.Color(204, 204, 204));
        Confirm_Password_Textfield.setText("Enter Confirm Password");
        Confirm_Password_Textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Confirm_Password_TextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Confirm_Password_TextfieldFocusLost(evt);
            }
        });
        Confirm_Password_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_Password_TextfieldActionPerformed(evt);
            }
        });

        Lemail.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Lemail.setText("Email:");

        Email_Textfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Email_Textfield.setForeground(new java.awt.Color(204, 204, 204));
        Email_Textfield.setText("Enter Email");
        Email_Textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Email_TextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Email_TextfieldFocusLost(evt);
            }
        });
        Email_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_TextfieldActionPerformed(evt);
            }
        });

        Lcity.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Lcity.setText("City:");

        City_Textfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        City_Textfield.setForeground(new java.awt.Color(204, 204, 204));
        City_Textfield.setText("Enter City");
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

        Lpincode.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Lpincode.setText("Pincode:");

        Pincode_Textfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Pincode_Textfield.setForeground(new java.awt.Color(204, 204, 204));
        Pincode_Textfield.setText("Enter Pincode");
        Pincode_Textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Pincode_TextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Pincode_TextfieldFocusLost(evt);
            }
        });
        Pincode_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pincode_TextfieldActionPerformed(evt);
            }
        });

        LContact_no.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LContact_no.setText("Contact No:");

        Contact_No_Textfield.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Contact_No_Textfield.setForeground(new java.awt.Color(204, 204, 204));
        Contact_No_Textfield.setText("Enter Contact_No");
        Contact_No_Textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Contact_No_TextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Contact_No_TextfieldFocusLost(evt);
            }
        });
        Contact_No_Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contact_No_TextfieldActionPerformed(evt);
            }
        });

        Register.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Register1.png"))); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset2.png"))); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LUsername)
                        .addGap(107, 107, 107)
                        .addComponent(UserName_Textfield)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LContact_no)
                            .addComponent(Lpincode)
                            .addComponent(Lcity)
                            .addComponent(Lemail)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LConfirm_Password, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LPassword)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Register)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Contact_No_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addComponent(Pincode_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addComponent(City_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addComponent(Email_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addComponent(Confirm_Password_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addComponent(Password_Textfield))
                        .addContainerGap(48, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserName_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(LPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirm_Password_Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LConfirm_Password))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(Lemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(City_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(Lcity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pincode_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(Lpincode))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LContact_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Contact_No_Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Register, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserName_TextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserName_TextfieldFocusGained
        // TODO add your handling code here:
        if(UserName_Textfield.getText().equals("Enter Username"))
        {
            UserName_Textfield.setText("");
            UserName_Textfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_UserName_TextfieldFocusGained

    private void UserName_TextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UserName_TextfieldFocusLost
        // TODO add your handling code here:
        if(UserName_Textfield.getText().equals(""))
        {
            UserName_Textfield.setText("Enter Username");
            UserName_Textfield.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_UserName_TextfieldFocusLost

    private void UserName_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserName_TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserName_TextfieldActionPerformed

    private void Password_TextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Password_TextfieldFocusGained
        // TODO add your handling code here:
        if(Password_Textfield.getText().equals("Enter Password"))
        {
            Password_Textfield.setText("");
            Password_Textfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_Password_TextfieldFocusGained

    private void Password_TextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Password_TextfieldFocusLost
        // TODO add your handling code here:
        if(Password_Textfield.getText().equals(""))
        {
            Password_Textfield.setText("Enter Password");
            Password_Textfield.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Password_TextfieldFocusLost

    private void Password_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Password_TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Password_TextfieldActionPerformed

    private void Confirm_Password_TextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Confirm_Password_TextfieldFocusGained
        // TODO add your handling code here:
        if(Confirm_Password_Textfield.getText().equals("Enter Confirm Password"))
        {
            Confirm_Password_Textfield.setText("");
            Confirm_Password_Textfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_Confirm_Password_TextfieldFocusGained

    private void Confirm_Password_TextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Confirm_Password_TextfieldFocusLost
        // TODO add your handling code here:
        if(Confirm_Password_Textfield.getText().equals(""))
        {
            Confirm_Password_Textfield.setText("Enter Confirm Password");
            Confirm_Password_Textfield.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Confirm_Password_TextfieldFocusLost

    private void Confirm_Password_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_Password_TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Confirm_Password_TextfieldActionPerformed

    private void Email_TextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Email_TextfieldFocusGained
        // TODO add your handling code here:
        if(Email_Textfield.getText().equals("Enter Email"))
        {
            Email_Textfield.setText("");
            Email_Textfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_Email_TextfieldFocusGained

    private void Email_TextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Email_TextfieldFocusLost
        // TODO add your handling code here:
        if(Email_Textfield.getText().equals(""))
        {
            Email_Textfield.setText("Enter Email");
            Email_Textfield.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Email_TextfieldFocusLost

    private void Email_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_TextfieldActionPerformed

    private void City_TextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_City_TextfieldFocusGained
        // TODO add your handling code here:
        if(City_Textfield.getText().equals("Enter City"))
        {
            City_Textfield.setText("");
            City_Textfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_City_TextfieldFocusGained

    private void City_TextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_City_TextfieldFocusLost
        // TODO add your handling code here:
        if(City_Textfield.getText().equals(""))
        {
            City_Textfield.setText("Enter City");
            City_Textfield.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_City_TextfieldFocusLost

    private void City_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_City_TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_City_TextfieldActionPerformed

    private void Pincode_TextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pincode_TextfieldFocusGained
        // TODO add your handling code here:
        if(Pincode_Textfield.getText().equals("Enter Pincode"))
        {
            Pincode_Textfield.setText("");
            Pincode_Textfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_Pincode_TextfieldFocusGained

    private void Pincode_TextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pincode_TextfieldFocusLost
        // TODO add your handling code here:
        if(Pincode_Textfield.getText().equals(""))
        {
            Pincode_Textfield.setText("Enter Pincode");
            Pincode_Textfield.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Pincode_TextfieldFocusLost

    private void Pincode_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pincode_TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pincode_TextfieldActionPerformed

    private void Contact_No_TextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Contact_No_TextfieldFocusGained
        // TODO add your handling code here:
        if(Contact_No_Textfield.getText().equals("Enter Contact_No"))
        {
            Contact_No_Textfield.setText("");
            Contact_No_Textfield.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_Contact_No_TextfieldFocusGained

    private void Contact_No_TextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Contact_No_TextfieldFocusLost
        // TODO add your handling code here:
        if(Contact_No_Textfield.getText().equals(""))
        {
            Contact_No_Textfield.setText("Enter Contact_No");
            Contact_No_Textfield.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Contact_No_TextfieldFocusLost

    private void Contact_No_TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contact_No_TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contact_No_TextfieldActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        UserName_Textfield.setText("Enter Username");
        UserName_Textfield.setForeground(new Color(204,204,204));
        Password_Textfield.setText("Enter Password");
        Password_Textfield.setForeground(new Color(204,204,204));
        Confirm_Password_Textfield.setText("Enter Confirm Password");
        Confirm_Password_Textfield.setForeground(new Color(204,204,204));
        Email_Textfield.setText("Enter Email");
        Email_Textfield.setForeground(new Color(204,204,204));
        City_Textfield.setText("Enter City");
        City_Textfield.setForeground(new Color(204,204,204));
        Pincode_Textfield.setText("Enter Pincode");
        Pincode_Textfield.setForeground(new Color(204,204,204));
        Contact_No_Textfield.setText("Enter Contact_No");
        Contact_No_Textfield.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_ResetActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        // TODO add your handling code here:
         username = UserName_Textfield.getText();
        password = Password_Textfield.getText();
        confirm_password = Confirm_Password_Textfield.getText();
        Email = Email_Textfield.getText();
        City = City_Textfield.getText();
        pincode = Pincode_Textfield.getText();
        Contact_no = Contact_No_Textfield.getText();
        String Error = "";
        int Flag1=0;
        int Flag2=0;
        int Flag3=0;
        int Flag4=0;
        
        if(username.equals("Enter Username"))
        {
            Error += " Username ";
            Flag1 = 1;
        }
        else
        {
            Error += "";
            //Flag1 = 0;
        }
        if(password.equals("Enter Password"))
        {
            Error += " Password ";
            Flag1 = 1;
        }
        else
        {
            Error += "";
            //Flag1 = 0;
        }
        if(confirm_password.equals("Enter Confirm Password"))
        {
            Error += " Confirm_Password ";
            Flag1 = 1;
        }
        else
        {
            Error += "";
            //Flag1 = 0;
        }
        if(Email.equals("Enter Email"))
        {
            Error += " Email ";
            Flag1 = 1;
        }
        else
        {
            Error += "";
            //Flag1 = 0;
        }
        if(City.equals("Enter City"))
        {
            Error += " City ";
            Flag1 = 1;
        }
        else
        {
            Error += "";
            //Flag1 = 0;
        }
        if(pincode.equals("Enter Pincode"))
        {
            Error += " Pincode ";
            Flag1 = 1;
        }
        else
        {
            Error += "";
            //Flag1 = 0;
        }
        if(Contact_no.equals("Enter Contact_No"))
        {
            Error += " Contact_No ";
            Flag1 = 1;
        }
        else
        {
            Error += "";
            //Flag1 = 0;
        }
        if(password.length() < 8)
        {
            Flag2 = 1;
        }
        else
        {
            Flag2 = 0;
        }
        if(password.equals(confirm_password))
        {
            Flag3 = 0;
        }
        else
        {
            Flag3 = 1;
        }
        if(Contact_no.length() == 10)
        {
            Flag4 = 0;
        }
        else
        {
            Flag4 = 1;
        }
        if(Flag1 == 1)
        {
            JOptionPane.showMessageDialog(rootPane,Error+" cannot be empty.");
        }
        else if(Flag2 == 1)
        {
            JOptionPane.showMessageDialog(rootPane,"8 Character Password Required.");
        }
        else if(Flag3 == 1)
        {
            JOptionPane.showMessageDialog(rootPane,"Password and Confirm Password must be same.");
        }
        else if(Flag4 == 1)
        {
            JOptionPane.showMessageDialog(rootPane," 10 Digit Phone Number Required.");
        }
        else
        {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/se_project?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "root");
                Statement st = cn.createStatement();
                
                int i = st.executeUpdate("insert into supplier_details values('"+username+"','"+Email+"','"+password+"','"+City+"','"+pincode+"','"+Contact_no+"')");
                
                if(i == 1)
                {
                    JOptionPane.showMessageDialog(rootPane," Registered Successfully ");
                    Cylinder_Infrormation O = new Cylinder_Infrormation(Email);
                    O.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane," Error in Registering .... ");
                }
                
                cn.close();
            }
            catch(SQLException s)
            {
                JOptionPane.showMessageDialog(rootPane," This Mail ID is already registered. Please LOGIN. ");
            }
            catch(ClassNotFoundException e)
            {
                JOptionPane.showMessageDialog(rootPane," Error in Registering DB ...."+e);
            }
            UserName_Textfield.setText("Enter Username");
            UserName_Textfield.setForeground(new Color(204,204,204));
            Password_Textfield.setText("Enter Password");
            Password_Textfield.setForeground(new Color(204,204,204));
            Confirm_Password_Textfield.setText("Enter Confirm Password");
            Confirm_Password_Textfield.setForeground(new Color(204,204,204));
            Email_Textfield.setText("Enter Email");
            Email_Textfield.setForeground(new Color(204,204,204));
            City_Textfield.setText("Enter City");
            City_Textfield.setForeground(new Color(204,204,204));
            Pincode_Textfield.setText("Enter Pincode");
            Pincode_Textfield.setForeground(new Color(204,204,204));
            Contact_No_Textfield.setText("Enter Contact_No");
            Contact_No_Textfield.setForeground(new Color(204,204,204));
            
            String message = "Hello, "+username+" You are successfully registered and this mail for confirmation";
            String subject = "Confirmation for Registration";
            String to = Email;
            String from = "oxygencylinderavailability@gmail.com";

            sendemail(message , subject , to , from);
            
        }
    }//GEN-LAST:event_RegisterActionPerformed
    
    private static void sendemail(String message , String subject , String to , String from)
    {
        //variable for Host
        String host = "smtp.gmail.com";
        
        //Get the System Properties
        Properties properties = System.getProperties();
        System.out.println("PROPERTIES = "+properties);
        
        //Setting import information to properties object
        
        //host set
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        
        //Step 1 : get the session object
        Session session = Session.getInstance(properties , new javax.mail.Authenticator(){
            
             protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication("oxygencylinderavailability@gmail.com","Oxygen1234@"); 
            }
        
        });
        
        session.setDebug(true);

        //Step 2 : Compose the mail
        MimeMessage M = new MimeMessage(session);
        
        
        try
        {
            //From email
            M.setFrom(from);
            
            //adding recipient
            M.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            
            //adding subject to message
            M.setSubject(subject);
            
            //adding text to message
            M.setText(message);
            
            //Step 3 : send the message using Transport Class
            Transport.send(M);
            
            System.out.println("Message is successfully send");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(Supplier_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Supplier_Registration().setVisible(true);
            }
        });
    }
    
    private String username;
    private String password;
    private String confirm_password;
    private String Email;
    private String City;
    private String pincode;
    private String Contact_no;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField City_Textfield;
    private javax.swing.JTextField Confirm_Password_Textfield;
    private javax.swing.JTextField Contact_No_Textfield;
    private javax.swing.JTextField Email_Textfield;
    private javax.swing.JLabel LConfirm_Password;
    private javax.swing.JLabel LContact_no;
    private javax.swing.JLabel LPassword;
    private javax.swing.JLabel LUsername;
    private javax.swing.JLabel Lcity;
    private javax.swing.JLabel Lemail;
    private javax.swing.JLabel Lpincode;
    private javax.swing.JTextField Password_Textfield;
    private javax.swing.JTextField Pincode_Textfield;
    private javax.swing.JButton Register;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField UserName_Textfield;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
