/*Question: Create a JavaFX Program that displays a toString version of a linked list for strings or integers, with the capability of adding, removing, and clearing the list. 
For example: if it is linked list of integers 1 through 4, it should be displayed as 1 -> 2 -> 3-> 4-> null. if it is a linked list of strings alpha, bravo, charlie delta, it should be displayed as alpha -> bravo -> charlie -> delta -> null
Add the following buttons:
ADD - that adds an item to the end of the linked list. For this, you will need a text input as well to get the value from the user
REMOVE - that removes an item from the front of the linked list.
CLEAR - that clears the linked list.
The linked list being displayed should be updated in real-time. Include proper exception handling as well where you think necessary.*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.*;

public class LLDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
	protected TextField textField = new TextField();
	protected TextArea textArea = new TextArea();

    // To create an empty linked list
	protected LinkedList<Integer> list = new LinkedList<Integer>();

	@Override // to Override the start() in the Application class
	public void start(Stage primaryStage) {
		// Create three buttons
		Button btAdd = new Button("ADD");
		Button btRemove = new Button("REMOVE");
		Button btClear = new Button("CLEAR");
       
		// To Create a pane to hold the textfield only
		HBox paneForTextField = new HBox(10);
		paneForTextField.getChildren().addAll(
			new Label("Enter an Integer to the List:"), textField);
		paneForTextField.setAlignment(Pos.CENTER);

		// To Create a pane to hold all the buttons
		HBox paneForButtons = new HBox(5);
		paneForButtons.getChildren().addAll(
			btAdd, btRemove, btClear);
		paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setSpacing(20);

		// To Set text area editable and to wrap text 
		textArea.setEditable(false);
		textArea.setWrapText(true);

		// To Create a border pane and add all the nodes to it
		BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(10, 20, 10, 20));
		pane.setTop(paneForTextField);
		pane.setCenter(textArea);
		pane.setBottom(paneForButtons);

		// To Create and register handles
		//textField.setOnAction(e -> add()); // Enter an integer 

		
		btAdd.setOnAction(e ->add());  // to add integer node
		
		btRemove.setOnAction(e ->remove()); // to remove integer node
			
		btClear.setOnAction(e -> clear()); // to clear the linked list
	

		// To Create a Scene and place in the stage
		Scene scene = new Scene(pane, 500, 350); // Scene with pane
		primaryStage.setTitle("Linked List Operations - Add, Remove and Clear"); // Set the stage title
		primaryStage.setScene(scene); // to place a scene in the stage
		primaryStage.show(); // to display the stage
	}

	/** to add an integer node to the end of the list */
	private void add() {
        try{
		list.addLast(Integer.parseInt(textField.getText()));
        }
        catch(NumberFormatException e ){
            System.err.println(e);
        }
		displayText();
	}

    /** to add an integer node to the end of the list */
	private void remove() {

		list.removeFirst();
        
		displayText();
	}

    /** to add an integer node to the end of the list */
	private void clear() {
        
		list.clear();
		displayText();
	}

	/** to display elements in the list in the text area */
	private void displayText() {
        String output = "";
        if(list.isEmpty()){
		output = "";
        }
        else{
		for (Integer e: list)
			output += e + "->";
        output=output.concat("null");
        }

		textArea.setText(output);    
		textField.setText("");
	}
}

