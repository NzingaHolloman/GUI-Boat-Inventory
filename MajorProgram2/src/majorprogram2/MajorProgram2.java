/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import static javafx.scene.input.KeyCode.T;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.event.*;

import javafx.geometry.Pos;
import javafx.scene.layout.*;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ListView.EditEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




/**
 *
 * @author nzing
 */
public class MajorProgram2 extends Application {

    /**
     * @param args the command line arguments
     */
    private ObservableList<String> seasonList;
    TextArea logging;
    private String FN;
    private String File;
    private Label fileName = null;
    private GridPane gridPaneNull = new GridPane();
    private GridPane gridPane = new GridPane();
    private GridPane gridPane2 = new GridPane();
    private GridPane gridPane3 = new GridPane();
    private GridPane gridPane4 = new GridPane();
    private GridPane gridPane5 = new GridPane();
    private TextField outputField = null;
    private Label label=null;
    private BorderPane bPane = new BorderPane(); 
    private final TextField boatInfo = new TextField();
    private final TextField line2 = new TextField();
    private final TextField line3 = new TextField();
    private final TextField line4 = new TextField();
    private final TextField engineInfo = new TextField();
    
    private Label boat = new Label("Enter boat info:");
    private Label label2 = new Label("Enter line 2:");
    private Label label3 = new Label("Enter line 3:");
    private Label label4 = new Label("Enter line 4:");
    private Label engine = new Label("Enter engine info:");
    
    
    @Override
    public void start(Stage stage){
        try { 
            logging = new TextArea();
            logging.setMaxWidth(90000);
            logging.setMaxHeight(90000);
            // set title for the stage 
            stage.setTitle("Boat Viewer"); 
  
            // create a VBox 
            VBox vbox = new VBox(50); 
            HBox hbox = new HBox(50);
            hbox.setAlignment(Pos.CENTER);
            seasonList = FXCollections.<String>observableArrayList();
            ListView<String> boats = new ListView<>(seasonList);
            boats.setPrefSize(10000, 10000);
            // create a label 
            label = new Label(FN); //this is where the dock totel will go
            Button load = new Button("Load Dock Info");
            Button save = new Button("Save Dock Info");
            Button MPB = new Button("Add ManPoweredBoat");
            Button SB = new Button("Add SailBoat");
            Button MB = new Button("Add MotorBoat");
            Button enterMPB = new Button("Enter");
            Button enterSB = new Button("Enter");
            Button enterMB = new Button("Enter");
            hbox.getChildren().addAll(load, save);
            Dock testing = new Dock();
            
            boatInfo.setPrefColumnCount(20);
            boatInfo.setEditable(true);
            boatInfo.setText("");
            
            line2.setPrefColumnCount(20);
            line2.setEditable(true);
            line2.setText("");
            
            line3.setPrefColumnCount(20);
            line3.setEditable(true);
            line3.setText("");
            
            line4.setPrefColumnCount(20);
            line4.setEditable(true);
            line4.setText("");
            
            engineInfo.setPrefColumnCount(20);
            engineInfo.setEditable(true);
            engineInfo.setText("");
                
            // add label to vbox 
            vbox.getChildren().add(label); 
            
            gridPane.add(MPB,0,1);
            gridPane.add(SB,0,2);
            gridPane.add(MB,0,3);
            
            gridPane.setAlignment(Pos.TOP_LEFT);
            gridPane.setHgap(20);
            gridPane.setVgap(15);
  
            
            load.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                JFileChooser j = new JFileChooser("C:"); 
                j.showSaveDialog(null); 
                File=j.getSelectedFile().getName();
                
                testing.readBoatData(File);
                FN = testing.getDockName();
                
                seasonList = FXCollections.<String>observableArrayList();
                testing.getBoats().forEach((printBoats) -> {
                    seasonList.add(printBoats.toString());
                    //seasonList = FXCollections.<String>observableArrayList();
                });
                ListView<String> boats = new ListView<>(seasonList);
                //listView.prefHeightProperty().bind(Bindings.size(itemListProperty).multiply(LIST_CELL_HEIGHT));
                boats.setPrefSize(300, 1500);
                vbox.getChildren().addAll(boats);
                label = new Label(FN);
                gridPane.add(label,0,0);
                gridPane2.add(boats, 0, 0, 300, 150);
                bPane.setCenter(gridPane2);
            }});
            
            
            label = new Label(FN);
            gridPane.add(label,0,0);
            //this is for the save botton
            save.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    try {
                        PrintWriter write = new PrintWriter(File);
                        write.println(FN);
                        for(String p : seasonList){
                            write.println(p);
                        }
                        //write.print(seasonList);
                        write.close();
                    
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(MajorProgram2.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   System.out.println();
                for(String p : seasonList){
                    System.out.println(p);
                }
                System.out.print(File);
                }
            });
            
            
            
            MPB.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event1) {
                    
                    gridPane5.getChildren().clear();
                    gridPane5.add(boat,1,1);
                    gridPane5.add(boatInfo, 2, 1);
                    gridPane5.add(enterMPB, 2, 6);
                    bPane.setRight(gridPane5);
                }
            });
            enterMPB.setOnAction((ActionEvent event2) -> {
                
                String f = boatInfo.getText();
                bPane.setRight(null);
                seasonList.add(f);
                ListView<String> boats1 = new ListView<>(seasonList);
                //listView.prefHeightProperty().bind(Bindings.size(itemListProperty).multiply(LIST_CELL_HEIGHT));
                boats1.setPrefSize(300, 1500);
                vbox.getChildren().addAll(boats1);
                gridPane2.add(boats1, 0, 0, 300, 150);
                
                bPane.setCenter(gridPane2);
            });
            
            SB.setOnAction((ActionEvent event3) -> {
                bPane.setRight(null);
                gridPane5.getChildren().clear();
                gridPane5.add(boat,1,1);
                gridPane5.add(boatInfo, 2, 1);
                gridPane5.add(label2,1,2);
                gridPane5.add(line2, 2, 2);
                gridPane5.add(label3,1,3);
                gridPane5.add(line3, 2, 3);
                gridPane5.add(label4,1,4);
                gridPane5.add(line4, 2, 4);
                gridPane5.add(engine,1,5);
                gridPane5.add(engineInfo, 2, 5);
                gridPane5.add(enterSB, 2, 6);
                bPane.setRight(gridPane5);
            });
            enterSB.setOnAction((ActionEvent event4) -> {
                String f = boatInfo.getText()+"\n"+ line2.getText()+"\n"+ line3.getText()+"\n"+ line4.getText()+"\n"+ engineInfo.getText() ;
                if(line2.getText().equals(""))
                    f = boatInfo.getText();
                seasonList.add(f);
                ListView<String> boats1 = new ListView<>(seasonList);
                boats1.setPrefSize(300, 1500);
                vbox.getChildren().addAll(boats1);
                gridPane2.add(boats1, 0, 0, 300, 150);
                boatInfo.setText(null);
                line2.setText("");
                line3.setText("");
                line4.setText("");
                engineInfo.setText("");
                bPane.setRight(null);
                bPane.setCenter(gridPane2);
            });
            
            gridPane5.add(enterMB, 2, 6);
            MB.setOnAction((ActionEvent event5) -> {
                bPane.setRight(null);
                
                gridPane5.getChildren().clear();
                gridPane5.add(boat,1,1);
                gridPane5.add(boatInfo, 2, 1);
                gridPane5.add(label2,1,2);
                gridPane5.add(line2, 2, 2);
                gridPane5.add(label3,1,3);
                gridPane5.add(line3, 2, 3);
                gridPane5.add(label4,1,4);
                gridPane5.add(line4, 2, 4);
                gridPane5.add(engine,1,5);
                gridPane5.add(engineInfo, 2, 5);
                gridPane5.add(enterMB, 2, 6);
                bPane.setRight(gridPane5);
            });
            enterMB.setOnAction((ActionEvent event6) -> {
                String f = boatInfo.getText()+"\n"+ line2.getText()+"\n"+ line3.getText()+"\n"+ line4.getText()+"\n"+ engineInfo.getText() ;
                if(line2.getText().equals(""))
                    f = boatInfo.getText();
                //String f = boatInfo.getText()+"\n"+ line2.getText()+"\n"+ line3.getText()+"\n"+ line4.getText()+"\n"+ engineInfo.getText() ;
                seasonList.add(f);
                ListView<String> boats1 = new ListView<>(seasonList);
                boats1.setPrefSize(300, 1500);
                vbox.getChildren().addAll(boats1);
                gridPane2.add(boats1, 0, 0, 300, 150);
                boatInfo.setText("");
                line2.setText("");
                line3.setText("");
                line4.setText("");
                engineInfo.setText("");
                bPane.setRight(null);
                bPane.setCenter(gridPane2);
            });
            bPane.setLeft(gridPane);
            bPane.setBottom(hbox);
            // create a scene 
            //Scene scene = new Scene(vbox, 300, 300); 
            Scene scene = new Scene(bPane);
  
            // set the scene 
            stage.setScene(scene); 
  
            stage.show(); 
        }   
        catch (Exception e) { 
  
            System.out.println(e.getMessage()); 
        } 
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here\
        
        launch(args);
        
        
    }
}