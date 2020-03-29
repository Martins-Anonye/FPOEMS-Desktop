/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnector;

/**
 *
 * @author Martins
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Martins
 */
public class MyDbDriverConnector {
    
    Connection con;
    Statement st;
    
    String databasename;

    public String getDatabasename() {
        return databasename;
    }

    public void setDatabasename(String databasename) {
        this.databasename = databasename;
    }
    
      public  Statement DBDriverStatementLoader(){
//     "com.mysql.jdbc.Driver"
         
         
         String forN = "org.sqlite.JDBC";
                                  
                              
        try {
             try {
                 Class.forName(forN).newInstance();
             } catch (InstantiationException ex) {
                 Logger.getLogger(MyDbDriverConnector.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 Logger.getLogger(MyDbDriverConnector.class.getName()).log(Level.SEVERE, null, ex);
             }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyDbDriverConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
                              

                                         try {
//                                             PorjectTopicDicOko.db

//String dbfile ="martinsasImport.db";
            
           con = DriverManager.getConnection("jdbc:sqlite:"+databasename);
                       // con = DriverManager.getConnection("jdbc:sqlite:"+dbfile);

                                         } 
                                         catch (SQLException ex) {
                                             Logger.getLogger(MyDbDriverConnector.class.getName()).log(Level.SEVERE, null, ex);
                                         }                                
        try {
            st=  con.createStatement();
        } catch (SQLException ex) {
           Logger.getLogger(MyDbDriverConnector.class.getName()).log(Level.SEVERE, null, ex);
       
        }
     return  st;
     
     }

      
     
    
}
