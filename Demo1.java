
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Demo1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
    // 1. creating controls 
    Label l1 = new Label("Enter your name:  ");
    Label l2 = new Label ("Enter your age:  ");
    Label l3 = new Label();
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    Button b1 = new Button("Submit");    
    
    // event handler for button - anonymous Inner class
   /* b1.setOnAction(new EventHandler<ActionEvent>() { //Event Handling
    @Override
    public void handle(ActionEvent event) {
    l3.setText("Your Name is  " + t1.getText() + "    And your age is   " + t2.getText());
    l3.setTextFill(Color.RED);    
     }    
    }); */
    // Event handling - lambda expression 
    b1.setOnAction( e -> { 
    l3.setText("Your Name is  " + t1.getText() + "    And your age is   " + t2.getText());
    l3.setTextFill(Color.RED);        
     } );

    // 2. creating a layout and adding controls to that
    GridPane root = new GridPane();
    root.add(l1, 0, 0);
    root.add(t1, 1, 0);
    root.add(l2, 0,1 );
    root.add(t2, 1, 1);
    root.add(b1, 0, 2);
    root.add(l3, 0, 3, 2, 1);
    root.setHgap(25);
    root.setVgap(25);

    // 3. creating a scene
    Scene sc = new Scene(root, 500, 500);
    //4.  adding the scene to stage
    primaryStage.setScene(sc); 
    //5. showing the stage
    primaryStage.show();

    }
}
    