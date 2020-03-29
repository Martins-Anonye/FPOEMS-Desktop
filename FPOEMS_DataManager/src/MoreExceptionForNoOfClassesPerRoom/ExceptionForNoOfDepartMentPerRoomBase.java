package MoreExceptionForNoOfClassesPerRoom;

import MoreExceptionForNoOfClassesPerRoom.AddAndDeleteperation.AddOperation;
import MoreExceptionForNoOfClassesPerRoom.AddAndDeleteperation.DeleteFromTable;
import javafx.scene.text.*;
import javafx.scene.paint.*;
import java.lang.*;
import java.util.*;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public  class ExceptionForNoOfDepartMentPerRoomBase extends BorderPane implements StaticMakerForTable{
static Stage stagegui;

    protected final VBox vBox;
    protected final Label label;
    protected final Label label0;
    protected final VBox vBox0;
    protected final VBox vBox1;
    protected final TextArea textArea;
    protected final TextField textField;
        protected final TextField idtextField;

    protected final TextField textField0;
    protected final Button button;
    protected final Separator separator;
    protected final VBox vBox2;
    protected final TextArea textArea0;
    protected final TextField textField1;
    protected final Button button0;
    
 protected final TableColumn<TableViewExceptionMakerDataModel,Integer> tableColumn  = new TableColumn();
    protected final TableColumn<TableViewExceptionMakerDataModel,Integer> tableColumn0  = new TableColumn();
    protected final TableColumn<TableViewExceptionMakerDataModel,Integer> tableColumn1  = new TableColumn();
    public ExceptionForNoOfDepartMentPerRoomBase() {

        vBox = new VBox();
        label = new Label();
        label0 = new Label();
        vBox0 = new VBox();
        vBox1 = new VBox();
        textArea = new TextArea();
        textField = new TextField();
                idtextField = new TextField();

        textField0 = new TextField();
        button = new Button();
        separator = new Separator();
        vBox2 = new VBox();
        textArea0 = new TextArea();
        textField1 = new TextField();
        button0 = new Button();
      

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(467.0);
        setPrefWidth(820.0);

        BorderPane.setAlignment(vBox, javafx.geometry.Pos.CENTER);
        vBox.setPrefHeight(84.0);
        vBox.setPrefWidth(600.0);
        vBox.setSpacing(10.0);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setPrefHeight(36.0);
        label.setPrefWidth(837.0);
        label.setText("Primary Row Id Exception For Number Of  Department Per Room");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setFont(new Font("System Bold Italic", 20.0));

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label0.setPrefHeight(38.0);
        label0.setPrefWidth(826.0);
        label0.setText("Id of Venue That needs Special Duplicat");
        label0.setFont(new Font("System Bold", 21.0));
        setTop(vBox);

        BorderPane.setAlignment(vBox0, javafx.geometry.Pos.CENTER);
        vBox0.setPrefHeight(383.0);
        vBox0.setPrefWidth(210.0);

        vBox1.setAlignment(javafx.geometry.Pos.CENTER);
        vBox1.setPrefHeight(200.0);
        vBox1.setPrefWidth(100.0);
        vBox1.setSpacing(10.0);

        textArea.setEditable(false);
        textArea.setPrefHeight(51.0);
        textArea.setPrefWidth(210.0);
        textArea.setText("Add New  Row Primary Id and Number of Dupicate");
        textArea.setWrapText(true);
        textArea.setFont(new Font("System Bold", 12.0));

        textField.setAlignment(javafx.geometry.Pos.CENTER);
        textField.setPromptText("Primary Row Id");
        textField.setFont(new Font("Arial Bold Italic", 12.0));
idtextField.setAlignment(javafx.geometry.Pos.CENTER);
        idtextField.setPromptText("Row Id");
        idtextField.setFont(new Font("Arial Bold Italic", 12.0));

        textField0.setAlignment(javafx.geometry.Pos.CENTER);
        textField0.setPromptText("Number of Loop ");
        textField0.setFont(new Font("System Bold Italic", 15.0));

        button.setMnemonicParsing(false);
        button.setText("ADD");
        
                button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Integer idval = Integer.parseInt(idtextField.getText());
                                Integer primary = Integer.parseInt(textField.getText());
                              Integer loopbo = Integer.parseInt(  textField0.getText());

new AddOperation(idval, primary, loopbo);
idtextField.clear();
textField.clear();
textField0.clear();

            }
        });

        separator.setMaxHeight(USE_PREF_SIZE);
        separator.setMinHeight(USE_PREF_SIZE);
        separator.setPrefHeight(12.0);
        separator.setPrefWidth(200.0);

        vBox2.setAlignment(javafx.geometry.Pos.CENTER);
        vBox2.setPrefHeight(200.0);
        vBox2.setPrefWidth(100.0);
        vBox2.setSpacing(10.0);

        textArea0.setEditable(false);
        textArea0.setPrefHeight(31.0);
        textArea0.setPrefWidth(210.0);
        textArea0.setText("Delete row From the Exception");
        textArea0.setFont(new Font("Arial Bold", 12.0));

        textField1.setAlignment(javafx.geometry.Pos.CENTER);
        textField1.setPromptText("Enter Row Number");

        button0.setMnemonicParsing(false);
        button0.setText("Delete");
        button0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
       Integer notodelRow =   Integer.parseInt( textField1.getText());
            new DeleteFromTable(notodelRow);
            textField1.clear();
            }
        });
        
        
        setLeft(vBox0);

        BorderPane.setAlignment(tableView, javafx.geometry.Pos.CENTER);
        tableView.setPrefHeight(383.0);
        tableView.setPrefWidth(461.0);

        tableColumn.setPrefWidth(244.0);
        tableColumn.setText("Primary Row Id( Not From Paper)");

        tableColumn0.setMinWidth(0.0);
        tableColumn0.setPrefWidth(254.0);
        tableColumn0.setText("Number of Loop");
        tableColumn1.setMinWidth(0.0);
        tableColumn1.setPrefWidth(254.0);
        tableColumn1.setText("ID");
        setCenter(tableView);

        vBox.getChildren().add(label);
        vBox.getChildren().add(label0);
        vBox1.getChildren().add(textArea);
        HBox hbox = new HBox(idtextField,textField);
        hbox.setSpacing(10);
        vBox1.getChildren().add(hbox);
        vBox1.getChildren().add(textField0);
        vBox1.getChildren().add(button);
        vBox0.getChildren().add(vBox1);
        vBox0.getChildren().add(separator);
        vBox2.getChildren().add(textArea0);
        vBox2.getChildren().add(textField1);
        vBox2.getChildren().add(button0);
        vBox0.getChildren().add(vBox2);
        tableView.getColumns().add(tableColumn1);
        tableView.getColumns().add(tableColumn);
        tableView.getColumns().add(tableColumn0);

        
        
        tableView.getStylesheets().add(this.getClass().getResource("/css/SearchStyleOperation.css").toExternalForm());
         
tableView.getStyleClass().add("searchstyle");


      
                 tableColumn0.setCellValueFactory(new PropertyValueFactory<TableViewExceptionMakerDataModel,Integer>("ordinaryId"));


        tableColumn1.setCellValueFactory(new PropertyValueFactory<TableViewExceptionMakerDataModel,Integer>("primaryRowIdNotFromPaper"));
         tableColumn.setCellValueFactory(new PropertyValueFactory<TableViewExceptionMakerDataModel,Integer>("numberofLoopPerDepartment"));
     sdp.start();
         sdp.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
    @Override
    public void handle(WorkerStateEvent event) {
   
//          tableViewsearch.setItems(sdp.getValue());
                                                   tableView.setItems(sdp.getValue());

    }
});
         
         
         Scene myScene = new Scene(this);
         stagegui.setScene(myScene);
         stagegui.show();
    }
    
    
     public static void exceptionStageMaker(Stage stageguigero, Stage myparent){
        stagegui=stageguigero;

//    stagegui.initModality(Modality.WINDOW_MODAL);
  stagegui.initOwner(myparent);
//    
    }
}
