package cie;


import Aud.BookAuditorium;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class examDetails extends javax.swing.JFrame {

    /**
     * Creates new form examDetails
     */
    
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
    
    
    
    public examDetails() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        exam = new javax.swing.JLabel();
        courseid = new javax.swing.JLabel();
        coursename = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        courseidval = new javax.swing.JTextField();
        coursenameval = new javax.swing.JTextField();
        stimeval = new javax.swing.JTextField();
        showexam = new javax.swing.JButton();
        save = new javax.swing.JButton();
        book = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        modclass = new javax.swing.JButton();
        modstud = new javax.swing.JButton();
        time1 = new javax.swing.JLabel();
        etimeval = new javax.swing.JTextField();
        dateval = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();

        jLabel1.setText("jLabel1");

        jMenuItem1.setText("mymenu");

        jMenu1.setText("jMenu1");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.setInheritsPopupMenu(true);
        jMenu1.setMargin(new java.awt.Insets(2222, 2222, 2222, 2222));
        jMenu1.setName("menu"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exam.setFont(new java.awt.Font("DejaVu Serif", 3, 48)); // NOI18N
        exam.setForeground(new java.awt.Color(39, 229, 217));
        exam.setText("Examination Details");

        courseid.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        courseid.setForeground(new java.awt.Color(39, 229, 217));
        courseid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        courseid.setText("Course ID");

        coursename.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        coursename.setForeground(new java.awt.Color(39, 229, 217));
        coursename.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coursename.setText("Course Name");

        time.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        time.setForeground(new java.awt.Color(39, 229, 217));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("Start Time");

        date.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        date.setForeground(new java.awt.Color(39, 229, 217));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("Date");

        courseidval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseidvalActionPerformed(evt);
            }
        });

        showexam.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        showexam.setForeground(new java.awt.Color(39, 229, 217));
        showexam.setText("SHOW EXAM");
        showexam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showexamActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        save.setForeground(new java.awt.Color(39, 229, 217));
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        book.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        book.setForeground(new java.awt.Color(39, 229, 217));
        book.setText("BOOK");

        modclass.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        modclass.setForeground(new java.awt.Color(39, 229, 217));
        modclass.setText("Modify Classroom Details");
        modclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modclassActionPerformed(evt);
            }
        });

        modstud.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        modstud.setForeground(new java.awt.Color(39, 229, 217));
        modstud.setText("Modify Student Details");
        modstud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modstudActionPerformed(evt);
            }
        });

        time1.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        time1.setForeground(new java.awt.Color(39, 229, 217));
        time1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time1.setText("End Time");

        etimeval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etimevalActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(exam, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(492, 492, 492)
                                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(showexam, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(modclass)
                        .addGap(41, 41, 41)
                        .addComponent(modstud, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(courseid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(coursename, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(time, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(courseidval)
                    .addComponent(coursenameval)
                    .addComponent(stimeval)
                    .addComponent(etimeval, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateval, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(exam, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseidval, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coursenameval, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursename, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateval, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stimeval, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etimeval, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel7)
                        .addGap(38, 86, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modclass, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showexam, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modstud, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showexamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showexamActionPerformed
      new showexam().setVisible(true);
      this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_showexamActionPerformed

    private void modstudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modstudActionPerformed
           new ModifyStudentDetails().setVisible(true);
           this.setVisible(false); 
    }//GEN-LAST:event_modstudActionPerformed

    private void modclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modclassActionPerformed
           new ModifyClassroom().setVisible(true);
           this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_modclassActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String courseid;
        String courseName;
        String starttime,endtime;
        courseid = courseidval.getText();
        
        courseName = coursenameval.getText();
         Date dateOfEvent = dateval.getDate();
java.sql.Date sqlDateofexam = new java.sql.Date(dateOfEvent.getTime());     
       starttime =  stimeval.getText();
      endtime =  etimeval.getText();
        
    DateFormat sdf = new SimpleDateFormat("hh:mm");
      Date date1 = null;
       Date date2 = null;
     try {
         date1 = sdf.parse(starttime);
          date2 = sdf.parse(endtime);
     } catch (ParseException ex) {
         Logger.getLogger(BookAuditorium.class.getName()).log(Level.SEVERE, null, ex);
     }
      Time time1 = new Time(date1.getTime());
      Time time2 = new Time(date2.getTime());
      
      String query = "insert into Exam (Course_ID, Course, Date,sTime,eTime) " + 
                                   "values (?,?,?,?,?)"; 
        

     

      try {
        getConnectiondb();

         preparedStatement = myConn.prepareStatement(query);

         preparedStatement.setString(1,courseid);
         preparedStatement.setString(2,courseName);
          preparedStatement.setDate(3,sqlDateofexam);
         preparedStatement.setTime(4,time1 );
          preparedStatement.setTime(5,time2);
         
         

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
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void courseidvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseidvalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseidvalActionPerformed

    private void etimevalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etimevalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etimevalActionPerformed

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
            java.util.logging.Logger.getLogger(examDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(examDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(examDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(examDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new examDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton book;
    private javax.swing.JLabel courseid;
    private javax.swing.JTextField courseidval;
    private javax.swing.JLabel coursename;
    private javax.swing.JTextField coursenameval;
    private javax.swing.JLabel date;
    private com.toedter.calendar.JDateChooser dateval;
    private javax.swing.JTextField etimeval;
    private javax.swing.JLabel exam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton modclass;
    private javax.swing.JButton modstud;
    private javax.swing.JButton save;
    private javax.swing.JButton showexam;
    private javax.swing.JTextField stimeval;
    private javax.swing.JLabel time;
    private javax.swing.JLabel time1;
    // End of variables declaration//GEN-END:variables

    private static class ModifyStudentsDetails {

        public ModifyStudentsDetails() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}