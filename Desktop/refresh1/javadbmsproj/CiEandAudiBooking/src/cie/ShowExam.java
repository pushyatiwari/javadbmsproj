package cie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
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
public class ShowExam extends javax.swing.JFrame {
    private Object jRadiobutton2;
    
    
    
    
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
     * Creates new form ShowExam
     */
    public ShowExam() {
        initComponents();
          getContentPane().setBackground(new java.awt.Color(1,1,1));
    }
    
    void populate()
    {
         try {
             getConnectiondb();
             String sql = ("SELECT * FROM Exam ");
             Statement st = myConn.createStatement();
ResultSet rs = st.executeQuery(sql);
   String Course_id,courseName;
   Date exam_date;
   Time stime,eTime;
   int count = 1;
   textarea1.add(scroll);
   
while(rs.next()) { 
 
  Course_id = rs.getString("Course_ID"); 
  courseName = rs.getString("Course");
  exam_date = rs.getDate("Date");
  stime = rs.getTime("sTime");
  eTime = rs.getTime("eTime");
  
   
  textarea1.setEditable(false);
  textarea1.append(count++ +". ");
  textarea1.append("course id : "+ Course_id+"\n");
  textarea1.append("courseName: "+courseName+"\n");
  textarea1.append("exam date: "+exam_date+"\n");
  textarea1.append("start time: "+stime+"\n");
  textarea1.append("end time: "+eTime+"\n");
  textarea1.append("\n\n");
  
 
}

 }      catch (SQLException ex) { 
            Logger.getLogger(ShowExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShowExam.class.getName()).log(Level.SEVERE, null, ex);
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        cie_bookPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("cie_bookPU").createEntityManager();
        examQuery = java.beans.Beans.isDesignTime() ? null : cie_bookPUEntityManager.createQuery("SELECT e FROM Exam e");
        examList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : examQuery.getResultList();
        showexam = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        scroll = new javax.swing.JScrollBar();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        showexam.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 48)); // NOI18N
        showexam.setForeground(new java.awt.Color(254, 254, 254));
        showexam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showexam.setText("EXAMS");

        back.setBackground(new java.awt.Color(45, 99, 95));
        back.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        back.setForeground(new java.awt.Color(254, 254, 254));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        textarea1.setBackground(new java.awt.Color(1, 1, 1));
        textarea1.setColumns(20);
        textarea1.setFont(new java.awt.Font("DejaVu Serif Condensed", 3, 24)); // NOI18N
        textarea1.setForeground(new java.awt.Color(254, 254, 254));
        textarea1.setRows(5);
        jScrollPane1.setViewportView(textarea1);

        jButton1.setBackground(new java.awt.Color(45, 99, 95));
        jButton1.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(45, 99, 95));
        jButton2.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(254, 254, 254));
        jButton2.setText("SHOW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(45, 99, 95));
        jButton3.setFont(new java.awt.Font("DejaVu Sans Condensed", 3, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(254, 254, 254));
        jButton3.setText("CLEAR EXAMS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(showexam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showexam, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(back)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
      new examDetails().setVisible(true);
           this.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         booking_exam be = new booking_exam();
         be.setVisible(true);
         this.setVisible(false);
         
           
           try {
             getConnectiondb();
             String sql = ("SELECT * FROM Exam");
             Statement st = myConn.createStatement();
ResultSet rs = st.executeQuery(sql);
while(rs.next()) { 
 
      Date a_name = rs.getDate("Date"); 

be.booking_date_val.addItem(a_name.toString());

 
 
}

 }      catch (SQLException ex) { 
            Logger.getLogger(ShowExam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ShowExam.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        
//         try {
//             getConnectiondb();
//             String sql = "Delete from Exam";
//            PreparedStatement pst = myConn.prepareStatement(sql);
//                   boolean rows1 = pst.execute();
//                   
//         } catch (SQLException ex) { 
//            Logger.getLogger(ModifyClassroom.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ModifyClassroom.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ShowExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowExam().setVisible(true);
            }
        });
      
         
        
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.persistence.EntityManager cie_bookPUEntityManager;
    private java.util.List<cie.Exam> examList;
    private javax.persistence.Query examQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollBar scroll;
    private javax.swing.JLabel showexam;
    private javax.swing.JTextArea textarea1;
    // End of variables declaration//GEN-END:variables
}
