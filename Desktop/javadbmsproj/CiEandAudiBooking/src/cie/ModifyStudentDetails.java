package cie;

import Aud.BookAuditorium;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LENOVO
 */
public class ModifyStudentDetails extends javax.swing.JFrame {

    /**
     * Creates new form ModifyStudentDetails
     */
    public ModifyStudentDetails() {
        initComponents();
         getContentPane().setBackground(new java.awt.Color(20, 16, 89));
    }
    
     Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        PreparedStatement preparedStatement;
    /**
     * Creates new form BookAuditorium
     */
   void getConnectiondb() throws SQLException, ClassNotFoundException{
        // TODO code application logic here
       
      String user = "root";
      String pass = "test";

      myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cie_book", user, pass);
       

       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        modstud = new javax.swing.JLabel();
        usn = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        class_ = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        usnval = new javax.swing.JTextField();
        nameval = new javax.swing.JTextField();
        classval = new javax.swing.JTextField();
        yearval = new javax.swing.JTextField();
        contactval = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        modify = new javax.swing.JButton();
        removename = new javax.swing.JRadioButton();
        deregisterstudent = new javax.swing.JRadioButton();
        addstud = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        modify1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        modstud.setFont(new java.awt.Font("DejaVu Sans", 3, 48)); // NOI18N
        modstud.setForeground(new java.awt.Color(39, 229, 217));
        modstud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modstud.setText("MODIFY STUDENT DETAILS");
        modstud.setAlignmentX(2.0F);
        modstud.setAlignmentY(2.0F);

        usn.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        usn.setForeground(new java.awt.Color(39, 229, 217));
        usn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usn.setText("USN");
        usn.setAlignmentX(2.0F);
        usn.setAlignmentY(2.0F);

        name.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        name.setForeground(new java.awt.Color(39, 229, 217));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("NAME");
        name.setAlignmentX(2.0F);
        name.setAlignmentY(2.0F);

        class_.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        class_.setForeground(new java.awt.Color(39, 229, 217));
        class_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        class_.setText("CLASS");
        class_.setAlignmentX(2.0F);
        class_.setAlignmentY(2.0F);

        year.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        year.setForeground(new java.awt.Color(39, 229, 217));
        year.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        year.setText("YEAR");
        year.setAlignmentX(2.0F);
        year.setAlignmentY(2.0F);

        contact.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        contact.setForeground(new java.awt.Color(39, 229, 217));
        contact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contact.setText("CONTACT");

        usnval.setAlignmentX(2.0F);
        usnval.setAlignmentY(2.0F);
        usnval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usnvalActionPerformed(evt);
            }
        });

        nameval.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        nameval.setAlignmentX(2.0F);
        nameval.setAlignmentY(2.0F);

        classval.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        classval.setAlignmentX(2.0F);
        classval.setAlignmentY(2.0F);
        classval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classvalActionPerformed(evt);
            }
        });

        yearval.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        yearval.setAlignmentX(2.0F);
        yearval.setAlignmentY(2.0F);
        yearval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearvalActionPerformed(evt);
            }
        });

        contactval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactvalActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        add.setForeground(new java.awt.Color(39, 229, 217));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        modify.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        modify.setForeground(new java.awt.Color(39, 229, 217));
        modify.setText("MODIFY");
        modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyActionPerformed(evt);
            }
        });

        removename.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        removename.setForeground(new java.awt.Color(39, 229, 217));
        removename.setText("REMOVE  STUDENT");
        removename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removenameActionPerformed(evt);
            }
        });

        deregisterstudent.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        deregisterstudent.setForeground(new java.awt.Color(39, 229, 217));
        deregisterstudent.setText("DEREGISTER STUDENT");
        deregisterstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deregisterstudentActionPerformed(evt);
            }
        });

        addstud.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        addstud.setForeground(new java.awt.Color(39, 229, 217));
        addstud.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addstud.setText("ADD STUDENT");
        addstud.setAlignmentX(2.0F);
        addstud.setAlignmentY(2.0F);

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        modify1.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        modify1.setForeground(new java.awt.Color(39, 229, 217));
        modify1.setText("SHOW");
        modify1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(back))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(modstud, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addstud, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(contact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(class_, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameval)
                            .addComponent(usnval)
                            .addComponent(classval)
                            .addComponent(yearval)
                            .addComponent(contactval, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modify)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(deregisterstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(removename, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addComponent(modify1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(modstud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addstud, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usnval)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameval, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(class_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(modify)
                            .addComponent(modify1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(classval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(yearval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(contactval, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(88, 88, 88)
                .addComponent(deregisterstudent)
                .addGap(39, 39, 39)
                .addComponent(removename)
                .addGap(134, 134, 134)
                .addComponent(back)
                .addGap(136, 136, 136))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removenameActionPerformed
        if(removename.isSelected()) {
            new RemoveStudent().setVisible(true);
this.setVisible(false);}
       // TODO add your handling code here:
    }//GEN-LAST:event_removenameActionPerformed

    private void usnvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usnvalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usnvalActionPerformed

    private void deregisterstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deregisterstudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deregisterstudentActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       new examDetails().setVisible(true);
           this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void classvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classvalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classvalActionPerformed

    private void yearvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearvalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearvalActionPerformed

    private void contactvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactvalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactvalActionPerformed

    private void modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String susn,sname,sclass,scontact;
        int syear;
        susn = usnval.getText();
        sname = nameval.getText();
        sclass = classval.getText();
        syear = Integer.parseInt(yearval.getText());
        scontact = contactval.getText();
        
        
        
         String query = "insert into Student(USN, Name, Class,Year,Contact) " + 
                                   "values (?,?,?,?,?)"; 
        

     

      try {
        getConnectiondb();

         preparedStatement = myConn.prepareStatement(query);

         preparedStatement.setString(1,susn);
         preparedStatement.setString(2,sname);
          preparedStatement.setString(3,sclass);
         preparedStatement.setInt(4,syear);
          preparedStatement.setString(5,scontact);
         
         

         // Execute statement and return the number of rows affected
         int rowCount = preparedStatement.executeUpdate();
         System.out.println("Number of rows affected: " + rowCount);
      } catch (SQLException ex) {
         Logger.getLogger(BookAuditorium.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(BookAuditorium.class.getName()).log(Level.SEVERE, null, ex);
     } finally {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookAuditorium.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                myConn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BookAuditorium.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
      }
        
        
    }//GEN-LAST:event_addActionPerformed

    private void modify1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify1ActionPerformed
        // TODO add your handling code here:
        
           new showStudents().setVisible(true);
        
        
    }//GEN-LAST:event_modify1ActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyStudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyStudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyStudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyStudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyStudentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel addstud;
    private javax.swing.JButton back;
    private javax.swing.JLabel class_;
    private javax.swing.JTextField classval;
    private javax.swing.JLabel contact;
    private javax.swing.JTextField contactval;
    private javax.swing.JRadioButton deregisterstudent;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton modify;
    private javax.swing.JButton modify1;
    private javax.swing.JLabel modstud;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameval;
    private javax.swing.JRadioButton removename;
    private javax.swing.JLabel usn;
    private javax.swing.JTextField usnval;
    private javax.swing.JLabel year;
    private javax.swing.JTextField yearval;
    // End of variables declaration//GEN-END:variables
}
