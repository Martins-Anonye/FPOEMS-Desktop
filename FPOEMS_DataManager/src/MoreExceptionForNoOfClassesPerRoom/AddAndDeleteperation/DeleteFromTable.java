/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreExceptionForNoOfClassesPerRoom.AddAndDeleteperation;

import MoreExceptionForNoOfClassesPerRoom.BackGroundTaskTable;
import static MoreExceptionForNoOfClassesPerRoom.StaticMakerForTable.sdp;
import static MoreExceptionForNoOfClassesPerRoom.StaticMakerForTable.tableView;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;

/**
 *
 * @author Martins
 */
public class DeleteFromTable {
    ResultSet eQuery ;
            
            public  DeleteFromTable( Integer rowid){
             
    String s = "delete from SpecilaLoopingAndDuplicate where Rowid="+rowid;
                                            
        try {
                  //                                            String.format("select * from projectdec");
//
                  Integer executeUpdate = BackGroundTaskTable.DBDriverStatementLoader().executeUpdate(s);
        
        
        
        if(executeUpdate !=0){
        tableView.refresh();
                    sdp.reset();
                    sdp.start();
                     Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Row deleted");
            alert.setTitle("Successfull");
            alert.show();
        }
           
      else  {
         Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Check the row \n and try again");
            alert.setTitle("Error Message");
            alert.show();
        
        }
        
        
        
        
        
        } catch (SQLException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(" check the row \n and try again");
            alert.setTitle("Error Message");
            alert.show();
            Logger.getLogger(DeleteFromTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
            }
}
