/**
 * Allison Snipes
 * Course 605.201.81 Summer 2020
 * Assignment 12 Question 1
 * 
 *  Project Specs:
 *  This assignment involves building a GUI interface for a simple calculator using Java FX. The calculator
 *  shall be designed to allow the user to enter two values and then calculate their sum when the user clicks
 *  on the add button. For purposes of this assignment, the calculate functionality should not be implemented.
 *  Only implement the interface components. The GUI should look similar to the one below. You can left justify,
 *  center, or right justify the calculate button.
 *  
 *  @author Allison Snipes
 *  @version 1.0 
 */

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.Scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.Stage.*;
import javafx.scene.control.*;

public class SimpleCalculator extends Application {
	
	Label response;
	
	public static void main(String[] args) {
		System.out.println("launching javafx.");
		launch(args);

	}

	public void init() {
		System.out.println("calling the init method.");
	}
	
	public void start(Stage myStage) {
		myStage.setTitle("Simple Calculator");
		FlowPane rootNode = new FlowPane();
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootNode, 450, 330);
		myStage.setScene(myScene);
		
		//set up response for label when the button event executes
		response = new Label("button pushed :)");
		
		//set up the labels
		Label firstValue = new Label("First Value:");
		Label secondValue = new Label("Second Value:");
		Label sumIs = new Label("Sum is:");
		
		//setting up the buttons for the window
		Button calculate = new Button("Calculate");
		
		//handles the action events for the button being pushed
		calculate.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				response.setText("Button was pressed");
			}
		});
		
		//add the label and buttons to the scene graph via the parent node
		rootNode.getChildren().addAll(firstValue, secondValue, sumIs, calculate, response);
		
		//display the window and the label
		myStage.show();
		
		
	}
	
	public void stop() {
		System.out.println("calling the stop method.");
	}

}
