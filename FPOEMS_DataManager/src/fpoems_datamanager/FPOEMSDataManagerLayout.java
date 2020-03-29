package fpoems_datamanager;

import DOTheJob.QuerryTheImportedDataBase;
import DatabaseFileChooser.DatabaseFileChooser;
import static DatabaseFileChooser.DatabaseFileChooser.chooseFile;
import MoreExceptionForNoOfClassesPerRoom.ExceptionForNoOfDepartMentPerRoomBase;
import static fpoems_datamanager.FPOEMS_DataManager.getPrimaryStage;
import java.io.File;
import javafx.scene.image.*;
import javafx.geometry.*;
import javafx.scene.text.*;
import java.lang.*;
import java.util.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.DirectoryChooser;

public  class FPOEMSDataManagerLayout extends BorderPane {
            DirectoryChooser dir_chooser = new DirectoryChooser(); 
 static  File file;
    protected final Label titleLable;
    protected final HBox hBox;
    protected final VBox vBox;
    protected final VBox vBox0;
    protected final HBox hBox0;
    protected final TextField textField0;
    protected final Button button;
    protected final TextArea textArea;
    protected final VBox vBox1;
    protected final TextField textField1;
    protected final ImageView imageView;
    protected final HBox hBox1;
    protected final TextField textField2;
    protected final TextField textField3;
    protected final HBox hBox2;
    protected final TextField textField4;
    protected final TextField textField5;
    protected final HBox hBox3;
    protected final Button button0;
    protected final VBox vBox2;
    protected final HBox hBox4;
    protected final TextField textField6;
    protected final VBox vBox3;
    protected final RadioButton radioButton;
    protected final RadioButton radioButton0;
    protected final HBox hBox5;
    protected final TextField textField7;
    protected final Button button1;
    protected final VBox vBox4;
    protected final TextField textField8;
    protected final HBox hBox6;
    protected final TextField textField9;
    protected final VBox vBox5;
    protected final Button button2;
    protected final TextArea textArea0;
    protected final HBox hBox7;
    protected final TextField textField10;
    protected final Button button3;
public static  RadioButton radioButtondetectauto = new RadioButton();
  public static    RadioButton  radioButtondetectmanul = new RadioButton();
      Label autolable = new Label("Auto  Detect Pop Venue Settings: Using DOT");
 public      static         TextField myTextFiledAutodetect = new TextField();
 public static Integer selectordetector =1;// at defeault its in Auoto  Detect
 public static   TextField rowdiferentPOP = new TextField();
 public static   TextField rowdiferentCBT = new TextField();
    public FPOEMSDataManagerLayout() {
      this.getStylesheets().add(this.getClass().getResource("/css/StylemyFPODataManager.css").toExternalForm());
//this.getStylesheets().add(this.getClass().getResource("/css/StylemyFPODataManager.css").toExternalForm());
        titleLable = new Label();
        hBox = new HBox();
        vBox = new VBox();
        vBox0 = new VBox();
        hBox0 = new HBox();
        textField0 = new TextField();
        button = new Button();
        textArea = new TextArea();
        
        vBox1 = new VBox();
        textField1 = new TextField();
        imageView = new ImageView(this.getClass().getResource("/images/myimage.jpg").toExternalForm());
        hBox1 = new HBox();
        textField2 = new TextField();
        textField3 = new TextField();
        hBox2 = new HBox();
        textField4 = new TextField();
        textField5 = new TextField();
        hBox3 = new HBox();
        button0 = new Button();
        vBox2 = new VBox();
        hBox4 = new HBox();
        textField6 = new TextField();
        vBox3 = new VBox();
        radioButton = new RadioButton();
        radioButton0 = new RadioButton();
        final ToggleGroup group = new ToggleGroup();
        radioButton0.setToggleGroup(group);
        radioButton.setToggleGroup(group);
        
         radioButton.setMnemonicParsing(false);
        radioButton.setText("Creat new database");
        radioButton.setSelected(true);
        radioButton.setTextFill(javafx.scene.paint.Color.valueOf("#1316d3"));
        radioButton.setFont(new Font("Arial Narrow Bold Italic", 22.0));

        radioButton0.setMnemonicParsing(false);
        radioButton0.setText("Use the existing database");
        radioButton0.setTextFill(javafx.scene.paint.Color.valueOf("#321fdd"));
        radioButton0.setFont(new Font("Arial Narrow Bold Italic", 22.0));

          
        
      
       
       
        ToggleGroup groupdetect = new ToggleGroup();
        
        radioButtondetectauto.setToggleGroup(groupdetect);
        radioButtondetectmanul.setToggleGroup(groupdetect);
        
         radioButtondetectmanul.setMnemonicParsing(false);
        radioButtondetectmanul.setText("Manual Detect POP Venue ");
        radioButtondetectauto.setSelected(true);
        radioButtondetectmanul.setTextFill(javafx.scene.paint.Color.valueOf("red"));
        radioButtondetectmanul.setFont(new Font("Arial Narrow Bold Italic", 15.0));

        radioButtondetectauto.setMnemonicParsing(false);
        radioButtondetectauto.setText("Auto Detect POP Venue Using DOT");
        radioButtondetectauto.setTextFill(javafx.scene.paint.Color.valueOf("red"));
        radioButtondetectauto.setFont(new Font("Arial Narrow Bold Italic", 15.0));

        
        
        
                                groupdetect.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
                        @Override
                        public void changed(ObservableValue<? extends Toggle> ov,
                        Toggle old_toggle, Toggle new_toggle) {
                      
                       
                        
                          if(new_toggle ==radioButtondetectauto ){
                             
                             
                                 selectordetector=1;

                         System.out.println("i selected");
                         }
                         
                         if(new_toggle ==radioButtondetectmanul ){
                             
                             
                                 selectordetector=2;

                         System.out.println("2 selected");
                         }
                         
                         
                        }


                              });
                                
                                
                 

        hBox5 = new HBox();
        textField7 = new TextField();
        button1 = new Button();
        vBox4 = new VBox();
        textField8 = new TextField();
        hBox6 = new HBox();
        textField9 = new TextField();
        vBox5 = new VBox();
        button2 = new Button();
        textArea0 = new TextArea();
        hBox7 = new HBox();
        textField10 = new TextField();
        button3 = new Button();
        
        
         TextField tablenameenter = new TextField();
         TextField noOfDeptInOneRoom = new TextField();
        
        
        

        setId("rootborderpan");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(650.0);
        setPrefWidth(1000.0);

        BorderPane.setAlignment(titleLable, javafx.geometry.Pos.CENTER);
        titleLable.setAlignment(javafx.geometry.Pos.CENTER);
       
        titleLable.setId("titletextfield");
        titleLable.setText("FPOEMS DATA MANAGER");
        titleLable.setFont(new Font("Arial Black", 33.0));
        setTop(titleLable);

        BorderPane.setAlignment(hBox, javafx.geometry.Pos.CENTER);
        hBox.setAlignment(javafx.geometry.Pos.CENTER);

        HBox.setHgrow(vBox, javafx.scene.layout.Priority.ALWAYS);
        vBox.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        vBox.setPrefHeight(422.0);
        vBox.setPrefWidth(298.0);
        vBox.setSpacing(10.0);

        vBox0.setId("vboxofimpordatabase");
        vBox0.setSpacing(10.0);

        textField0.setAlignment(javafx.geometry.Pos.TOP_CENTER);
        textField0.setEditable(false);
        textField0.setMinHeight(USE_PREF_SIZE);
        textField0.setMinWidth(USE_PREF_SIZE);
        textField0.setPrefHeight(50.0);
        textField0.setPrefWidth(50.0);
        textField0.setText("1");
        textField0.setFont(new Font("System Bold Italic", 23.0));

        button.setAlignment(javafx.geometry.Pos.CENTER);
        button.setMnemonicParsing(false);
        button.setPrefHeight(50.0);
        button.setPrefWidth(238.0);
        button.setText("Import   Database");
        textArea.setWrapText(true);
        button.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
               
          
          
                                          chooseFile(textArea);

          
          
          
          }
      });
        
        
        
        
        button.setTextFill(javafx.scene.paint.Color.valueOf("#3611bc"));
        button.setFont(new Font("Arial Narrow Bold Italic", 22.0));

        textArea.setEditable(false);
        textArea.setMaxWidth(USE_PREF_SIZE);
        textArea.setMinWidth(USE_PREF_SIZE);
        textArea.setPrefHeight(61.0);
        textArea.setPrefWidth(289.0);
        vBox0.setPadding(new Insets(10.0, 0.0, 20.0, 0.0));

        vBox1.setAlignment(javafx.geometry.Pos.CENTER);
        vBox1.setPrefHeight(197.0);
        vBox1.setPrefWidth(279.0);

        textField1.setAlignment(javafx.geometry.Pos.CENTER);
        textField1.setEditable(false);
        textField1.setMaxHeight(USE_PREF_SIZE);
        textField1.setMaxWidth(USE_PREF_SIZE);
        textField1.setMinHeight(USE_PREF_SIZE);
        textField1.setMinWidth(USE_PREF_SIZE);
        textField1.setPrefHeight(50.0);
        textField1.setPrefWidth(200.0);
        textField1.setText("About Developer");
        textField1.setFont(new Font("System Bold", 15.0));

        imageView.setFitHeight(166.0);
        imageView.setFitWidth(246.0);
        imageView.setId("aboutdeviimage");
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);

        hBox1.setMaxHeight(USE_PREF_SIZE);
        hBox1.setMaxWidth(USE_PREF_SIZE);
        hBox1.setMinHeight(USE_PREF_SIZE);
        hBox1.setMinWidth(USE_PREF_SIZE);
        hBox1.setPrefHeight(25.0);
        hBox1.setPrefWidth(274.0);

        textField2.setEditable(false);
        textField2.setPrefHeight(25.0);
        textField2.setPrefWidth(58.0);
        textField2.setText("Contact :");
        HBox.setMargin(textField2, new Insets(0.0, 10.0, 0.0, 0.0));

        textField3.setEditable(false);
        textField3.setText("08132329272");

        hBox2.setLayoutX(10.0);
        hBox2.setLayoutY(226.0);
        hBox2.setMaxHeight(USE_PREF_SIZE);
        hBox2.setMaxWidth(USE_PREF_SIZE);
        hBox2.setMinHeight(USE_PREF_SIZE);
        hBox2.setMinWidth(USE_PREF_SIZE);
        hBox2.setPrefHeight(25.0);
        hBox2.setPrefWidth(282.0);

        textField4.setEditable(false);
        textField4.setPrefHeight(25.0);
        textField4.setPrefWidth(55.0);
        textField4.setText("Email :");
        HBox.setMargin(textField4, new Insets(0.0, 10.0, 0.0, 10.0));

        textField5.setEditable(false);
        textField5.setLayoutX(10.0);
        textField5.setLayoutY(10.0);
        textField5.setPrefHeight(25.0);
        textField5.setPrefWidth(202.0);
        textField5.setText("ugomartinsdegreat@gmail.com");
        VBox.setMargin(hBox2, new Insets(10.0, 0.0, 0.0, 0.0));

        hBox3.setAlignment(javafx.geometry.Pos.CENTER_RIGHT);
        hBox3.setLayoutX(10.0);
        hBox3.setLayoutY(226.0);
        hBox3.setMaxHeight(USE_PREF_SIZE);
        hBox3.setMaxWidth(USE_PREF_SIZE);
        hBox3.setMinHeight(USE_PREF_SIZE);
        hBox3.setMinWidth(USE_PREF_SIZE);
        hBox3.setPrefHeight(50.0);
        hBox3.setPrefWidth(269.0);

        button0.setId("morebtn");
        button0.setMnemonicParsing(false);
        button0.setText("MORE");
        button0.setTextFill(javafx.scene.paint.Color.valueOf("#2e1ccd"));
        button0.setFont(new Font("Arial Narrow Bold", 14.0));
        VBox.setMargin(hBox3, new Insets(10.0, 0.0, 0.0, 0.0));

        BorderPane.setAlignment(vBox2, javafx.geometry.Pos.CENTER);
        HBox.setHgrow(vBox2, javafx.scene.layout.Priority.ALWAYS);
        vBox2.setAlignment(javafx.geometry.Pos.CENTER);
        vBox2.setPrefHeight(422.0);
        vBox2.setPrefWidth(527.0);
        vBox2.setSpacing(10.0);

        hBox4.setPrefHeight(100.0);
        hBox4.setPrefWidth(200.0);
        hBox4.setSpacing(10.0);

        textField6.setEditable(false);
        textField6.setPrefHeight(50.0);
        textField6.setPrefWidth(50.0);
        textField6.setText("2");
        textField6.setFont(new Font("Arial Black", 22.0));

       
        hBox5.setPrefHeight(100.0);
        hBox5.setPrefWidth(200.0);
        hBox5.setSpacing(10.0);

        textField7.setEditable(false);
        textField7.setMaxHeight(USE_PREF_SIZE);
        textField7.setMaxWidth(USE_PREF_SIZE);
        textField7.setMinHeight(USE_PREF_SIZE);
        textField7.setMinWidth(USE_PREF_SIZE);
        textField7.setPrefHeight(50.0);
        textField7.setPrefWidth(50.0);
        textField7.setText("3");
        textField7.setFont(new Font("Arial Black", 22.0));

        button1.setMnemonicParsing(false);
        button1.setText("START DATA MANAGER");
        button1.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
              
             // String file1 = this.getClass().getResource(textArea.getText()).toExternalForm();
             System.out.println("Starting FPOEMS  DataManager "+DatabaseFileChooser.filename);
          QuerryTheImportedDataBase.setImportedDBname(DatabaseFileChooser.filename);
          QuerryTheImportedDataBase.setTablenamefromImportedDB(tablenameenter.getText());
          Integer noOfDeptInOneRoomm = Integer.parseInt(noOfDeptInOneRoom.getText());
                  QuerryTheImportedDataBase.setTotalNoOfClassFromTextField(noOfDeptInOneRoomm);
          new QuerryTheImportedDataBase();
          
          }
      });
        button1.setTextFill(javafx.scene.paint.Color.valueOf("#2a1bc9"));
        button1.setFont(new Font("Arial Narrow Bold Italic", 18.0));

        vBox4.setSpacing(10.0);

        textField8.setAlignment(javafx.geometry.Pos.CENTER);
        textField8.setEditable(false);
        textField8.setMaxHeight(USE_PREF_SIZE);
        textField8.setMaxWidth(USE_PREF_SIZE);
        textField8.setMinHeight(USE_PREF_SIZE);
        textField8.setMinWidth(USE_PREF_SIZE);
        textField8.setPrefHeight(48.0);
        textField8.setPrefWidth(314.0);
        textField8.setText("EXPORT WORK");
        textField8.setFont(new Font("Arial Black", 22.0));

        hBox6.setPrefHeight(100.0);
        hBox6.setPrefWidth(200.0);
        hBox6.setSpacing(10.0);

        textField9.setEditable(false);
        textField9.setMinHeight(USE_PREF_SIZE);
        textField9.setMinWidth(USE_PREF_SIZE);
        textField9.setPrefHeight(50.0);
        textField9.setPrefWidth(50.0);
        textField9.setText("4");
        textField9.setFont(new Font("Arial Black", 21.0));

        vBox5.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        vBox5.setPrefHeight(100.0);
        vBox5.setPrefWidth(293.0);

        button2.setMnemonicParsing(false);
        button2.setPrefHeight(25.0);
        button2.setPrefWidth(236.0);
        button2.setText(" Choose Destination Directory");
        button2.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
         directoryChooserMaker();
          
          
          }
      });
        button2.setTextFill(javafx.scene.paint.Color.valueOf("#5211dd"));
        button2.setFont(new Font("Arial Narrow Bold Italic", 18.0));

        textArea0.setEditable(false);
        textArea0.setPrefHeight(200.0);
        textArea0.setWrapText(true);
        textArea0.setPrefWidth(200.0);
        textArea0.setVisible(false);
        textArea.setVisible(false);
        hBox6.setOpaqueInsets(new Insets(0.0));

        hBox7.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
        hBox7.setPrefHeight(100.0);
        hBox7.setPrefWidth(200.0);

        textField10.setAlignment(javafx.geometry.Pos.CENTER);
        textField10.setEditable(false);
        textField10.setPrefHeight(50.0);
        textField10.setPrefWidth(50.0);
        textField10.setText("5");
        textField10.setFont(new Font("Arial Black", 22.0));

        button3.setMnemonicParsing(false);
        button3.setText("EXPORT");
        button3.setTextFill(javafx.scene.paint.Color.valueOf("#361bc2"));
        HBox.setMargin(button3, new Insets(0.0, 0.0, 0.0, 100.0));
        button3.setFont(new Font("Arial Narrow Bold Italic", 28.0));
        vBox2.setPadding(new Insets(0.0, 0.0, 0.0, 30.0));
        setCenter(hBox);

        hBox0.getChildren().add(textField0);
        hBox0.getChildren().add(button);
        vBox0.getChildren().add(hBox0);
        vBox0.getChildren().add(textArea);
        
       Label manuallable = new Label("Manual Detect Pop Venue Settings");
        manuallable.setPrefHeight(20);
        manuallable.setId("manualdetectlebel");
        
         Label dbrowsetting = new Label("Imported DB Row Settings");
        dbrowsetting.setPrefHeight(20);
        dbrowsetting.setId("dbrowsetting");
        
        tablenameenter.setPromptText("Enter Table Name");
         tablenameenter.setAlignment(Pos.CENTER);
        tablenameenter.setMaxWidth(280);
        tablenameenter.setFont(Font.font(18));
        
        rowdiferentPOP.setPromptText("Row Diff Between Costitle & Coslecture  for POP");
         rowdiferentPOP.setAlignment(Pos.CENTER);
        rowdiferentPOP.setMaxWidth(280);
        rowdiferentPOP.setFont(Font.font(10));
        
         rowdiferentCBT.setPromptText("Row Diff Between Costitle & Coslecture CBT");
         rowdiferentCBT.setAlignment(Pos.CENTER);
        rowdiferentCBT.setMaxWidth(280);
        rowdiferentCBT.setFont(Font.font(10));
        
        noOfDeptInOneRoom.setPromptText("No Of Dept In One Room");
         noOfDeptInOneRoom.setAlignment(Pos.CENTER);
        noOfDeptInOneRoom.setMaxHeight(280);
        noOfDeptInOneRoom.setMaxWidth(280);
        noOfDeptInOneRoom.setFont(Font.font(18));
     //   ExceptionForNoOfDepartMentPerRoomBase
        Button moreExceptionSettings = new Button("More Settings for Manual Detection");
        moreExceptionSettings.setId("moreExceptionSettings");
        moreExceptionSettings.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent event) {
          
          
          new ExceptionForNoOfDepartMentPerRoomBase();
          }
      });
        
         
        
        VBox tablevbox = new VBox(dbrowsetting,tablenameenter,rowdiferentPOP,rowdiferentCBT,radioButtondetectauto,radioButtondetectmanul,manuallable,noOfDeptInOneRoom,moreExceptionSettings);
        tablevbox.setSpacing(10);
        
        
         vBox0.getChildren().add(tablevbox);
        vBox.getChildren().add(vBox0);
        vBox1.getChildren().add(textField1);
        vBox1.getChildren().add(imageView);
        hBox1.getChildren().add(textField2);
        hBox1.getChildren().add(textField3);
        vBox1.getChildren().add(hBox1);
        hBox2.getChildren().add(textField4);
        hBox2.getChildren().add(textField5);
        vBox1.getChildren().add(hBox2);
        hBox3.getChildren().add(button0);
        vBox1.getChildren().add(hBox3);
        
        
        
        autolable.setPrefHeight(20);
        autolable.setId("autodetectlebel");
        myTextFiledAutodetect.setPromptText("DOT at default");
        myTextFiledAutodetect.setAlignment(Pos.CENTER);
        VBox autodetect = new VBox(autolable,myTextFiledAutodetect);
        autodetect.setSpacing(10);
        vBox.getChildren().add(autodetect);// formall locate of dev
        hBox.getChildren().add(vBox);
               setRight(vBox1);
        
        hBox4.getChildren().add(textField6);
        vBox3.getChildren().add(radioButton);
        vBox3.getChildren().add(radioButton0);
        hBox4.getChildren().add(vBox3);
        vBox2.getChildren().add(hBox4);
        hBox5.getChildren().add(textField7);
        hBox5.getChildren().add(button1);
        vBox2.getChildren().add(hBox5);
        vBox4.getChildren().add(textField8);
        hBox6.getChildren().add(textField9);
        vBox5.getChildren().add(button2);
        vBox5.getChildren().add(textArea0);
        hBox6.getChildren().add(vBox5);
        vBox4.getChildren().add(hBox6);
        vBox2.getChildren().add(vBox4);
        hBox7.getChildren().add(textField10);
        hBox7.getChildren().add(button3);
        vBox2.getChildren().add(hBox7);
        hBox.getChildren().add(vBox2);

    }
    
    void directoryChooserMaker(){
    
    
    
    
    
                    // get the file selected 
                   file = dir_chooser.showDialog(getPrimaryStage()); 
                    if (file != null) { 
                       textArea0.setText(file.getAbsolutePath() + "  selected"); 
                        textArea0.setVisible(true);
                     }
                    else{
                       textArea0.setText( "  No Destination selected");
                    textArea0.setVisible(true);
                    }
    
    
    }
    
}
