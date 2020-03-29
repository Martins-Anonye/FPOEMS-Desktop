/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreExceptionForNoOfClassesPerRoom;

import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Martins
 */
public class TableViewExceptionMakerDataModel {
     SimpleIntegerProperty primaryRowIdNotFromPaper = new SimpleIntegerProperty();
     SimpleIntegerProperty numberofLoopPerDepartment = new SimpleIntegerProperty();

         SimpleIntegerProperty ordinaryId = new SimpleIntegerProperty();

         
         
         
    public TableViewExceptionMakerDataModel(Integer primaryRowIdNotFromPaper, Integer numberofLoopPerDepartment, Integer ordinaryId) {
        this.primaryRowIdNotFromPaper.set(primaryRowIdNotFromPaper);
        this.numberofLoopPerDepartment .set(numberofLoopPerDepartment);
        this.ordinaryId.set(ordinaryId);
    }

         
         
         
         
    public Integer getOrdinaryId() {
        return ordinaryId.get();
    }

    public void setOrdinaryId(Integer ordinaryId) {
        this.ordinaryId.set(ordinaryId);
    }

     
     
     
    public Integer getPrimaryRowIdNotFromPaper() {
        return primaryRowIdNotFromPaper.get();
    }

    public void setPrimaryRowIdNotFromPaper(Integer primaryRowIdNotFromPaper) {
        this.primaryRowIdNotFromPaper.set( primaryRowIdNotFromPaper);
    }

    public Integer getNumberofLoopPerDepartment() {
        return numberofLoopPerDepartment.get();
    }

    public void setNumberofLoopPerDepartment(Integer numberofLoopPerDepartment) {
        this.numberofLoopPerDepartment.set(numberofLoopPerDepartment);
    }
     
    
}
