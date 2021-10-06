/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recep;

import java.awt.Color;
import Connector.ConnectorClass;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahin
 */
public class Add_recep extends javax.swing.JFrame {

    /**
     * Creates new form Add_recep
     */
    public Add_recep() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl1 = new javax.swing.JLabel();
        P_Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        P_Age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        p_blood = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        P_phone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        D_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Nurse_ID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Cabin_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        De_ID = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jl1.setText("Patient Name :");
        getContentPane().add(jl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 59, -1, 26));
        getContentPane().add(P_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 62, 174, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Patient Age :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 94, 82, -1));
        getContentPane().add(P_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 91, 174, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Blood Group:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        getContentPane().add(p_blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 117, 174, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Phone No.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 146, -1, -1));
        getContentPane().add(P_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 143, 174, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, 425, 10));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Doctor ID:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 226, -1, -1));
        getContentPane().add(D_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 223, 174, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nurse ID:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 252, -1, -1));
        getContentPane().add(Nurse_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 249, 174, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Cabin ID:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 278, -1, -1));
        getContentPane().add(Cabin_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 275, 174, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Disease ID:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        getContentPane().add(De_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 300, 180, -1));

        Add.setBackground(new java.awt.Color(153, 153, 153));
        Add.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Add.setForeground(new java.awt.Color(0, 153, 0));
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recep/add.png"))); // NOI18N
        Add.setText("ADD");
        Add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 90, 40));

        Clear.setBackground(new java.awt.Color(153, 153, 153));
        Clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Clear.setForeground(new java.awt.Color(0, 102, 153));
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recep/Reset.png"))); // NOI18N
        Clear.setText("Reset");
        Clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 401, 80, 40));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Payment");
        jButton1.setActionCommand("");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 90, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Patient Details   :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 425, 10));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recep/close Jframe.png"))); // NOI18N
        jButton4.setText("Exit");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 402, 70, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recep/photo-1587370560942-ad2a04eabb6d.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        String name = P_Name.getText();
        String age=P_Age.getText();
        String bGroup=p_blood.getText();
        String pNo =P_phone.getText();
        String dId=D_id.getText();
        String Nurseid=Nurse_ID.getText();
        String CabinID=Cabin_id.getText();
        String DeseaseId=De_ID.getText();

        try{
            Connection connection= ConnectorClass.getcon();
            String sqlInsert = "insert into Patient values('"+name+"','"+age+"','"+bGroup+"','"+pNo+"','"+dId+"','"+Nurseid+"','"+CabinID+"','"+DeseaseId+"',DEFAULT)";
            Statement statementToShow = connection.createStatement();
            int row = statementToShow.executeUpdate(sqlInsert);
            JOptionPane.showMessageDialog(null,"Added");
        }catch(Exception e)
        {
            
        }

    }//GEN-LAST:event_AddActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        P_Name.setText("");
        P_Age.setText("");
        p_blood.setText("");
        P_phone.setText("");
        D_id.setText("");
        Nurse_ID.setText("");
        Cabin_id.setText("");
        De_ID.setText("");

    }//GEN-LAST:event_ClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Payment_recep pr=new Payment_recep();
        setVisible(false);
        pr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Homepage_recep obj = new Homepage_recep();
        setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_recep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_recep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_recep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_recep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_recep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Cabin_id;
    private javax.swing.JButton Clear;
    private javax.swing.JTextField D_id;
    private javax.swing.JTextField De_ID;
    private javax.swing.JTextField Nurse_ID;
    private javax.swing.JTextField P_Age;
    private javax.swing.JTextField P_Name;
    private javax.swing.JTextField P_phone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jl1;
    private javax.swing.JTextField p_blood;
    // End of variables declaration//GEN-END:variables
}
