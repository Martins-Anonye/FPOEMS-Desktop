/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreExceptionForNoOfClassesPerRoom;

import javafx.collections.ObservableList;
import javafx.concurrent.Service;
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
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 *
 * @author Martins
 */
public class ExceptionThreadServiceMaker  extends Service<ObservableList<TableViewExceptionMakerDataModel>>{

            
    @Override
      protected Task<ObservableList<TableViewExceptionMakerDataModel>> createTask()
                    {
//                        
//                       AutoCompSarchTabVw fg = new AutoCompSarchTabVw();
                                      BackGroundTaskTable val = new BackGroundTaskTable();

                       
//                       fg.getStringVal(getColn());
//                        generic service ...Task<ObservableList<String>> == SimilerProQueryProTopicData extends Task<ObservableList<String>>  
                    return val;
                    }
                    }
    
    
    

