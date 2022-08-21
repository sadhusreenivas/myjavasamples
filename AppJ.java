import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppJ extends Application {

    public static void main(String[] args){
        launch(args);   
    
    }

    public void start(Stage primaryStage) throws IOException {
        
        //loading fxml document
        Parent root = FXMLLoader.load(getClass().getResource("MCQ.fxml"));
        
        // scene for the gui
        Scene scene = new Scene(root);
        
        // setting up the stage and title
        primaryStage.setScene(scene);
        
        // title
        primaryStage.setTitle("Jeopardy Project");
        primaryStage.show();
    }
}