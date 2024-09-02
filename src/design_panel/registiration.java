/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package design_panel;

import Entities.Registiration;
import Entities.Store;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author jatt6
 */
public class registiration extends javax.swing.JFrame {

    /**
     * Creates new form registiration
     */
    public registiration() {
        initComponents();
        this.setLocation(650,190);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        username_reg = new javax.swing.JTextField();
        password_reg = new javax.swing.JPasswordField();
        cpassword_reg = new javax.swing.JPasswordField();
        security_reg = new javax.swing.JComboBox<>();
        ans_reg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(790, 520));
        setResizable(false);
        setSize(new java.awt.Dimension(790, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employe Portal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 39, 397, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 121, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 197, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 271, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Security Check");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 347, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Answer");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 413, -1, -1));

        username_reg.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        username_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_regActionPerformed(evt);
            }
        });
        getContentPane().add(username_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 121, 205, -1));

        password_reg.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        password_reg.setText("jPasswordField1");
        getContentPane().add(password_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 194, 205, -1));

        cpassword_reg.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        cpassword_reg.setText("jPasswordField2");
        getContentPane().add(cpassword_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 265, 205, -1));

        security_reg.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        security_reg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Security Questions", "What's your age ?", "How many geders are ?" }));
        getContentPane().add(security_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 344, 320, -1));

        ans_reg.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        ans_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans_regActionPerformed(evt);
            }
        });
        getContentPane().add(ans_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 410, 205, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design_panel/Background Images/add-user.png"))); // NOI18N
        jButton1.setText("SignUp");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 455, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 455, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/design_panel/Background Images/registiration.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ans_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans_regActionPerformed

    private void username_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_regActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!username_reg.getText().isEmpty() 
            && !new String( password_reg.getPassword()).isEmpty()
            && !new String( cpassword_reg.getPassword()).isEmpty()
            && security_reg.getSelectedIndex()!=0
            && !ans_reg.getText().isEmpty()){
            if (new String(password_reg.getPassword()).equals(new String(cpassword_reg.getPassword()))) {
                
            
            Registiration e;
            e = new Registiration(username_reg.getText(),
            new String(password_reg.getPassword()),
            ans_reg.getText(),
            security_reg.getSelectedItem().toString());
                   
            Store.addEmploye(e);
            JOptionPane.showMessageDialog(null, "Employee Added Successfully");
           
            this.setVisible(false);
            this.dispose();
            new Welcome_Screen().setVisible(true);
             }
            else{
             JOptionPane.showMessageDialog(null, "Confirm your password again");}
        }
        else{
             JOptionPane.showMessageDialog(null, "Fill  in the Details");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            this.setVisible(false);
        this.dispose();
        new Welcome_Screen().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(registiration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registiration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registiration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registiration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registiration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans_reg;
    private javax.swing.JPasswordField cpassword_reg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField password_reg;
    private javax.swing.JComboBox<String> security_reg;
    private javax.swing.JTextField username_reg;
    // End of variables declaration//GEN-END:variables
}
