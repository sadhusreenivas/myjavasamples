import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MouseDemo extends Application{
    public static void main(String[] args) {
        launch(args); // starting point for JavaFX
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       // creating controls
        Label lbl1=new Label("This text is for mouse for click....!!");
        Label lbl2=new Label();
        // creating layout
        VBox root=new VBox();
        // adding contrils to the layout
        root.getChildren().addAll(lbl1,lbl2);

        lbl1.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
               lbl2.setText("You clicked the Mouse");
            }
            });        

        // creatig Scene and addig layout to the scene
        Scene sc=new Scene(root, 400, 400);
       // adding scene to the satge
       primaryStage.setScene(sc);
       //show the stage
       primaryStage.show();

    }
    
}
