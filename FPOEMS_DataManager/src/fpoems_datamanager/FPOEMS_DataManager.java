/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpoems_datamanager;

import MoreExceptionForNoOfClassesPerRoom.ExceptionForNoOfDepartMentPerRoomBase;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Martins
 */
public class FPOEMS_DataManager extends Application {
   static  Stage primaryStage;
    @Override
    public void start(Stage primaryStagess) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
       primaryStage = new Stage();
        
        Scene scene = new Scene(new FPOEMSDataManagerLayout());
        
        primaryStage.setTitle("FPOEMS DataManager");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        Stage myExceptionStage= new Stage();
        ExceptionForNoOfDepartMentPerRoomBase.exceptionStageMaker(myExceptionStage, primaryStage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
     public static Stage getPrimaryStage(){
    
    return primaryStage;
    }
}
