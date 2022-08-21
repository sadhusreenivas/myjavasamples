import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExerciseApp extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        
        Parent root = FXMLLoader.load(getClass().getResource("Exercise4.fxml"));
        //Scene sc=new Scene(root,400,350);
        Scene sc=new Scene(root);
       
       
        root.setStyle("-fx-background-color: BEIGE;"); 

        primaryStage.setScene(sc);
        primaryStage.setTitle("Book Inventory - Class Exercise!");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
