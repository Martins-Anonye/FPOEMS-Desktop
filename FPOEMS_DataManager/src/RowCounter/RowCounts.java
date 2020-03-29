/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RowCounter;

import DBConnector.MyDbDriverConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Martins
 */
public class RowCounts {
    
    ResultSet executeQuery;
    Statement stmt;
    Integer ss;
     public int presentdbrowcounter(String importedDBname,String sqlstatment){
        
       try {
             MyDbDriverConnector myDbDriverConnector = new  MyDbDriverConnector();
        myDbDriverConnector.setDatabasename(importedDBname);
      stmt =  myDbDriverConnector.DBDriverStatementLoader();
                     
      executeQuery= stmt.executeQuery(sqlstatment);
       } catch (SQLException ex) {
           Logger.getLogger(RowCounts.class.getName()).log(Level.SEVERE, null, ex);
       }

       try {
           if(executeQuery.next()){
               
               
                ss = Integer.parseInt(executeQuery.getString("count(*)"));
           }
       } catch (SQLException ex) {
           Logger.getLogger(RowCounts.class.getName()).log(Level.SEVERE, null, ex);
       }
               return ss;
    
    
    
    }
}
