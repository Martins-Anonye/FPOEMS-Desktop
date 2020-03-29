/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreExceptionForNoOfClassesPerRoom;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;

/**
 *
 * @author Martins
 */





















/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javax.swing.JOptionPane;
/**
 *
 * @author MartinsEagleEyes
 */
public class BackGroundTaskTable extends Task<ObservableList<TableViewExceptionMakerDataModel>> implements  StaticMakerForTable{
    

    
   static Connection    con;
   static Statement st;
   static  ResultSet eQuery;
     ObservableList<TableViewExceptionMakerDataModel> exceptionHolder = FXCollections.observableArrayList();
     
     public  static Statement DBDriverStatementLoader(){
//     "com.mysql.jdbc.Driver"
         
         
         String forN = "org.sqlite.JDBC";
                           try {
                                                 
                               try {
                                   Class.forName(forN).newInstance();
                               } catch (InstantiationException ex) {
                                   Logger.getLogger(BackGroundTaskTable.class.getName()).log(Level.SEVERE, null, ex);
                               } catch (IllegalAccessException ex) {
                                   Logger.getLogger(BackGroundTaskTable.class.getName()).log(Level.SEVERE, null, ex);
                               }
                                               
                                             } catch (ClassNotFoundException ex) {
                                                 Logger.getLogger(BackGroundTaskTable.class.getName()).log(Level.SEVERE, null, ex);
                                             }




                                         try {
//                                             PorjectTopicDicOko.db
            
            con = DriverManager.getConnection("jdbc:sqlite:ExceptionDataBaseForSpecilaLoopOrder.db");
                                         } 
                                         catch (SQLException ex) {
                                             Logger.getLogger(BackGroundTaskTable.class.getName()).log(Level.SEVERE, null, ex);
                                         }
                                         
        try {
            st=  con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(BackGroundTaskTable.class.getName()).log(Level.SEVERE, null, ex);
        }

                                       
     return  st;
     
     }
 public ObservableList<TableViewExceptionMakerDataModel>   listDataloader(){
     
//      public ObservableList<TableColumnDataPop>   listDataloader(){

     
   
                      
         
                       
                         
                          
                            try {
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                try {
                                  
String s = "select * from SpecilaLoopingAndDuplicate";
                                            
//                                            String.format("select * from projectdec");
//

eQuery = DBDriverStatementLoader().executeQuery(s);
                                } catch (SQLException ex) {
                                    
                                    
                                    
                                }
                                
//   }




while(eQuery.next() ){

                                 Integer ordinaryId  =    eQuery.getInt("Rowid");
                              Integer realRowIdPrimaryKey  =    eQuery.getInt("PrimaryRowidNotFromPaper");
                              Integer numberOfLoop  =    eQuery.getInt("NumberOfLoop");

    
    exceptionHolder.add(new TableViewExceptionMakerDataModel(ordinaryId,realRowIdPrimaryKey,numberOfLoop ));
    
    
}//end of while loop
 

//smptcontaner.addAll(smpt,smpt1,smpt2,smpt3,smpt4,smpt5,smpt6,smpt7,smpt8,smpt9);
                                         tableView.setItems(exceptionHolder);


                            }  
 catch (SQLException ex) {
                             Logger.getLogger(BackGroundTaskTable.class.getName()).log(Level.SEVERE, null, ex);
                             }
                                
                                
//   }
               
        return exceptionHolder;
                      
       }
      
          
 
 


                public Statement connectionDriverStatementGetter(){
                  return st;
                }

    @Override
    protected ObservableList<TableViewExceptionMakerDataModel> call() throws Exception {
//          protected ObservableList<TableColumnDataPop> call() throws Exception {

    
        return listDataloader();
    }

}
                         
        
         

    
    
 

