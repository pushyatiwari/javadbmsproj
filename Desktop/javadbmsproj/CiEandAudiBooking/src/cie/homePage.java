package cie;


import Aud.BookAuditorium;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
public class homePage extends javax.swing.JFrame {

    /**
     * Creates new form homePage
     */
    public homePage() {
        initComponents();
    getContentPane().setBackground(new java.awt.Color(20, 16, 89));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cieandaudi = new javax.swing.JLabel();
        cie = new javax.swing.JButton();
        audi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cieandaudi.setBackground(new java.awt.Color(102, 0, 102));
        cieandaudi.setFont(new java.awt.Font("DejaVu Serif", 1, 48)); // NOI18N
        cieandaudi.setForeground(new java.awt.Color(39, 229, 217));
        cieandaudi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cieandaudi.setText("CIE AND AUDITORIUM BOOKING");
        cieandaudi.setToolTipText("");
        cieandaudi.setAlignmentY(2.0F);
        cieandaudi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cieandaudi.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cieandaudiAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cieandaudi.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                cieandaudiComponentHidden(evt);
            }
        });

        cie.setBackground(new java.awt.Color(20, 16, 89));
        cie.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        cie.setForeground(new java.awt.Color(39, 229, 217));
        cie.setText("CIE SEAT BOOKING");
        cie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cieActionPerformed(evt);
            }
        });

        audi.setBackground(new java.awt.Color(20, 16, 89));
        audi.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        audi.setForeground(new java.awt.Color(39, 229, 217));
        audi.setText("AUDITORIUM BOOKING");
        audi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cieandaudi, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(audi, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(cie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cieandaudi, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addComponent(cie, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(audi, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cieActionPerformed
           new login().setVisible(true);
           this.setVisible(false);
            //homePage h=new homePage();
            //h.setVisible(true);
            // TODO add your handling code here:
    }//GEN-LAST:event_cieActionPerformed

    private void audiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audiActionPerformed
        new BookAuditorium().setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_audiActionPerformed

    private void cieandaudiComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_cieandaudiComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_cieandaudiComponentHidden

    private void cieandaudiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cieandaudiAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cieandaudiAncestorAdded

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
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton audi;
    private javax.swing.JButton cie;
    private javax.swing.JLabel cieandaudi;
    // End of variables declaration//GEN-END:variables
}
