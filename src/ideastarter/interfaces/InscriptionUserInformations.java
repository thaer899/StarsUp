/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ideastarter.interfaces;

/**
 *
 * @author Administrateur
 */
public class InscriptionUserInformations extends javax.swing.JFrame {

    /**
     * Creates new form InscriptionUserInformations
     */
    public InscriptionUserInformations() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 410));
        getContentPane().setLayout(null);

        jButton1.setText("Continue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 320, 75, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/logoPi (2).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(25, 22, 61, 62);

        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Home     |      Registration    |        Personal Information");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(181, 22, 309, 50);

        jLabel3.setText("Nickname");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 140, 75, 25);

        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 170, 75, 25);

        jLabel5.setText("Confirmation");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 200, 75, 25);

        jLabel6.setText("Secret question");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 240, 75, 25);

        jLabel7.setText("Answer");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 270, 75, 25);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 140, 386, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 180, 386, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(170, 210, 386, 20);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(170, 270, 386, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is the last name of the teacher who gave you your first failing grade?", "What is the name of the place your wedding reception was held?", "What is the name of the first beach you visited?", "In what city or town did you meet your spouse/partner?", "What was the make and model of your first car?", "What was your maternal grandfather’s first name?", "In what city or town does your nearest sibling live?" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(170, 240, 386, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideastarter/Image/fond.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 600, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       InscriptionConfirmation gh = new InscriptionConfirmation();
        gh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(InscriptionUserInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscriptionUserInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscriptionUserInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscriptionUserInformations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InscriptionUserInformations().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}