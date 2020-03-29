/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseFileChooser;

import static fpoems_datamanager.FPOEMS_DataManager.getPrimaryStage;
import java.io.File;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;

/**
 *
 * @author Martins
 */


import java.awt.Desktop;
import java.io.File;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

/**
 *
 * @author Martins
 */
public  class DatabaseFileChooser {
   
 public static  String filename;
    final  static FileChooser fileChooser = new FileChooser();
    
    public static    String  chooseFile(TextArea te) {
       
        fileChooser.setSelectedExtensionFilter(new FileChooser.ExtensionFilter(".db",".sqllite",".db1",".db2",".db3"));
        
               
File file = fileChooser.showOpenDialog(getPrimaryStage());


if (file != null) {
    String fileres = file.getAbsolutePath().toString();

    if(fileres.contains(".db") || fileres.contains(".sqllite") || fileres.contains(".db1") || fileres.contains(".db2") || fileres.contains(".db3")){
    
    te.setText("Db file-name-selected    "+fileres);
        
te.setVisible(true);

filename =fileres;
        return fileres;
        
    }
    
    else{
    
    Alert notExcellFile = new Alert(Alert.AlertType.ERROR);
    
    notExcellFile.setContentText("pls select a Database File and try again");
    notExcellFile.setTitle("not a valid file");
    notExcellFile.show();
    return null;
    }

}
else{
 Alert notExcellFile = new Alert(Alert.AlertType.ERROR);
    
    notExcellFile.setContentText("pls select  a Database File");
    notExcellFile.setTitle("not a valid file");
    notExcellFile.show();
return null;

}
       
        
    }


}      