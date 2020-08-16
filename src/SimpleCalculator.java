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
import javafx.geometry.*;

public class SimpleCalculator extends Application {
	
	Label response;
	/**
	 * This coding block is in charge of running the actual program
	 * @param args argument needed to run the program
	 */
	public static void main(String[] args) {
		System.out.println("launching javafx.");
		launch(args);

	}

	/**
	 * Method for initializing the program. Will have a console message to make sure that it works
	 */
	public void init() {
		System.out.println("calling the init method.");
	}
	
	/**
	 * Method for starting the program. Will have a console message to make sure that it works
	 * It has all the main components and buttons of the program that will display
	 * to the screen.
	 */
	public void start(Stage myStage) {
		myStage.setTitle("Simple Calculator");
		FlowPane rootNode = new FlowPane(20, 20);
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootNode, 450, 330);
		myStage.setScene(myScene);
		
		//set up the textfields
		TextField first = new TextField();
		TextField second = new TextField();
		TextField sum = new TextField();
		
		//set up the labels & response when the button is pushed
		Label firstValue = new Label("First Val:");
		Label secondValue = new Label("Second Val:");
		Label sumIs = new Label("Sum:");
		response = new Label("");
		
		//set the field and text next to each other
		firstValue.setLabelFor(first);
		secondValue.setLabelFor(second);
		sumIs.setLabelFor(sum);
		
		//setting up the buttons for the window
		Button calculate = new Button("Calculate");
		
		//handles the action events for the button being pushed
		calculate.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				response.setText("Button was pressed");
			}
		});
		
		//set up the Grid layout
		GridPane root = new GridPane();
		root.addRow(0, firstValue, first);
		root.addRow(1, secondValue, second);
		root.addRow(2, sumIs, sum);
		root.addRow(3, calculate);
		root.setMinSize(200, 200);
		
		
		//add the label and buttons to the scene graph via the parent node
		rootNode.getChildren().addAll(root, response);
		
		//display the window and the label
		myStage.show();
	}
	
	/**
	 * Method for ending the program. Console method will print to make sure that it is working.
	 * Only runs when the program is quit.
	 */
	public void stop() {
		System.out.println("calling the stop method.");
	}

}
