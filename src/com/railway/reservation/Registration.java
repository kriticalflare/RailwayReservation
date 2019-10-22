/*
 * Copyright 2019 kriticalflare.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.railway.reservation;

import com.railway.reservation.constants.Constants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author kriticalflare
 */
public class Registration extends javax.swing.JFrame {

    Integer s3;
    String s1, s2, s5, pass;
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        signUpHeader = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelAge = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        buttonSignUp = new javax.swing.JButton();
        buttonLogIn = new javax.swing.JButton();
        textUserName = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        textAge = new javax.swing.JTextField();
        textAddress = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        buttonUpdate = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signUpHeader.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signUpHeader.setText("Login/Signup");

        labelUserName.setText("Username");

        labelName.setText("Name");

        labelAge.setText("Age");

        labelAddress.setText("Address");

        labelPassword.setText("Password");

        buttonSignUp.setText("Sign up");
        buttonSignUp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonSignUpActionPerformed(evt);
            }
        });

        buttonLogIn.setText("Login");
        buttonLogIn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonLogInActionPerformed(evt);
            }
        });

        textName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                textNameActionPerformed(evt);
            }
        });

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonClear.setText("Clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                buttonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelName)
                            .addComponent(labelUserName)
                            .addComponent(labelAge)
                            .addComponent(labelAddress)
                            .addComponent(labelPassword))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textAddress)
                                .addComponent(textAge, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addComponent(textUserName)
                                .addComponent(textName)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(signUpHeader)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(buttonSignUp)
                        .addGap(51, 51, 51)
                        .addComponent(buttonLogIn)
                        .addGap(44, 44, 44)
                        .addComponent(buttonUpdate)
                        .addGap(34, 34, 34)
                        .addComponent(buttonClear)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(signUpHeader)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelUserName)
                    .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAge)
                    .addComponent(textAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAddress)
                    .addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSignUp)
                    .addComponent(buttonLogIn)
                    .addComponent(buttonUpdate)
                    .addComponent(buttonClear))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        insert();
    }//GEN-LAST:event_buttonSignUpActionPerformed

    private void buttonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogInActionPerformed
        openLoginFrame();
    }//GEN-LAST:event_buttonLogInActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        update();
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        clear();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void textNameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_textNameActionPerformed
    {//GEN-HEADEREND:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonLogIn;
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelAge;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JLabel signUpHeader;
    private javax.swing.JTextField textAddress;
    private javax.swing.JTextField textAge;
    private javax.swing.JTextField textName;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables

    public void insert() {
        int x = 0;
        s1 = textUserName.getText();
        s2 = textName.getText();
        s3 = Integer.parseInt(textAge.getText());
        s5 = textAddress.getText();
        char[] pass = textPassword.getPassword();
        String s8 = new String(pass);
        try {
            System.out.println(Constants.password);
            Connection con = DriverManager.getConnection(Constants.url, Constants.user, Constants.password);
            PreparedStatement ps = con.prepareStatement("insert into userLogin values (?,?,?,?,?)");
            ps.setString(1, s1);
            ps.setString(2, s2);
            ps.setInt(3, s3);
            ps.setString(4, s5);
            ps.setString(5, s8);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(buttonSignUp, "Data Saved Successfully");
            clear();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void search(int id) {
        try {
            conn = DriverManager.getConnection(Constants.url, Constants.user, Constants.password);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from userLogin where username =" + id);
            while (rs.next()) {
                textUserName.setText("" + rs.getString("username"));
                textName.setText(rs.getString("fname"));
                textAge.setText("" + rs.getInt("age"));
                textAddress.setText(rs.getString("address"));
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void update() {
        s1 = textUserName.getText();
        s2 = textName.getText();
        s3 = Integer.parseInt(textAge.getText());
        s5 = textAddress.getText();
        char[] pass = textPassword.getPassword();
        String s8 = new String(pass);
        try {
            conn = DriverManager.getConnection(Constants.url, Constants.user, Constants.password);
            System.out.println("Connected to the PostgreSQL server successfully.");
            stmt = conn.createStatement();
            PreparedStatement ps = conn.prepareStatement("update userLogin set fname=?,age=?,address=?,pass=? where username = ?");
            ps.setString(1, s2);
            ps.setInt(2, s3);
            ps.setString(3, s5);
            ps.setString(4, pass.toString());
            ps.setString(5, s1);
            ps.executeUpdate();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(buttonUpdate, "Data Saved");
        clear();
    }

    public void clear() {
        textUserName.setText("");
        textName.setText("");
        textAge.setText("");
        textAddress.setText("");
        textPassword.setText("");
    }

    private void openLoginFrame() {
        setVisible(false);
        new Login().setVisible(true);
    }
}
