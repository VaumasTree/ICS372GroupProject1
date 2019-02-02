/*
 * Eric Vaughn
 * TODO need a text field to have the user enter a file path in to get to the needed JSON File (Should also have a File Browser Button).
 * once the file is chosen, selecting the "READ" Button should be able to read the file, from json, into the program. Once the file is completed, should be able to look
 * 
 */

package edu.metrostate.ics372groupproject1.scientificDataCollectionApp;

import java.util.HashSet;
import java.util.Set;

import javafx.application.*;
import javafx.collections.*; // ObservableList, FXCollections
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.beans.value.*;

public class ScientificDataCollectionApp extends Application {

	TextField tf;
	Button getFileButton;
	Label response;
	static Set<Site> sites;
	
	
	public static void main(String[] args) {
	  sites = new HashSet<Site>();
	  launch(args);
	}

	@Override
	public void init() {
		System.out.println("Inside init()");
	}
	
	@Override
	public void start(Stage myStage){
		System.out.println("Inside start()");
		myStage.setTitle("Scinetific Data Collection Application");
		
		BorderPane rootNode = new BorderPane();
		VBox lists  = new VBox(10);
		HBox fileEntry = new HBox(10);
		
		//NO...rootNode.getChildren().addAll(lists, fileEntry);
		
		rootNode.setTop(fileEntry);
		rootNode.setCenter(lists);
		
		tf = new TextField();
		tf.setPromptText("Enter path to JSON file");
		getFileButton = new Button("Import JSON");
		
		fileEntry.getChildren().addAll(tf, getFileButton);
		
		
		Scene myScene = new Scene(rootNode, 700, 400);
		myStage.setScene(myScene);
		
		response = new Label("Select Sites:");
		/*
		ObservableList<String> computerTypes = FXCollections.observableArrayList("Smartphone", "Tablet", "Notebook", "Desktop");
		ListView<String> lv_computerTypes = new ListView<String>(computerTypes);
		lv_computerTypes.setPrefSize(100, 70);
		MultipleSelectionModel<String> msm_lv_computerTypes = lv_computerTypes.getSelectionModel();
		
		msm_lv_computerTypes.selectedItemProperty().addListener(new ChangeListener<String>() {
				public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {
					response.setText("Computer Selected is " + newVal);
				}
		});
		
		rootNode.getChildren().addAll(lv_computerTypes, response);
		*/
		myStage.show();
	}
	
	@Override
	public void stop() {
		System.out.println("Inside stop()");
	}
	
}
