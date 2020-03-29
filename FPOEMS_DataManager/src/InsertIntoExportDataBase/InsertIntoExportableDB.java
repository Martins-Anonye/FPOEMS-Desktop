/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InsertIntoExportDataBase;

import DBConnector.MyDbDriverConnector;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Martins
 */
public class InsertIntoExportableDB {
    Statement stmt;
   static String importedDBname;
   static String tablename;

    public String getImportedDBname() {
        return importedDBname;
    }

    public static void setImportedDBname(String importedDBnam) {
        importedDBname = importedDBnam;
    }

    public String getTablename() {
        return tablename;
    }

    public static void setTablename(String tablenam) {
      tablename = tablenam;
    }
    
    public InsertIntoExportableDB(Integer realidprimarykey, 
  String sn , String cosTitleandLecturer ,  String lecturer ,  String coscod , 
  String  myclass,  String dept,  String classsize,   String venue , String time, String  date,  String exammode){
    
      // String s =String.format("insert into "+getTablename()+" VALUES(%d,'%s','%s','%s','%s','%s','%s',%s,'%s',%s,%s,%s)",realidprimarykey,sn,cosTitleandLecturer,lecturer,coscod,myclass,dept,classsize,venue,time,date,exammode);
       String s =String.format("insert into "+getTablename()+" VALUES(%d,'%s','%s','%s','%s','%s','%s',%s,'%s','%s','%s','%s')",realidprimarykey,sn,cosTitleandLecturer,lecturer,coscod,myclass,dept,classsize,venue,time,date,exammode);

    
                                                   
                   
                  try {                              
                    
                    MyDbDriverConnector myDbDriverConnector = new  MyDbDriverConnector();
                    String dbfile ="cbtmode.db";

                           myDbDriverConnector.setDatabasename(dbfile);
                          stmt =  myDbDriverConnector.DBDriverStatementLoader();
                         // System.out.println(s);
                          stmt.executeUpdate(s);
//                    DBDriverStatementLoader.executeUpdate("commit");
                  } catch (SQLException ex) {
                      Logger.getLogger(InsertIntoExportableDB.class.getName()).log(Level.SEVERE, null, ex);
                  }
    }
}
