/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoreExceptionForNoOfClassesPerRoom;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.Callback;

/**
 *
 * @author Martins
 */
public class TableViewCenteAlignmentCellEditedForStringCol {
    
    
//    public TableViewCenteAlignmentCellEditedForStringCol(){
//            
//                    Callback<TableColumn, TableCell> cellFactory =
//             new Callback<TableColumn, TableCell>() {
//                 public TableCell call(TableColumn p) {
//                    return new IntegerEditingCell();
//                 }
//             };
//    }
}





    class StringEditingCell extends TableCell<TableViewExceptionMakerDataModel, String> {
        private TextArea textField;
        public StringEditingCell() {
        }
        @Override
        public void startEdit() {
            if (!isEmpty()) {
                super.startEdit();
                createTextField();
                setText(null);
                setGraphic(textField);
                textField.selectAll();
                            }
        }
              
        
       
        @Override
        public void cancelEdit() {
            super.cancelEdit();
            setText((String) getItem());
            setGraphic(null);
        }
        @Override
        public void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            if (empty) {
                setText(null);
                setGraphic(null);
            } else {
                if (isEditing()) {
                    if (textField != null) {
                        textField.setText(getString());
                    }
                    setText(null);
                    setGraphic(textField);
                } else {
                    setText(getString());
                    setGraphic(null);
                }
            }
        }
        private void createTextField() {
            textField = new TextArea(getString());
            textField.setStyle("-fx-font-alignment:center");
            textField.setMinWidth(this.getWidth() - this.getGraphicTextGap()* 2);
            textField.focusedProperty().addListener(new ChangeListener<Boolean>(){
                @Override
                public void changed(ObservableValue<? extends Boolean> arg0, 
                    Boolean arg1, Boolean arg2) {
                        if (!arg2) {  
                            commitEdit(textField.getText());
                        }
                        }
                });
            }
            
                    private String getString() {
            return getItem() == null ? "" : getItem().toString();
        }
    
                    
                    
      public static void TextCenterAlignmentCellEditedString(TableColumn ... col){
      
              Callback<TableColumn, TableCell> cellFactory =
             new Callback<TableColumn, TableCell>() {
                 public TableCell call(TableColumn p) {
                    return new StringEditingCell();
                 }
             };
              
              for(TableColumn sd:col){
                 sd.setCellFactory(cellFactory);
              }
              
      }
}
        