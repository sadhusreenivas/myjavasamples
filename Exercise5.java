import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise5 extends Application {
    //declaration of all the controls
    Label lblStart;
    Label lblEnd;
    TextField txtStart;
    TextField txtEnd;
    TextArea taResult;   
    Button displayBtn;
    Button clearBtn;
    Button exitBtn;
    
    public void start(Stage primaryStage) throws Exception {
        // creating all the controls of GUI
        lblStart = new Label("Enter start value:");
        lblEnd = new Label("Enter end value");

        txtStart = new TextField();
        txtEnd = new TextField(); 

        taResult = new TextArea();

         displayBtn = new Button("DISPLAY");
         clearBtn = new Button("CLEAR");
         exitBtn = new Button("EXIT");

        //creating Grid Layout
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: BEIGE;");
        //adding controls to grid layout
        root.add(lblStart,0,0,2,1);
        root.add(txtStart,2,0,2,1);

        root.add(lblEnd,0,1,2,1);
        root.add(txtEnd,2,1,2,1);
       
        root.add(taResult,0,2,4,12);
 
        root.add(displayBtn,1,15);
        root.add(clearBtn,2,15);
        root.add(exitBtn,3,15);
        
        root.setVgap(8);
        root.setHgap(10);

        Alert a = new Alert(AlertType.CONFIRMATION);
        Alert b = new Alert(AlertType.ERROR);

        displayBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;"); 
        clearBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");   
        exitBtn.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");       
        
        lblStart.setStyle("-fx-font-weight: bold; -fx-text-fill: red;");
        lblEnd.setStyle("-fx-font-weight: bold; -fx-text-fill: red;");

    // Temperature conversion - event handling with lambda expression
    displayBtn.setOnAction(e ->{
    int startValue = 0;
    int endValue = 0;
    // Getting data and validating TextFileds with dialogbox
    try{

    startValue = Integer.parseInt(txtStart.getText());
    endValue = Integer.parseInt(txtEnd.getText());

    }catch(NumberFormatException exception){
        System.out.println("Please enter digits only!");
         b.setAlertType(AlertType.ERROR);
         b.setContentText("Please enter Quantity in digits only");
         b.show();
    }

    double fht = 0.0;
    taResult.setText("Celsius \t\t\t Fahrenheit");
    taResult.appendText("\n------------------------\n");

    for(int i=startValue; i<=endValue; i++){
    double cel = (double) i;
    fht = (cel * 9 / 5) + 32;
    taResult.appendText(""+cel+"\t\t\t\t"+fht+"\n");
    }

    });

    // To clear the GUI
    clearBtn.setOnAction(e ->{
    taResult.setText("");
    txtStart.setText("");
    txtEnd.setText("");
    });

    // To exit from application
    exitBtn.setOnAction(e ->{
    a.setAlertType(AlertType.CONFIRMATION);
    a.setContentText("Are you sure to Exit");
    a.show();
    primaryStage.close();
    });

        //creating scene and adding layout
        Scene sc = new Scene(root,360,460);
        // adding scene to the stage
        primaryStage.setScene(sc);
        primaryStage.setTitle("Exercise 5");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}