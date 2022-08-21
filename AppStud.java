import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class AppStud extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("StudentFXML.fxml"));
        //Scene sc=new Scene(root,400,350);
        Scene sc=new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Event Handling Example!!!");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

