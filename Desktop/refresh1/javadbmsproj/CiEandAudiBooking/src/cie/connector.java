package cie;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pushya
 */
public class connector {
      Connection getConnectionnecteddb(String db) throws SQLException{
        // TODO code application logic here
        
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;

        String user = "root";
        String pass = "test";

        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db, user, pass);

          

           

        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return myConn;
      
}
}
