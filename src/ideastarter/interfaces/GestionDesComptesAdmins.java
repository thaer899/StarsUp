/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.interfaces;

/**
 *
 * @author attia
 */
public class GestionDesComptesAdmins extends javax.swing.JFrame {

    /**
     * Creates new form GestionDesComptesAdmins
     */
    public GestionDesComptesAdmins() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bt_addAccount = new javax.swing.JButton();
        bt_deleteAccount = new javax.swing.JButton();
        bt_updateAccount = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Nom", "Prenom", "Pseudo", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 11, 440, 167);

        bt_addAccount.setText("Add Account");
        bt_addAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addAccountActionPerformed(evt);
            }
        });
        getContentPane().add(bt_addAccount);
        bt_addAccount.setBounds(144, 206, 104, 23);

        bt_deleteAccount.setText("Delete Account");
        getContentPane().add(bt_deleteAccount);
        bt_deleteAccount.setBounds(201, 247, 105, 23);

        bt_updateAccount.setText("Update Account");
        bt_updateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateAccountActionPerformed(evt);
            }
        });
        getContentPane().add(bt_updateAccount);
        bt_updateAccount.setBounds(266, 206, 109, 23);

        bt_back.setText("Back");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });
        getContentPane().add(bt_back);
        bt_back.setBounds(40, 297, 55, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/fond.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        this.dispose(); 
    }//GEN-LAST:event_bt_backActionPerformed

    private void bt_addAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addAccountActionPerformed
        new AjoutAdmin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bt_addAccountActionPerformed

    private void bt_updateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateAccountActionPerformed
        new MiseAjourCompteAdmin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bt_updateAccountActionPerformed

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
            java.util.logging.Logger.getLogger(GestionDesComptesAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionDesComptesAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionDesComptesAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionDesComptesAdmins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionDesComptesAdmins().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addAccount;
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_deleteAccount;
    private javax.swing.JButton bt_updateAccount;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
